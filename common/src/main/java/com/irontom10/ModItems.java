package com.irontom10;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
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
    public static final RegistrySupplier<Item> PINK_TOURMAILINE_INGOT = ITEMS.register(
            "pink_tourmailine_ingot",
            () -> new Item(new Item.Properties().arch$tab(CreativeModeTabs.INGREDIENTS))
    );
    public static final RegistrySupplier<Item> TIGERSEYE = ITEMS.register(
            "tigerseye",
            () -> new Item(new Item.Properties().arch$tab(CreativeModeTabs.INGREDIENTS))
    );
    public static final RegistrySupplier<Item> PEACOCK_FEATHER = ITEMS.register(
            "peacock_feather",
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

    //Armor items
    public static final RegistrySupplier<Item> LAPIS_HELMET = ITEMS.register(
            "lapis_helmet",
            () -> new ArmorItem(
                    ModArmorMaterials.LAPIS,
                    ArmorItem.Type.HELMET,
                    new Item.Properties() .arch$tab(CreativeModeTabs.COMBAT)

            )
    );
    public static final RegistrySupplier<Item> LAPIS_CHESTPLATE = ITEMS.register(
            "lapis_chestplate",
            () -> new ArmorItem(
                    ModArmorMaterials.LAPIS,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Properties() .arch$tab(CreativeModeTabs.COMBAT)

            )
    );
    public static final RegistrySupplier<Item> LAPIS_LEGGINGS = ITEMS.register(
            "lapis_leggings",
            () -> new ArmorItem(
                    ModArmorMaterials.LAPIS,
                    ArmorItem.Type.LEGGINGS,
                    new Item.Properties() .arch$tab(CreativeModeTabs.COMBAT)

            )
    );
    public static final RegistrySupplier<Item> LAPIS_BOOTS = ITEMS.register(
            "emerald_boots",
            () -> new ArmorItem(
                    ModArmorMaterials.LAPIS,
                    ArmorItem.Type.BOOTS,
                    new Item.Properties() .arch$tab(CreativeModeTabs.COMBAT)

            )
    );
    public static final RegistrySupplier<Item> EMERALD_HELMET = ITEMS.register(
            "emerald_helmet",
            () -> new ArmorItem(
                    ModArmorMaterials.EMERALD,
                    ArmorItem.Type.HELMET,
                    new Item.Properties() .arch$tab(CreativeModeTabs.COMBAT)

            )
    );
    public static final RegistrySupplier<Item> EMERALD_CHESTPLATE = ITEMS.register(
            "emerald_chestplate",
            () -> new ArmorItem(
                    ModArmorMaterials.EMERALD,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Properties() .arch$tab(CreativeModeTabs.COMBAT)

            )
    );
    public static final RegistrySupplier<Item> EMERALD_LEGGINGS = ITEMS.register(
            "lapis_leggings",
            () -> new ArmorItem(
                    ModArmorMaterials.EMERALD,
                    ArmorItem.Type.LEGGINGS,
                    new Item.Properties() .arch$tab(CreativeModeTabs.COMBAT)

            )
    );
    public static final RegistrySupplier<Item> EMERALD_BOOTS = ITEMS.register(
            "emerald_boots",
            () -> new ArmorItem(
                    ModArmorMaterials.EMERALD,
                    ArmorItem.Type.BOOTS,
                    new Item.Properties() .arch$tab(CreativeModeTabs.COMBAT)

            )
    );
    public static final RegistrySupplier<Item> AMETHYST_HELMET = ITEMS.register(
            "amethyst_helmet",
            () -> new ArmorItem(
                    ModArmorMaterials.AMETHYST,
                    ArmorItem.Type.HELMET,
                    new Item.Properties() .arch$tab(CreativeModeTabs.COMBAT)

            )
    );
    public static final RegistrySupplier<Item> AMETHYST_CHESTPLATE = ITEMS.register(
            "amethyst_chestplate",
            () -> new ArmorItem(
                    ModArmorMaterials.AMETHYST,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Properties() .arch$tab(CreativeModeTabs.COMBAT)

            )
    );
    public static final RegistrySupplier<Item> AMETHYST_LEGGINGS = ITEMS.register(
            "amethyst_leggings",
            () -> new ArmorItem(
                    ModArmorMaterials.AMETHYST,
                    ArmorItem.Type.LEGGINGS,
                    new Item.Properties() .arch$tab(CreativeModeTabs.COMBAT)

            )
    );
    public static final RegistrySupplier<Item> AMETHYST_BOOTS = ITEMS.register(
            "amethyst_boots",
            () -> new ArmorItem(
                    ModArmorMaterials.AMETHYST,
                    ArmorItem.Type.BOOTS,
                    new Item.Properties() .arch$tab(CreativeModeTabs.COMBAT)

            )
    );
    public static final RegistrySupplier<Item> EXPERIENCE_HELMET = ITEMS.register(
            "experience_helmet",
            () -> new ArmorItem(
                    ModArmorMaterials.EXPERIENCE,
                    ArmorItem.Type.HELMET,
                    new Item.Properties() .arch$tab(CreativeModeTabs.COMBAT)

            )
    );
    public static final RegistrySupplier<Item> EXPERIENCE_CHESTPLATE = ITEMS.register(
            "experience_chestplate",
            () -> new ArmorItem(
                    ModArmorMaterials.EXPERIENCE,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Properties() .arch$tab(CreativeModeTabs.COMBAT)

            )
    );
    public static final RegistrySupplier<Item> EXPERIENCE_LEGGINGS = ITEMS.register(
            "experience_leggings",
            () -> new ArmorItem(
                    ModArmorMaterials.EXPERIENCE,
                    ArmorItem.Type.LEGGINGS,
                    new Item.Properties() .arch$tab(CreativeModeTabs.COMBAT)

            )
    );
    public static final RegistrySupplier<Item> EXPERIENCE_BOOTS = ITEMS.register(
            "experience_boots",
            () -> new ArmorItem(
                    ModArmorMaterials.EXPERIENCE,
                    ArmorItem.Type.BOOTS,
                    new Item.Properties() .arch$tab(CreativeModeTabs.COMBAT)

            )
    );
    public static final RegistrySupplier<Item> MOTHSCALE_HELMET = ITEMS.register(
            "mothscale_helmet",
            () -> new ArmorItem(
                    ModArmorMaterials.MOTHSCALE,
                    ArmorItem.Type.HELMET,
                    new Item.Properties() .arch$tab(CreativeModeTabs.COMBAT)

            )
    );
    public static final RegistrySupplier<Item> MOTHSCALE_CHESTPLATE = ITEMS.register(
            "mothscale_chestplate",
            () -> new ArmorItem(
                    ModArmorMaterials.MOTHSCALE,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Properties() .arch$tab(CreativeModeTabs.COMBAT)

            )
    );
    public static final RegistrySupplier<Item> MOTHSCALE_LEGGINGS = ITEMS.register(
            "mothscale_leggings",
            () -> new ArmorItem(
                    ModArmorMaterials.MOTHSCALE,
                    ArmorItem.Type.LEGGINGS,
                    new Item.Properties() .arch$tab(CreativeModeTabs.COMBAT)

            )
    );
    public static final RegistrySupplier<Item> MOTHSCALE_BOOTS = ITEMS.register(
            "mothscale_boots",
            () -> new ArmorItem(
                    ModArmorMaterials.MOTHSCALE,
                    ArmorItem.Type.BOOTS,
                    new Item.Properties() .arch$tab(CreativeModeTabs.COMBAT)

            )
    );
    public static final RegistrySupplier<Item> LAVAEEL_HELMET = ITEMS.register(
            "lavaeel_helmet",
            () -> new ArmorItem(
                    ModArmorMaterials.LAVAEEL,
                    ArmorItem.Type.HELMET,
                    new Item.Properties() .arch$tab(CreativeModeTabs.COMBAT)

            )
    );
    public static final RegistrySupplier<Item> LAVAEEL_CHESTPLATE = ITEMS.register(
            "lavaeel_chestplate",
            () -> new ArmorItem(
                    ModArmorMaterials.LAVAEEL,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Properties() .arch$tab(CreativeModeTabs.COMBAT)

            )
    );
    public static final RegistrySupplier<Item> LAVAEEL_LEGGINGS = ITEMS.register(
            "lavaeel_leggings",
            () -> new ArmorItem(
                    ModArmorMaterials.LAVAEEL,
                    ArmorItem.Type.LEGGINGS,
                    new Item.Properties() .arch$tab(CreativeModeTabs.COMBAT)

            )
    );
    public static final RegistrySupplier<Item> LAVAEEL_BOOTS = ITEMS.register(
            "lavaeel_boots",
            () -> new ArmorItem(
                    ModArmorMaterials.LAVAEEL,
                    ArmorItem.Type.BOOTS,
                    new Item.Properties() .arch$tab(CreativeModeTabs.COMBAT)

            )
    );
    public static final RegistrySupplier<Item> ULTIMATE_HELMET = ITEMS.register(
            "ultimate_helmet",
            () -> new ArmorItem(
                    ModArmorMaterials.ULTIMATE,
                    ArmorItem.Type.HELMET,
                    new Item.Properties() .arch$tab(CreativeModeTabs.COMBAT)

            )
    );
    public static final RegistrySupplier<Item> ULTIMATE_CHESTPLATE = ITEMS.register(
            "ultimate_chestplate",
            () -> new ArmorItem(
                    ModArmorMaterials.ULTIMATE,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Properties() .arch$tab(CreativeModeTabs.COMBAT)

            )
    );
    public static final RegistrySupplier<Item> ULTIMATE_LEGGINGS = ITEMS.register(
            "ultimate_leggings",
            () -> new ArmorItem(
                    ModArmorMaterials.ULTIMATE,
                    ArmorItem.Type.LEGGINGS,
                    new Item.Properties() .arch$tab(CreativeModeTabs.COMBAT)

            )
    );
    public static final RegistrySupplier<Item> ULTIMATE_BOOTS = ITEMS.register(
            "ultimate_boots",
            () -> new ArmorItem(
                    ModArmorMaterials.ULTIMATE,
                    ArmorItem.Type.BOOTS,
                    new Item.Properties() .arch$tab(CreativeModeTabs.COMBAT)

            )
    );
    public static final RegistrySupplier<Item> PINK_TOURMAILINE_HELMET = ITEMS.register(
            "pink_tourmailine_helmet",
            () -> new ArmorItem(
                    ModArmorMaterials.PINK_TOURMAILINE,
                    ArmorItem.Type.HELMET,
                    new Item.Properties() .arch$tab(CreativeModeTabs.COMBAT)

            )
    );
    public static final RegistrySupplier<Item> PINK_TOURMAILINE_CHESTPLATE = ITEMS.register(
            "pink_tourmailine_chestplate",
            () -> new ArmorItem(
                    ModArmorMaterials.PINK_TOURMAILINE,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Properties() .arch$tab(CreativeModeTabs.COMBAT)

            )
    );
    public static final RegistrySupplier<Item> PINK_TOURMAILINE_LEGGINGS = ITEMS.register(
            "pink_tourmailine_leggings",
            () -> new ArmorItem(
                    ModArmorMaterials.PINK_TOURMAILINE,
                    ArmorItem.Type.LEGGINGS,
                    new Item.Properties() .arch$tab(CreativeModeTabs.COMBAT)

            )
    );
    public static final RegistrySupplier<Item> PINK_TOURMAILINE_BOOTS = ITEMS.register(
      "pink_tourmailine_boots",
            () -> new ArmorItem(
                    ModArmorMaterials.PINK_TOURMAILINE,
                    ArmorItem.Type.BOOTS,
                    new Item.Properties() .arch$tab(CreativeModeTabs.COMBAT)

            )
    );
    public static final RegistrySupplier<Item> TIGERSEYE_HELMET = ITEMS.register(
      "tigerseye_helmet",
            () -> new ArmorItem(
                    ModArmorMaterials.TIGERSEYE,
                    ArmorItem.Type.HELMET,
                    new Item.Properties() .arch$tab(CreativeModeTabs.COMBAT)
            )
    );
    public static final RegistrySupplier<Item> TIGERSEYE_CHESTPLATE = ITEMS.register(
            "tigerseye_chestplate",
            () -> new ArmorItem(
                    ModArmorMaterials.TIGERSEYE,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Properties() .arch$tab(CreativeModeTabs.COMBAT)
            )
    );
    public static final RegistrySupplier<Item> TIGERSEYE_LEGGINGS = ITEMS.register(
      "tigerseye_leggings",
            () -> new ArmorItem(
                    ModArmorMaterials.TIGERSEYE,
                    ArmorItem.Type.LEGGINGS,
                    new Item.Properties() .arch$tab(CreativeModeTabs.COMBAT)
            )
    );
    public static final RegistrySupplier<Item> TIGERSEYE_BOOTS = ITEMS.register(
      "tigerseye_boots",
            () -> new ArmorItem(
                    ModArmorMaterials.TIGERSEYE,
                    ArmorItem.Type.BOOTS,
                    new Item.Properties() .arch$tab(CreativeModeTabs.COMBAT)
            )
    );

    public static final RegistrySupplier<Item> PEACOCK_HELMENT = ITEMS.register(
      "peacock_helmet",
            () -> new ArmorItem(
                    ModArmorMaterials.PEACOCK,
                    ArmorItem.Type.HELMET,
                    new Item.Properties() .arch$tab(CreativeModeTabs.COMBAT)
            )
    );
    public static final RegistrySupplier<Item> PEACOCK_CHESTPLATE = ITEMS.register(
      "peacock_chestplate",
            () -> new ArmorItem(
                    ModArmorMaterials.PEACOCK,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Properties() .arch$tab(CreativeModeTabs.COMBAT)
            )
    );
    public static final RegistrySupplier<Item> PEACOCK_LEGGINGS = ITEMS.register(
      "peacock_leggings",
            () -> new ArmorItem(
                    ModArmorMaterials.PEACOCK,
                    ArmorItem.Type.LEGGINGS,
                    new Item.Properties() .arch$tab(CreativeModeTabs.COMBAT)
            )
    );
    public static final RegistrySupplier<Item> PEACOCK_BOOTS = ITEMS.register(
            "peacock_boots",
            () -> new ArmorItem(
            ModArmorMaterials.PEACOCK,
            ArmorItem.Type.BOOTS,
            new Item.Properties() .arch$tab(CreativeModeTabs.COMBAT)
            ));
    public static final RegistrySupplier<Item> MOBZILLA_SCALE_HELMET = ITEMS.register(
        "mobzilla_scale_helmet",
            () -> new ArmorItem(
                    ModArmorMaterials.MOBZILLA,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Properties() .arch$tab(CreativeModeTabs.COMBAT)
            )
    );
    public static final RegistrySupplier<Item> MOBZILLA_SCALE_CHESTPLATE = ITEMS.register(
      "mobzilla_scale_chestplate",
            () -> new ArmorItem(
                    ModArmorMaterials.MOBZILLA,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Properties() .arch$tab(CreativeModeTabs.COMBAT)
            )
    );
    public static final RegistrySupplier<Item> MOBZILLA_SCALE_LEGGINGS = ITEMS.register(
      "mobzilla_scale_leggings",
            () -> new ArmorItem(
                    ModArmorMaterials.MOBZILLA,
                    ArmorItem.Type.LEGGINGS,
                    new Item.Properties() .arch$tab(CreativeModeTabs.COMBAT)
            )
    );
    public static final RegistrySupplier<Item> MOBZILLA_SCALE_BOOTS = ITEMS.register(
      "mobzilla_scale_boots",
            () -> new ArmorItem(
                    ModArmorMaterials.MOBZILLA,
                    ArmorItem.Type.BOOTS,
                    new Item.Properties() .arch$tab(CreativeModeTabs.COMBAT)
            )
    );
    public static final RegistrySupplier<Item> RUBY_HELMET = ITEMS.register(
      "ruby_helmet",
            () -> new ArmorItem(
                    ModArmorMaterials.RUBY,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Properties() .arch$tab(CreativeModeTabs.COMBAT)
            )
    );
    public static final RegistrySupplier<Item> RUBY_CHESTPLATE = ITEMS.register(
      "ruby_chestplate",
            () -> new ArmorItem(
                    ModArmorMaterials.RUBY,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Properties() .arch$tab(CreativeModeTabs.COMBAT)
            )
    );
    public static final RegistrySupplier<Item> RUBY_LEGGINGS = ITEMS.register(
            "ruby_leggings",
            () -> new ArmorItem(
                ModArmorMaterials.RUBY,
                ArmorItem.Type.LEGGINGS,
                new Item.Properties() .arch$tab(CreativeModeTabs.COMBAT)
            ));
    public static final RegistrySupplier<Item> RUBY_BOOTS = ITEMS.register(
            "ruby_boots",
            () -> new ArmorItem(
               ModArmorMaterials.RUBY,
               ArmorItem.Type.BOOTS,
               new Item.Properties() .arch$tab(CreativeModeTabs.COMBAT)
            ));
    // Queen‐scale armor pieces
    public static final RegistrySupplier<Item> QUEEN_SCALE_HELMET = ITEMS.register(
            "queen_scale_helmet",
            () -> new ArmorItem(
                    ModArmorMaterials.QUEEN,
                    ArmorItem.Type.HELMET,
                    new Item.Properties().arch$tab(CreativeModeTabs.COMBAT)
            )
    );
    public static final RegistrySupplier<Item> QUEEN_SCALE_CHESTPLATE = ITEMS.register(
            "queen_scale_chestplate",
            () -> new ArmorItem(
                    ModArmorMaterials.QUEEN,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().arch$tab(CreativeModeTabs.COMBAT)
            )
    );
    public static final RegistrySupplier<Item> QUEEN_SCALE_LEGGINGS = ITEMS.register(
            "queen_scale_leggings",
            () -> new ArmorItem(
                    ModArmorMaterials.QUEEN,
                    ArmorItem.Type.LEGGINGS,
                    new Item.Properties().arch$tab(CreativeModeTabs.COMBAT)
            )
    );
    public static final RegistrySupplier<Item> QUEEN_SCALE_BOOTS = ITEMS.register(
            "royal_guardian_boots",
            () -> ModArmorBuilder.of(ModArmorMaterials.QUEEN)
                    .type(ArmorItem.Type.BOOTS)
                    .props(new Item.Properties() .arch$tab(CreativeModeTabs.COMBAT))
                    .withSlowFall()
                    .build()
    );
    public static final RegistrySupplier<Item> ROYAL_GUARDIAN_HELMET = ITEMS.register(
            "royal_guardian_helmet",
            () -> new ArmorItem(
                    ModArmorMaterials.ROYAL,
                    ArmorItem.Type.HELMET,
                    new Item.Properties().arch$tab(CreativeModeTabs.COMBAT)
            )
    );
    public static final RegistrySupplier<Item> ROYAL_GUARDIAN_CHESTPLATE = ITEMS.register(
            "royal_guardian_chestplate",
            () -> new ArmorItem(
                    ModArmorMaterials.ROYAL,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().arch$tab(CreativeModeTabs.COMBAT)
            )
    );
    public static final RegistrySupplier<Item> ROYAL_GUARDIAN_LEGGINGS = ITEMS.register(
            "royal_guardian_leggings",
            () -> new ArmorItem(
                    ModArmorMaterials.ROYAL,
                    ArmorItem.Type.LEGGINGS,
                    new Item.Properties().arch$tab(CreativeModeTabs.COMBAT)
            )
    );
    public static final RegistrySupplier<Item> ROYAL_GUARDIAN_BOOTS = ITEMS.register(
            "royal_guardian_boots",
            () -> ModArmorBuilder.of(ModArmorMaterials.ROYAL)
                    .type(ArmorItem.Type.BOOTS)
                    .props(new Item.Properties() .arch$tab(CreativeModeTabs.COMBAT))
                    .withSlowFall()
                    .build()
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
