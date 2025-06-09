package com.irontom10.item.special;

import com.irontom10.world.SeedTreeBuilder;
import com.irontom10.block.ModBlocks;
import com.irontom10.item.ModCreativeModeTabs;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;

public class CherrySeed extends Item {
    public CherrySeed(Properties props) {
        super(props.stacksTo(16)
                .arch$tab(ModCreativeModeTabs.FREESPAWN_TAB)
        );
    }

    @Override
    public InteractionResult useOn(UseOnContext ctx) {
        Level world  = ctx.getLevel();
        BlockPos pos = ctx.getClickedPos();
        Player player= ctx.getPlayer();
        ItemStack stack = ctx.getItemInHand();

        if (world.isClientSide) {
            return InteractionResult.SUCCESS;
        }

        var ground = world.getBlockState(pos).getBlock();
        if (ground != Blocks.GRASS_BLOCK && ground != Blocks.DIRT && ground != Blocks.FARMLAND) {
            return InteractionResult.FAIL;
        }

        world.playSound(null,
                pos.getX(), pos.getY(), pos.getZ(),
                SoundEvents.GRASS_PLACE,
                SoundSource.PLAYERS,
                1.0F, 1.0F
        );

        SeedTreeBuilder.generateTree(world, pos.above(), ModBlocks.CHERRY_LEAVES.get());

        if (!player.isCreative()) {
            stack.shrink(1);
        }
        return InteractionResult.CONSUME;
    }
}
