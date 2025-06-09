package com.irontom10.item.speical;


import com.irontom10.block.ModBlocks;
import com.irontom10.item.ModCreativeModeTabs;
import net.minecraft.core.BlockPos;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

import net.minecraft.world.entity.player.Player;

public class MinersDream extends Item {
    private static final int HEIGHT        = 5;
    private static final int WIDTH         = 5;
    private static final int LENGTH        = 64;
    private static final int TORCH_INTERVAL = 5;

    public MinersDream(Properties props) {
        super(props.stacksTo(16)
                .fireResistant()
                .arch$tab(ModCreativeModeTabs.FREESPAWN_TAB)  // Use your mod's creative tab
        );
    }

    @Override
    public InteractionResult useOn(UseOnContext ctx) {
        Level world  = ctx.getLevel();
        BlockPos hit = ctx.getClickedPos();
        Player player= ctx.getPlayer();
        ItemStack stack = ctx.getItemInHand();

        // Determine direction: must be purely along X or Z
        BlockPos ppos = player.blockPosition();
        int dx = Integer.signum(hit.getX() - ppos.getX());
        int dz = Integer.signum(hit.getZ() - ppos.getZ());
        if ((dx == 0) == (dz == 0)) {
            return InteractionResult.PASS;
        }

        // Play explosion sound
        world.playSound(null, hit, SoundEvents.GENERIC_EXPLODE, SoundSource.PLAYERS, 1.0F, 1.5F);

        // Client only: skip logic
        if (world.isClientSide) {
            return InteractionResult.SUCCESS;
        }

        int baseX = hit.getX();
        int baseY = ppos.getY();
        int baseZ = hit.getZ();

        // Carve out the tunnel
        for (int yOff = 0; yOff < HEIGHT; yOff++) {
            for (int k = 0; k < LENGTH; k++) {
                int solidCount = 0;
                for (int j = -WIDTH; j <= WIDTH; j++) {
                    int x = baseX + k*dx + j*dz;
                    int y = baseY + yOff;
                    int z = baseZ + k*dz + j*dx;
                    BlockPos pos = new BlockPos(x, y, z);
                    Block block = world.getBlockState(pos).getBlock();

                    // Remove basic blocks
                    if (block == Blocks.STONE
                            || block == Blocks.ANDESITE
                            || block == Blocks.DIORITE
                            || block == Blocks.GRANITE
                            || block == Blocks.DEEPSLATE
                            || block == Blocks.COBBLED_DEEPSLATE
                            || block == Blocks.POLISHED_DEEPSLATE
                            || block == Blocks.DEEPSLATE_BRICKS
                            || block == Blocks.DEEPSLATE_TILES
                            || block == Blocks.CRACKED_DEEPSLATE_BRICKS
                            || block == Blocks.TUFF
                            || block == Blocks.CALCITE
                            || block == Blocks.DIRT
                            || block == Blocks.GRAVEL
                            || block == Blocks.WATER
                            || block == Blocks.LAVA
                            || block == Blocks.NETHERRACK
                            || block == Blocks.END_STONE
                            || block == ModBlocks.CRYSTAL_STONE
                            || block == Blocks.DRIPSTONE_BLOCK) {

                        world.setBlockAndUpdate(pos, Blocks.AIR.defaultBlockState());
                    }

                    // On ceiling row, count solids and replace ceiling
                    if (yOff == HEIGHT-1) {
                        BlockPos above = pos.above();
                        BlockState st = world.getBlockState(above);
                        Block b2 = st.getBlock();
                        if (b2 != Blocks.AIR) solidCount++;
                        // replace if air or loose
                        if (b2 == Blocks.AIR
                                || b2 == Blocks.GRAVEL
                                || b2 == Blocks.SAND
                                || b2 == Blocks.WATER
                                || b2 == Blocks.LAVA) {
                            // dimension check: if your world key equals your custom dimension
                            if (world.dimension() == Level.OVERWORLD /* replace with your dimension key */) {
                                world.setBlockAndUpdate(above, Blocks.COBBLESTONE.defaultBlockState());
                            } else {
                                world.setBlockAndUpdate(above, ModBlocks.CRYSTAL_STONE.get().defaultBlockState());
                            }
                        }
                    }
                }
                // If ceiling row had no solids, clear one block of air above
                if (yOff == HEIGHT-1 && solidCount == 0) {
                    for (int j = -WIDTH; j <= WIDTH; j++) {
                        BlockPos airPos = new BlockPos(
                                baseX + k*dx + j*dz,
                                baseY + yOff + 1,
                                baseZ + k*dz + j*dx
                        );
                        world.setBlockAndUpdate(airPos, Blocks.AIR.defaultBlockState());
                    }
                }
            }
        }

        // Place torches every TORCH_INTERVAL
        for (int k = 0; k < LENGTH; k += TORCH_INTERVAL) {
            int x = baseX + k*dx, y = baseY-1, z = baseZ + k*dz;
            BlockPos floor = new BlockPos(x,y,z);
            Block b = world.getBlockState(floor).getBlock();
            BlockPos torchPos = floor.above();
            if ((b == Blocks.STONE
                    || b == Blocks.ANDESITE
                    || b == Blocks.DIORITE
                    || b == Blocks.GRANITE
                    || b == Blocks.DEEPSLATE
                    || b == Blocks.COBBLED_DEEPSLATE
                    || b == Blocks.POLISHED_DEEPSLATE
                    || b == Blocks.DEEPSLATE_BRICKS
                    || b == Blocks.DEEPSLATE_TILES
                    || b == Blocks.CRACKED_DEEPSLATE_BRICKS
                    || b == Blocks.TUFF
                    || b == Blocks.CALCITE
                    || b == Blocks.DIRT
                    || b == Blocks.GRAVEL
                    || b == Blocks.WATER
                    || b == Blocks.LAVA
                    || b == Blocks.NETHERRACK
                    || b == Blocks.END_STONE
                    || b == ModBlocks.CRYSTAL_STONE
                    || b == Blocks.DRIPSTONE_BLOCK)
                    && world.isEmptyBlock(torchPos)) {
                world.setBlockAndUpdate(torchPos, ModBlocks.EXTREME_TORCH.get().defaultBlockState());
            }
            if (b == ModBlocks.CRYSTAL_STONE
                    && world.isEmptyBlock(torchPos)) {
                world.setBlockAndUpdate(torchPos, ModBlocks.CRYSTAL_TORCH.get().defaultBlockState());
            }
        }

        // Consume one unless in Creative
        if (!player.isCreative()) {
            stack.shrink(1);
        }

        return InteractionResult.SUCCESS;
    }
}
