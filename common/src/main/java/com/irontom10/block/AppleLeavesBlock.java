package com.irontom10.block;

import com.irontom10.item.ModItems;

import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LeavesBlock;

import java.util.Random;

public class AppleLeavesBlock extends LeavesBlock {
    public AppleLeavesBlock() {
        super(BlockBehaviour.Properties
                .of()
                .strength(0.2F)
                .sound(SoundType.GRASS)
                .noOcclusion()
                .offsetType(BlockBehaviour.OffsetType.XYZ)
                .dynamicShape()          // needed for offset leaves
        );
    }

    // 1) Random‐tick drops (when leaves naturally decay)
    @Override
    public void randomTick(BlockState state, ServerLevel world, BlockPos pos, RandomSource rand) {
        super.randomTick(state, world, pos, rand);

        // only drop on non-persistent leaves
        if (!state.getValue(BlockStateProperties.PERSISTENT)) {
            if (rand.nextInt(25) == 0) popResource(world, pos, new ItemStack(Items.APPLE));
            if (rand.nextInt(500) == 0) popResource(world, pos, new ItemStack(Items.GOLDEN_APPLE));
            if (rand.nextInt(1000) == 0)
                popResource(world, pos, new ItemStack(Items.ENCHANTED_GOLDEN_APPLE));
            if (rand.nextInt(10000) == 0)
                popResource(world, pos, new ItemStack(ModItems.CRYSTAL_APPLE.get()));
        }
    }

    // 2) Immediate drops when player breaks the leaf
    @Override
    public void playerDestroy(Level world, Player player, BlockPos pos, BlockState state,
                              net.minecraft.world.level.block.entity.BlockEntity te,
                              ItemStack tool) {
        super.playerDestroy(world, player, pos, state, te, tool);

        // only on server side
        if (!world.isClientSide) {
            RandomSource rand = world.getRandom();
            if (rand.nextInt(25) == 0) popResource(world, pos, new ItemStack(Items.APPLE));
        }
    }
}
