package com.irontom10.item.tools;

import net.minecraft.world.entity.player.Player;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;

public class UltimateSword extends SwordItem {
    public UltimateSword() {
        super(
                Tiers.NETHERITE,               // your WeaponStats instance
                36,                // attack damage
                -2.4F,             // attack speed
                new Properties()
                        .arch$tab(CreativeModeTabs.COMBAT)
                        .fireResistant()
        );
    }

    // Auto‐enchant on craft
    @Override
    public void onCraftedBy(ItemStack stack, Level world, Player player) {
        stack.enchant(Enchantments.SHARPNESS,           10);
        stack.enchant(Enchantments.SMITE,               10);
        stack.enchant(Enchantments.BANE_OF_ARTHROPODS,  10);
        stack.enchant(Enchantments.KNOCKBACK,           5);
        stack.enchant(Enchantments.MOB_LOOTING,             5);
        stack.enchant(Enchantments.UNBREAKING,          5);
        stack.enchant(Enchantments.FIRE_ASPECT,         4);
    }

    // Keep Efficiency V on it, in case it ever gets removed
    @Override
    public void inventoryTick(
            ItemStack      stack,
            Level          world,
            net.minecraft.world.entity.Entity entity,
            int            slot,
            boolean        selected
    ) {
        if (!world.isClientSide()
                && EnchantmentHelper.getItemEnchantmentLevel(Enchantments.SHARPNESS, stack) <= 0) {
            stack.enchant(Enchantments.SHARPNESS, 10);
        }
        if (!world.isClientSide()
                && EnchantmentHelper.getItemEnchantmentLevel(Enchantments.SMITE, stack) <= 0) {
            stack.enchant(Enchantments.SMITE, 10);
        }
        if (!world.isClientSide()
                && EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BANE_OF_ARTHROPODS, stack) <= 0) {
            stack.enchant(Enchantments.BANE_OF_ARTHROPODS, 10);
        }
        if (!world.isClientSide()
                && EnchantmentHelper.getItemEnchantmentLevel(Enchantments.KNOCKBACK, stack) <= 0) {
            stack.enchant(Enchantments.KNOCKBACK, 5);
        }
        if (!world.isClientSide()
                && EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, stack) <= 0) {
            stack.enchant(Enchantments.MOB_LOOTING, 5);
        }
        if (!world.isClientSide()
                && EnchantmentHelper.getItemEnchantmentLevel(Enchantments.UNBREAKING, stack) <= 0) {
            stack.enchant(Enchantments.UNBREAKING, 5);
        }
        if (!world.isClientSide()
                && EnchantmentHelper.getItemEnchantmentLevel(Enchantments.FIRE_ASPECT, stack) <= 0) {
            stack.enchant(Enchantments.FIRE_ASPECT, 5);
        }
        super.inventoryTick(stack, world, entity, slot, selected);
    }

}
