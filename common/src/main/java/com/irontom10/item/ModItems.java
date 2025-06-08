package com.irontom10.item;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.world.item.*;

import net.minecraft.core.registries.Registries;

public class ModItems {
    public static final String MOD_ID = "freespawn";

    // 1) Create a DeferredRegister for Items
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MOD_ID, Registries.ITEM);
    //Food Items
    public static final RegistrySupplier<Item> FIRE_FISH = ITEMS.register("fire_fish",
            () -> new Item(new Item.Properties().food(ModFoods.FIRE_FISH).arch$tab(CreativeModeTabs.FOOD_AND_DRINKS)));

    public static final RegistrySupplier<Item> SUN_FISH = ITEMS.register("sun_fish",
            () -> new Item(new Item.Properties().food(ModFoods.SUN_FISH).arch$tab(CreativeModeTabs.FOOD_AND_DRINKS)));

    public static final RegistrySupplier<Item> LAVAEEL = ITEMS.register("lavaeel",
            () -> new Item(new Item.Properties().food(ModFoods.LAVAEEL).arch$tab(CreativeModeTabs.FOOD_AND_DRINKS)));

    public static final RegistrySupplier<Item> SPARK_FISH = ITEMS.register("spark_fish",
            () -> new Item(new Item.Properties().food(ModFoods.SPARK_FISH).arch$tab(CreativeModeTabs.FOOD_AND_DRINKS)));

    public static final RegistrySupplier<Item> POPCORN = ITEMS.register("popcorn",
            () -> new Item(new Item.Properties().food(ModFoods.POPCORN).arch$tab(CreativeModeTabs.FOOD_AND_DRINKS)));

    public static final RegistrySupplier<Item> POPCORN_BUTTERED = ITEMS.register("popcorn_buttered",
            () -> new Item(new Item.Properties().food(ModFoods.POPCORN_BUTTERED).arch$tab(CreativeModeTabs.FOOD_AND_DRINKS)));

    public static final RegistrySupplier<Item> POPCORN_BUTTERED_SALTED = ITEMS.register("popcorn_buttered_salted",
            () -> new Item(new Item.Properties().food(ModFoods.POPCORN_BUTTERED_SALTED).arch$tab(CreativeModeTabs.FOOD_AND_DRINKS)));

    public static final RegistrySupplier<Item> BAG_OF_POPCORN = ITEMS.register("bag_of_popcorn",
            () -> new Item(new Item.Properties().food(ModFoods.BAG_OF_POPCORN).arch$tab(CreativeModeTabs.FOOD_AND_DRINKS)));

    public static final RegistrySupplier<Item> CORN_DOG = ITEMS.register("corn_dog",
            () -> new Item(new Item.Properties().food(ModFoods.CORN_DOG).arch$tab(CreativeModeTabs.FOOD_AND_DRINKS)));

    public static final RegistrySupplier<Item> CHEESE = ITEMS.register("cheese",
            () -> new Item(new Item.Properties().food(ModFoods.CHEESE).arch$tab(CreativeModeTabs.FOOD_AND_DRINKS)));

    public static final RegistrySupplier<Item> RAW_CORN_DOG = ITEMS.register("raw_corn_dog",
            () -> new Item(new Item.Properties().food(ModFoods.RAW_CORN_DOG).arch$tab(CreativeModeTabs.FOOD_AND_DRINKS)));

    public static final RegistrySupplier<Item> COOKED_PEACOCK = ITEMS.register("cooked_peacock",
            () -> new Item(new Item.Properties().food(ModFoods.COOKED_PEACOCK).arch$tab(CreativeModeTabs.FOOD_AND_DRINKS)));

    public static final RegistrySupplier<Item> RAW_PEACOCK = ITEMS.register("raw_peacock",
            () -> new Item(new Item.Properties().food(ModFoods.RAW_PEACOCK).arch$tab(CreativeModeTabs.FOOD_AND_DRINKS)));

    public static final RegistrySupplier<Item> RAW_BACON = ITEMS.register("raw_bacon",
            () -> new Item(new Item.Properties().food(ModFoods.RAW_BACON).arch$tab(CreativeModeTabs.FOOD_AND_DRINKS)));

    public static final RegistrySupplier<Item> BACON = ITEMS.register("bacon",
            () -> new Item(new Item.Properties().food(ModFoods.BACON).arch$tab(CreativeModeTabs.FOOD_AND_DRINKS)));

    public static final RegistrySupplier<Item> RAW_CRAB_MEAT = ITEMS.register("raw_crab_meat",
            () -> new Item(new Item.Properties().food(ModFoods.RAW_CRAB_MEAT).arch$tab(CreativeModeTabs.FOOD_AND_DRINKS)));

    public static final RegistrySupplier<Item> CRAB_MEAT = ITEMS.register("crab_meat",
            () -> new Item(new Item.Properties().food(ModFoods.CRAB_MEAT).arch$tab(CreativeModeTabs.FOOD_AND_DRINKS)));

    public static final RegistrySupplier<Item> BUTTER_CANDY = ITEMS.register("butter_candy",
            () -> new Item(new Item.Properties().food(ModFoods.BUTTER_CANDY).arch$tab(CreativeModeTabs.FOOD_AND_DRINKS)));

    public static final RegistrySupplier<Item> GREEN_FISH = ITEMS.register("green_fish",
            () -> new Item(new Item.Properties().food(ModFoods.GREEN_FISH).arch$tab(CreativeModeTabs.FOOD_AND_DRINKS)));

    public static final RegistrySupplier<Item> BLUE_FISH = ITEMS.register("blue_fish",
            () -> new Item(new Item.Properties().food(ModFoods.BLUE_FISH).arch$tab(CreativeModeTabs.FOOD_AND_DRINKS)));

    public static final RegistrySupplier<Item> PINK_FISH = ITEMS.register("pink_fish",
            () -> new Item(new Item.Properties().food(ModFoods.PINK_FISH).arch$tab(CreativeModeTabs.FOOD_AND_DRINKS)));

    public static final RegistrySupplier<Item> JEW_FISH = ITEMS.register("jew_fish",
            () -> new Item(new Item.Properties().food(ModFoods.JEW_FISH).arch$tab(CreativeModeTabs.FOOD_AND_DRINKS)));

    public static final RegistrySupplier<Item> ROCK_FISH = ITEMS.register("rock_fish",
            () -> new Item(new Item.Properties().food(ModFoods.ROCK_FISH).arch$tab(CreativeModeTabs.FOOD_AND_DRINKS)));

    public static final RegistrySupplier<Item> WOOD_FISH = ITEMS.register("wood_fish",
            () -> new Item(new Item.Properties().food(ModFoods.WOOD_FISH).arch$tab(CreativeModeTabs.FOOD_AND_DRINKS)));

    public static final RegistrySupplier<Item> GRAY_FISH = ITEMS.register("gray_fish",
            () -> new Item(new Item.Properties().food(ModFoods.GRAY_FISH).arch$tab(CreativeModeTabs.FOOD_AND_DRINKS)));

    public static final RegistrySupplier<Item> GARDEN_SALAD = ITEMS.register("garden_salad",
            () -> new Item(new Item.Properties().food(ModFoods.GARDEN_SALAD).arch$tab(CreativeModeTabs.FOOD_AND_DRINKS)));

    public static final RegistrySupplier<Item> BLT_SANDWITCH = ITEMS.register("blt_sandwitch",
            () -> new Item(new Item.Properties().food(ModFoods.BLT_SANDWITCH).arch$tab(CreativeModeTabs.FOOD_AND_DRINKS)));

    public static final RegistrySupplier<Item> A_CARBBY_PATTY = ITEMS.register("a_carbby_patty",
            () -> new Item(new Item.Properties().food(ModFoods.A_CARBBY_PATTY).arch$tab(CreativeModeTabs.FOOD_AND_DRINKS)));

    public static final RegistrySupplier<Item> STRAWBERRY = ITEMS.register("strawberry",
            () -> new Item(new Item.Properties().food(ModFoods.STRAWBERRY).arch$tab(CreativeModeTabs.FOOD_AND_DRINKS)));

    public static final RegistrySupplier<Item> CRYSTAL_APPLE = ITEMS.register("crystal_apple",
            () -> new Item(new Item.Properties().food(ModFoods.CRYSTAL_APPLE).arch$tab(CreativeModeTabs.FOOD_AND_DRINKS)));

    public static final RegistrySupplier<Item> LOVE = ITEMS.register("love",
            () -> new Item(new Item.Properties().food(ModFoods.LOVE).arch$tab(CreativeModeTabs.FOOD_AND_DRINKS)));

    public static final RegistrySupplier<Item> CHERRIES = ITEMS.register("cherries",
            () -> new Item(new Item.Properties().food(ModFoods.CHERRIES).arch$tab(CreativeModeTabs.FOOD_AND_DRINKS)));

    public static final RegistrySupplier<Item> PEACH = ITEMS.register("peach",
            () -> new Item(new Item.Properties().food(ModFoods.PEACH).arch$tab(CreativeModeTabs.FOOD_AND_DRINKS)));

    public static final RegistrySupplier<Item> RADDISH = ITEMS.register("raddish",
            () -> new Item(new Item.Properties().food(ModFoods.RADDISH).arch$tab(CreativeModeTabs.FOOD_AND_DRINKS)));

    public static final RegistrySupplier<Item> RICE = ITEMS.register("rice",
            () -> new Item(new Item.Properties().food(ModFoods.RICE).arch$tab(CreativeModeTabs.FOOD_AND_DRINKS)));

    public static final RegistrySupplier<Item> CORN = ITEMS.register("corn",
            () -> new Item(new Item.Properties().food(ModFoods.CORN).arch$tab(CreativeModeTabs.FOOD_AND_DRINKS)));

    public static final RegistrySupplier<Item> QUINOA = ITEMS.register("quinoa",
            () -> new Item(new Item.Properties().food(ModFoods.QUINOA).arch$tab(CreativeModeTabs.FOOD_AND_DRINKS)));

    public static final RegistrySupplier<Item> TOMATO = ITEMS.register("tomato",
            () -> new Item(new Item.Properties().food(ModFoods.TOMATO).arch$tab(CreativeModeTabs.FOOD_AND_DRINKS)));

    public static final RegistrySupplier<Item> LETTUCE = ITEMS.register("lettuce",
            () -> new Item(new Item.Properties().food(ModFoods.LETTUCE).arch$tab(CreativeModeTabs.FOOD_AND_DRINKS)));



    // Ingredient items
    public static final RegistrySupplier<Item> AMETHYST = ITEMS.register(
            "amethyst",
            () -> new Item(new Item.Properties().arch$tab(CreativeModeTabs.INGREDIENTS))
    );
    public static final RegistrySupplier<Item> MOTHSCALE = ITEMS.register(
            "mothscale",
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
            "lapis_boots",
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
                    ArmorItem.Type.HELMET,
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
            "queen_scale_boots",
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
