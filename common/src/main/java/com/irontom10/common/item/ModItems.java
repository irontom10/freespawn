package com.irontom10.common.item;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.client.renderer.block.model.ItemModelGenerator;
import net.minecraft.world.item.*;

import net.minecraft.core.registries.Registries;

public class ModItems {
    public static final String MOD_ID = "freespawn";

    // 1) Create a DeferredRegister for Items
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MOD_ID, Registries.ITEM);
    // Ingredient items
    public static final RegistrySupplier<Item> AMETHYST = ITEMS.register(
            "amethyst",
            () -> new Item(new Item.Properties().arch$tab(CreativeModeTabs.INGREDIENTS))
    );
    public static final RegistrySupplier<Item> EXPERIENCE = ITEMS.register(
            "experience",
            () -> new Item(new Item.Properties().arch$tab(CreativeModeTabs.INGREDIENTS))
    );
    public static final RegistrySupplier<Item> MOTHSCALE = ITEMS.register(
            "mothscale",
            () -> new Item(new Item.Properties().arch$tab(CreativeModeTabs.INGREDIENTS))
    );
    public static final RegistrySupplier<Item> LAVAEEL = ITEMS.register(
            "lavaeel",
            () -> new Item(new Item.Properties().arch$tab(CreativeModeTabs.INGREDIENTS))
    );
    public static final RegistrySupplier<Item> ULTIMATE = ITEMS.register(
            "ultimate",
            () -> new Item(new Item.Properties().arch$tab(CreativeModeTabs.INGREDIENTS))
    );
    public static final RegistrySupplier<Item> PINK = ITEMS.register(
            "pink",
            () -> new Item(new Item.Properties().arch$tab(CreativeModeTabs.INGREDIENTS))
    );
    public static final RegistrySupplier<Item> TIGERSEYE = ITEMS.register(
            "tigerseye",
            () -> new Item(new Item.Properties().arch$tab(CreativeModeTabs.INGREDIENTS))
    );
    public static final RegistrySupplier<Item> PEACOCK = ITEMS.register(
            "peacock",
            () -> new Item(new Item.Properties().arch$tab(CreativeModeTabs.INGREDIENTS))
    );
    public static final RegistrySupplier<Item> MOBZILLA_SCALE = ITEMS.register(
            "mobzilla_scale",
            () -> new Item(new Item.Properties().arch$tab(CreativeModeTabs.INGREDIENTS))
    );
    public static final RegistrySupplier<Item> RUBY = ITEMS.register(
            "ruby",
            () -> new Item(new Item.Properties().arch$tab(CreativeModeTabs.INGREDIENTS))
    );
    public static final RegistrySupplier<Item> KING_SCALE = ITEMS.register(
            "king_scale",
            () -> new Item(new Item.Properties().arch$tab(CreativeModeTabs.INGREDIENTS))
    );
    public static final RegistrySupplier<Item> QUEEN_SCALE = ITEMS.register(
            "queen_scale",
            () -> new Item(new Item.Properties().arch$tab(CreativeModeTabs.INGREDIENTS))
    );


    public static final RegistrySupplier<Item> PEACOCK_HELMENT = ITEMS.register(
      "peacock_helmet",
            () -> new ArmorItem(
                    ModMaterials.PEACOCK,
                    ArmorItem.Type.HELMET,
                    new Item.Properties() .arch$tab(CreativeModeTabs.COMBAT)
            )
    );
    public static final RegistrySupplier<Item> PEACOCK_CHESTPLATE = ITEMS.register(
      "peacock_chestplate",
            () -> new ArmorItem(
                    ModMaterials.PEACOCK,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Properties() .arch$tab(CreativeModeTabs.COMBAT)
            )
    );
    public static final RegistrySupplier<Item> PEACOCK_LEGGINGS = ITEMS.register(
      "peacock_leggings",
            () -> new ArmorItem(
                    ModMaterials.PEACOCK,
                    ArmorItem.Type.LEGGINGS,
                    new Item.Properties() .arch$tab(CreativeModeTabs.COMBAT)
            )
    );
    public static final RegistrySupplier<Item> PEACOCK_BOOTS = ITEMS.register(
            "peacock_boots",
            () -> new ArmorItem(
            ModMaterials.PEACOCK,
            ArmorItem.Type.BOOTS,
            new Item.Properties() .arch$tab(CreativeModeTabs.COMBAT)
            ));
    public static final RegistrySupplier<Item> MOBZILLA_SCALE_HELMET = ITEMS.register(
        "mobzilla_scale_helment",
            () -> new ArmorItem(
                    ModMaterials.MOBZILLA,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Properties() .arch$tab(CreativeModeTabs.COMBAT)
            )
    );
    public static final RegistrySupplier<Item> MOBZILLA_SCALE_CHESTPLATE = ITEMS.register(
      "mobzilla_scale_chestplate",
            () -> new ArmorItem(
                    ModMaterials.MOBZILLA,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Properties() .arch$tab(CreativeModeTabs.COMBAT)
            )
    );
    public static final RegistrySupplier<Item> MOBZILLA_SCALE_LEGGINGS = ITEMS.register(
      "mobzilla_scale_leggings",
            () -> new ArmorItem(
                    ModMaterials.MOBZILLA,
                    ArmorItem.Type.LEGGINGS,
                    new Item.Properties() .arch$tab(CreativeModeTabs.COMBAT)
            )
    );
    public static final RegistrySupplier<Item> MOBZILLA_SCALE_BOOTS = ITEMS.register(
      "mobzilla_scale_boots",
            () -> new ArmorItem(
                    ModMaterials.MOBZILLA,
                    ArmorItem.Type.BOOTS,
                    new Item.Properties() .arch$tab(CreativeModeTabs.COMBAT)
            )
    );
    public static final RegistrySupplier<Item> RUBY_HELMET = ITEMS.register(
      "ruby_helmet",
            () -> new ArmorItem(
                    ModMaterials.RUBY,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Properties() .arch$tab(CreativeModeTabs.COMBAT)
            )
    );
    public static final RegistrySupplier<Item> RUBY_CHESTPLATE = ITEMS.register(
      "ruby_chestplate",
            () -> new ArmorItem(
                    ModMaterials.RUBY,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Properties() .arch$tab(CreativeModeTabs.COMBAT)
            )
    );
    public static final RegistrySupplier<Item> RUBY_LEGGINGS = ITEMS.register(
            "ruby_leggings",
            () -> new ArmorItem(
                ModMaterials.RUBY,
                ArmorItem.Type.LEGGINGS,
                new Item.Properties() .arch$tab(CreativeModeTabs.COMBAT)
            ));
    public static final RegistrySupplier<Item> RUBY_BOOTS = ITEMS.register(
            "ruby_boots",
            () -> new ArmorItem(
               ModMaterials.RUBY,
               ArmorItem.Type.BOOTS,
               new Item.Properties() .arch$tab(CreativeModeTabs.COMBAT)
            ));
    // Queen‐scale armor pieces
    public static final RegistrySupplier<Item> QUEEN_SCALE_HELMET = ITEMS.register(
            "queen_scale_helmet",
            () -> new ArmorItem(
                    ModMaterials.QUEEN,
                    ArmorItem.Type.HELMET,
                    new Item.Properties().arch$tab(CreativeModeTabs.COMBAT)
            )
    );
    public static final RegistrySupplier<Item> QUEEN_SCALE_CHESTPLATE = ITEMS.register(
            "queen_scale_chestplate",
            () -> new ArmorItem(
                    ModMaterials.QUEEN,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().arch$tab(CreativeModeTabs.COMBAT)
            )
    );
    public static final RegistrySupplier<Item> QUEEN_SCALE_LEGGINGS = ITEMS.register(
            "queen_scale_leggings",
            () -> new ArmorItem(
                    ModMaterials.QUEEN,
                    ArmorItem.Type.LEGGINGS,
                    new Item.Properties().arch$tab(CreativeModeTabs.COMBAT)
            )
    );
    public static final RegistrySupplier<Item> QUEEN_SCALE_BOOTS = ITEMS.register(
            "queen_scale_boots",
            () -> new ArmorItem(
                    ModMaterials.QUEEN,
                    ArmorItem.Type.BOOTS,
                    new Item.Properties().arch$tab(CreativeModeTabs.COMBAT)
            )
    );
    public static final RegistrySupplier<Item> ROYAL_GUARDIAN_HELMET = ITEMS.register(
            "royal_guardian_helmet",
            () -> new ArmorItem(
                    ModMaterials.ROYAL,
                    ArmorItem.Type.HELMET,
                    new Item.Properties().arch$tab(CreativeModeTabs.COMBAT)
            )
    );
    public static final RegistrySupplier<Item> ROYAL_GUARDIAN_CHESTPLATE = ITEMS.register(
            "royal_guardian_chestplate",
            () -> new ArmorItem(
                    ModMaterials.ROYAL,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().arch$tab(CreativeModeTabs.COMBAT)
            )
    );
    public static final RegistrySupplier<Item> ROYAL_GUARDIAN_LEGGINGS = ITEMS.register(
            "royal_guardian_leggings",
            () -> new ArmorItem(
                    ModMaterials.ROYAL,
                    ArmorItem.Type.LEGGINGS,
                    new Item.Properties().arch$tab(CreativeModeTabs.COMBAT)
            )
    );
    public static final RegistrySupplier<Item> ROYAL_GUARDIAN_BOOTS = ITEMS.register(
            "royal_guardian_boots",
            () -> new ArmorItem(
                    ModMaterials.ROYAL,
                    ArmorItem.Type.BOOTS,
                    new Item.Properties().arch$tab(CreativeModeTabs.COMBAT)
            )
    );



    public static void register() {
        // On Fabric (Architecture), simply:
        ITEMS.register();

        // If you also support Forge, you'd do:
        // ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // 6) In your mod’s main constructor (or setup method), bind the DeferredRegister:
    //
    //     public MyMod() {
    //         ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    //     }
    //
    //    On Fabric, Architectury’s DeferredRegister will automatically hook into Fabric’s item‐register phase.
    //    On Forge, it hooks into the ForgeModEventBus for RegistryEvent.Register<Item>.
}
