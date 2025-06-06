package com.irontom10;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.*;
import com.irontom10.ModItems;

public final class main {
    public static final String MOD_ID = "freespawn";
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MOD_ID, Registries.ITEM);

    public static void init() {
        ITEMS.register();
        ModItems.register();
        // Write common init code here.
    }
}
