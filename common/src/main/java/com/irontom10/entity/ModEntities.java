package com.irontom10.entity;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

import java.util.function.Supplier;

import static com.irontom10.main.MOD_ID;

public class ModEntities {
public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(MOD_ID, Registries.ENTITY_TYPE);
public static RegistrySupplier<EntityType<CoinEntity>> COIN;
public static void initEntityTypes(){
    COIN = registerEntityType("coin", () -> EntityType.Builder.of(CoinEntity::new, MobCategory.MISC)
            .sized(1,1)
            .build()
    );

    ENTITIES.register();;
}
private static <T extends Entity> RegistrySupplier<EntityType<T>> registerEntityType(String name, Supplier<EntityType<T>> entityType){
    return ENTITIES.register(MOD_ID,entityType);
}
}
