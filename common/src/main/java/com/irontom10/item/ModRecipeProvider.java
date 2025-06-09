package com.irontom10.item;

import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(PackOutput genPackOutput) {
        super(genPackOutput);
    }

    @Override
    public static void buildRecipes(Consumer<FinishedRecipe> out) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.ULTIMATE_PICKAXE.get())
                .pattern("TUT")
                .pattern(" U ")
                .pattern(" I ")
                .define('T', (ItemLike) ModItems.TITANIUM_INGOT)
                .define('U', (ItemLike) ModItems.URANIUM_INGOT)
                .define('I', Items.IRON_INGOT)
                .save(out);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.ULTIMATE_AXE.get())
                .pattern("TU ")
                .pattern("TI ")
                .pattern(" I ")
                .define('T', (ItemLike) ModItems.TITANIUM_INGOT)
                .define('U', (ItemLike) ModItems.URANIUM_INGOT)
                .define('I', Items.IRON_INGOT)
                .save(out);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.ULTIMATE_SHOVEL.get())
                .pattern(" U ")
                .pattern(" T ")
                .pattern(" I ")
                .define('T', (ItemLike) ModItems.TITANIUM_INGOT)
                .define('U', (ItemLike) ModItems.URANIUM_INGOT)
                .define('I', Items.IRON_INGOT)
                .save(out);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.ULTIMATE_HOE.get())
                .pattern("TU ")
                .pattern(" I ")
                .pattern(" I ")
                .define('T', (ItemLike) ModItems.TITANIUM_INGOT)
                .define('U', (ItemLike) ModItems.URANIUM_INGOT)
                .define('I', Items.IRON_INGOT)
                .save(out);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.ULTIMATE_SWORD.get())
                .pattern(" T ")
                .pattern(" U ")
                .pattern(" I ")
                .define('T', (ItemLike) ModItems.TITANIUM_INGOT)
                .define('U', (ItemLike) ModItems.URANIUM_INGOT)
                .define('I', Items.IRON_INGOT)
                .save(out);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.ULTIMATE_CHESTPLATE.get())
                .pattern("I I")
                .pattern("TTT")
                .pattern("UUU")
                .define('T', (ItemLike) ModItems.TITANIUM_INGOT)
                .define('U', (ItemLike) ModItems.URANIUM_INGOT)
                .define('I', Items.IRON_INGOT)
                .save(out);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.ULTIMATE_HELMET.get())
                .pattern("TIT")
                .pattern("U U")
                .pattern("   ")
                .define('T', (ItemLike) ModItems.TITANIUM_INGOT)
                .define('U', (ItemLike) ModItems.URANIUM_INGOT)
                .define('I', Items.IRON_INGOT)
                .save(out);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.ULTIMATE_LEGGINGS.get())
                .pattern("III")
                .pattern("T T")
                .pattern("U U")
                .define('T', (ItemLike) ModItems.TITANIUM_INGOT)
                .define('U', (ItemLike) ModItems.URANIUM_INGOT)
                .define('I', Items.IRON_INGOT)
                .save(out);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.ULTIMATE_BOOTS.get())
                .pattern("   ")
                .pattern("T T")
                .pattern("U U")
                .define('T', (ItemLike) ModItems.TITANIUM_INGOT)
                .define('U', (ItemLike) ModItems.URANIUM_INGOT)
                .save(out);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.TOOLS, ModItems.TITANIUM_INGOT.get(), 9)
                .requires(ModItems.TITANIUM_BLOCK.get())
                .unlockedBy("has_titanium_block", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.TITANIUM_BLOCK.get()))
                .save(out);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.TOOLS, ModItems.URANIUM_INGOT.get(), 9)
                .requires(ModItems.URANIUM_BLOCK.get())
                .unlockedBy("has_uranium_block", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.URANIUM_BLOCK.get()))
                .save(out);
    }
}
