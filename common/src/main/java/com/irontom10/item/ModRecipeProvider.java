package com.irontom10.item;

import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;

import java.util.Arrays;
import java.util.function.Consumer;

import static com.irontom10.item.ModItems.*;
import static net.minecraft.data.recipes.RecipeCategory.*;
import static net.minecraft.data.recipes.ShapedRecipeBuilder.*;

public abstract class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(PackOutput genPackOutput) {
        super(genPackOutput);
    }

    public static void register(Consumer<FinishedRecipe> out) {
        for (ShapedRecipeBuilder shapedRecipeBuilder : Arrays.asList(shaped(TOOLS, ULTIMATE_PICKAXE.get())
                .pattern("TUT")
                .pattern(" U "), shaped(TOOLS, ULTIMATE_AXE.get())
                .pattern("TU ")
                .pattern("TI "), shaped(TOOLS, ULTIMATE_SHOVEL.get())
                .pattern(" U ")
                .pattern(" T "), shaped(TOOLS, ULTIMATE_HOE.get())
                .pattern("TU ")
                .pattern(" I "))) {
            shapedRecipeBuilder
                    .pattern(" I ")
                    .define('T', (ItemLike) TITANIUM_INGOT)
                    .define('U', (ItemLike) URANIUM_INGOT)
                    .define('I', Items.IRON_INGOT)
                    .save(out);
        }

        shaped(TOOLS, ULTIMATE_SWORD.get())
                .pattern(" T ")
                .pattern(" U ")
                .pattern(" I ")
                .define('T', (ItemLike) TITANIUM_INGOT)
                .define('U', (ItemLike) URANIUM_INGOT)
                .define('I', Items.IRON_INGOT)
                .save(out);
        shaped(TOOLS, ULTIMATE_CHESTPLATE.get())
                .pattern("I I")
                .pattern("TTT")
                .pattern("UUU")
                .define('T', (ItemLike) TITANIUM_INGOT)
                .define('U', (ItemLike) URANIUM_INGOT)
                .define('I', Items.IRON_INGOT)
                .save(out);
        shaped(TOOLS, ULTIMATE_HELMET.get())
                .pattern("TIT")
                .pattern("U U")
                .pattern("   ")
                .define('T', (ItemLike) TITANIUM_INGOT)
                .define('U', (ItemLike) URANIUM_INGOT)
                .define('I', Items.IRON_INGOT)
                .save(out);
        shaped(TOOLS, ULTIMATE_LEGGINGS.get())
                .pattern("III")
                .pattern("T T")
                .pattern("U U")
                .define('T', (ItemLike) TITANIUM_INGOT)
                .define('U', (ItemLike) URANIUM_INGOT)
                .define('I', Items.IRON_INGOT)
                .save(out);
        shaped(TOOLS, ULTIMATE_BOOTS.get())
                .pattern("   ")
                .pattern("T T")
                .pattern("U U")
                .define('T', (ItemLike) TITANIUM_INGOT)
                .define('U', (ItemLike) URANIUM_INGOT)
                .save(out);
        ShapelessRecipeBuilder.shapeless(TOOLS, TITANIUM_INGOT.get(), 9)
                .requires(TITANIUM_BLOCK.get())
                .unlockedBy("has_titanium_block", InventoryChangeTrigger.TriggerInstance.hasItems(TITANIUM_BLOCK.get()))
                .save(out);
        ShapelessRecipeBuilder.shapeless(TOOLS, URANIUM_INGOT.get(), 9)
                .requires(URANIUM_BLOCK.get())
                .unlockedBy("has_uranium_block", InventoryChangeTrigger.TriggerInstance.hasItems(URANIUM_BLOCK.get()))
                .save(out);
    }
}
