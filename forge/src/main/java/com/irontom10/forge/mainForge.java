package com.irontom10.forge;

import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import com.irontom10.main;

@Mod(main.MOD_ID)
public final class mainForge {
    public mainForge() {
        // Submit our event bus to let Architectury API register our content on the right time.
        EventBuses.registerModEventBus(main.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());

        // Run our common setup.
        main.init();
    }
}
