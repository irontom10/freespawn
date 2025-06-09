package com.irontom10.item;


import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import static com.irontom10.FreespawnMod.MOD_ID;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(MOD_ID, Registries.CREATIVE_MODE_TAB);

    public static final RegistrySupplier<CreativeModeTab> FREESPAWN_TAB =
            CREATIVE_MODE_TABS.register("freespawn", () ->
                    CreativeModeTab.builder(
                                    CreativeModeTab.Row.BOTTOM,   // choose TOP, BOTTOM or INVENTORY
                                    0             // column index within that row
                            )
                            .title(Component.literal("Freespawn"))                   // your tab’s title
                            .icon(() -> new ItemStack(ModItems.URANIUM_INGOT.get()))// icon stack
                            .displayItems((params, output) -> {
                                ModItems.ITEMS.forEach(supplier ->
                                        output.accept(supplier.get().getDefaultInstance())
                                );
                            })
                            .build()
            );

    public static void register() {
        CREATIVE_MODE_TABS.register();
    }
}
