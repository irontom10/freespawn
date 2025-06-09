package com.irontom10.block;

import com.irontom10.FreespawnMod;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(FreespawnMod.MOD_ID, net.minecraft.core.registries.Registries.BLOCK);


    // example block
    public static final RegistrySupplier<Block> RUBY_BLOCK = BLOCKS.register("ruby_block",
            () -> new Block(BlockBehaviour.Properties
                    .of()
                    .strength(5.0f, 6.0f)
                    .sound(SoundType.METAL))
    );
    public static final RegistrySupplier<Block> RUBY_ORE = BLOCKS.register("ruby_ore",
            () -> new Block(BlockBehaviour.Properties
                    .of()
                    .strength(3.0f, 4.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE))
    );
    public static final RegistrySupplier<Block> CRYSTAL_STONE = BLOCKS.register("crystal_stone",
            () -> new Block(BlockBehaviour.Properties
                    .of()
                    .strength(1.5f, 2.0f)
                    .sound(SoundType.STONE))
    );
    public static final RegistrySupplier<Block> EXTREME_TORCH = BLOCKS.register("extreme_torch",
            () -> new Block(BlockBehaviour.Properties
                    .of()
                    .strength(0.0f, 0.0f)
                    .noCollission()
                    .lightLevel((state) -> 15)
                    .sound(SoundType.WOOD))
    );
    public static final RegistrySupplier<Block> CRYSTAL_TORCH = BLOCKS.register("crystal_torch",
            () -> new Block(BlockBehaviour.Properties
                    .of()
                    .strength(0.0f, 0.0f)
                    .noCollission()
                    .lightLevel((state) -> 15)
                    .sound(SoundType.STONE))
    );
    public static final RegistrySupplier<Block> APPLE_LEAVES = BLOCKS.register("apple_leaves",
            () -> new AppleLeavesBlock());

    public static final RegistrySupplier<Block> CHERRY_LEAVES = BLOCKS.register("cherry_leaves",
            () -> new Block(BlockBehaviour.Properties
                    .of()    // <— you must specify the Material
                    .strength(0.2F)          // hardness/resistance
                    .sound(SoundType.GRASS)  // grass‐leaf footsteps
                    .lightLevel(state -> 0)  // no light
                    .noOcclusion()           // lets light through
                    .isValidSpawn((state, world, pos, type) -> false)
                    .isSuffocating((state, world, pos) -> false)
                    .isViewBlocking((state, world, pos) -> false)
                    .offsetType(BlockBehaviour.OffsetType.XYZ)
                    .dynamicShape()
                    .friction(0.8F)
            )
    );
    public static final RegistrySupplier<Block> PEACH_LEAVES = BLOCKS.register("peach_leaves",
            () -> new Block(BlockBehaviour.Properties
                    .of()    // <— you must specify the Material
                    .strength(0.2F)          // hardness/resistance
                    .sound(SoundType.GRASS)  // grass‐leaf footsteps
                    .lightLevel(state -> 0)  // no light
                    .noOcclusion()           // lets light through
                    .isValidSpawn((state, world, pos, type) -> false)
                    .isSuffocating((state, world, pos) -> false)
                    .isViewBlocking((state, world, pos) -> false)
                    .offsetType(BlockBehaviour.OffsetType.XYZ)
                    .dynamicShape()
                    .friction(0.8F)
            )
    );


    public static void register() {
        BLOCKS.register();
    }
}
