package com.irontom10.entity;

import com.irontom10.FreespawnMod;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.level.levelgen.Heightmap;

public class ModEntities {
    private static final DeferredRegister<EntityType<?>> ENTITIES =
            DeferredRegister.create(FreespawnMod.MOD_ID, Registries.ENTITY_TYPE);


    public static void register() {
        ENTITIES.register();
    }

    /** Call during common setup after `register()` */
    public static final RegistrySupplier<EntityType<BeeEntity>> BEE =
            ENTITIES.register("bee", () ->
                    EntityType.Builder
                            .of(BeeEntity::new, MobCategory.MONSTER)
                            .sized(1.5f, 2.5f)
                            .clientTrackingRange(10)
                            .build(new ResourceLocation(FreespawnMod.MOD_ID, "bee").toString())
            );

    /** Call during common setup after `register()` */
p
}
