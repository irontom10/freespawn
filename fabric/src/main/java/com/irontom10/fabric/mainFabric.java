package com.irontom10.fabric;

import net.fabricmc.api.ModInitializer;

import com.irontom10.fabriclike.mainFabricLike;

public final class mainFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        // Run the Fabric-like setup.
        mainFabricLike.init();
    }
}
