package com.irontom10;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.world.item.*;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.core.registries.Registries;

import java.util.HashMap;
import java.util.Map;

public class ModItems {
    public static final String MOD_ID = "freespawn";

    // 1) Create a DeferredRegister for Items
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MOD_ID, Registries.ITEM);

    // 2) A list of “material names” (or keys) that you want to generate gear for.
    //    You can add as many as you like here.
    private static final String[] MATERIALS = {
            "amethyst",
            "ruby",
            "tigerseye",
            "ultimate",
            "royal",
            "queen"

    };

    // 3) For each material, we’re going to generate:
    //      - A sword
    //      - A pickaxe
    //      - A helmet
    //      - A chestplate
    //      - Leggings
    //      - Boots
    //
    //    We’ll store each RegistrySupplier<Item> in a map so we can reference them later
    //    (e.g. for recipes, or to grab the Item instance at runtime).
    public static final Map<String, RegistrySupplier<SwordItem>>   SWORD_MAP   = new HashMap<>();
    public static final Map<String, RegistrySupplier<PickaxeItem>> PICKAXE_MAP = new HashMap<>();
    public static final Map<String, RegistrySupplier<ArmorItem>>   HELMET_MAP  = new HashMap<>();
    public static final Map<String, RegistrySupplier<ArmorItem>>   CHEST_MAP   = new HashMap<>();
    public static final Map<String, RegistrySupplier<ArmorItem>>   LEGS_MAP    = new HashMap<>();
    public static final Map<String, RegistrySupplier<ArmorItem>>   BOOTS_MAP   = new HashMap<>();

    // 4) A simple Tier/ArmorMaterial lookup. In a real mod, you’d probably define
    //    your own custom Tier and ArmorMaterial classes/enums. Here we’ll just
    //    switch on the material name for demo purposes.
    private static Tier getTierForMaterial(String material) {
        return switch (material) {
            case "amethyst"    -> Tiers.IRON;   // pretend “amethyst” reuses iron's stats
            case "ruby"     -> Tiers.DIAMOND; // pretend “mythril” reuses diamond's stats
            case "tigerseye"  -> Tiers.NETHERITE;// pretend “adamantine” reuses netherite
            default            -> Tiers.WOOD;
        };
    }

    private static ArmorMaterial getArmorMaterialFor(String material) {
        return switch (material) {
            case "amethyst"    -> ArmorMaterials.IRON;    // again, just for example
            case "ruby"     -> ArmorMaterials.DIAMOND;
            case "tigerseye"  -> ArmorMaterials.NETHERITE;
            default            -> ArmorMaterials.LEATHER;
        };
    }

    // 5) In a static initializer, loop over each material and register everything:
    static {
        for (String mat : MATERIALS) {
            Tier tier = getTierForMaterial(mat);
            ArmorMaterial armorMat = getArmorMaterialFor(mat);

            // –––––– SWORD ––––––
            SWORD_MAP.put(mat,
                    ITEMS.register(mat + "_sword", () ->
                            new SwordItem(
                                    tier,
                                    3,       // +3 base damage on top of Tier’s base
                                    -2.4f,   // swing speed
                                    new Item.Properties() .arch$tab(CreativeModeTabs.COMBAT)
                            )
                    )
            );

            // –––––– PICKAXE ––––––
            PICKAXE_MAP.put(mat,
                    ITEMS.register(mat + "_pickaxe", () ->
                            new PickaxeItem(
                                    tier,
                                    1,       // +1 damage on top of Tier’s base
                                    -2.8f,   // mining speed
                                    new Item.Properties() .arch$tab(CreativeModeTabs.TOOLS_AND_UTILITIES)
                            )
                    )
            );

            // –––––– ARMOR PIECES ––––––
            HELMET_MAP.put(mat,
                    ITEMS.register(mat + "_helmet", () ->
                            new ArmorItem(
                                    armorMat,
                                    ArmorItem.Type.HELMET,
                                    new Item.Properties() .arch$tab(CreativeModeTabs.COMBAT)
                            )
                    )
            );

            CHEST_MAP.put(mat,
                    ITEMS.register(mat + "_chestplate", () ->
                            new ArmorItem(
                                    armorMat, ArmorItem.Type.CHESTPLATE,
                                    new Item.Properties() .arch$tab(CreativeModeTabs.COMBAT)
                            )
                    )
            );

            LEGS_MAP.put(mat,
                    ITEMS.register(mat + "_leggings", () ->
                            new ArmorItem(
                                    armorMat,
                                    ArmorItem.Type.LEGGINGS,
                                    new Item.Properties() .arch$tab(CreativeModeTabs.COMBAT)
                            )
                    )
            );

            BOOTS_MAP.put(mat,
                    ITEMS.register(mat + "_boots", () ->
                            new ArmorItem(
                                    armorMat,
                                    ArmorItem.Type.BOOTS,
                                    new Item.Properties() .arch$tab(CreativeModeTabs.COMBAT)
                            )
                    )
            );
        }
    }

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
