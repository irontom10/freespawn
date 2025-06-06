package com.irontom10;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;

public final class main {
    public static final String MOD_ID = "freespawn";
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MOD_ID, Registries.ITEM);
    public static final RegistrySupplier<Item> AMETHYST = ITEMS.register("amethyst", () -> new Item(new Item.Properties()));

    public static void init() {
        ITEMS.register();
        // Write common init code here.
    }
}
