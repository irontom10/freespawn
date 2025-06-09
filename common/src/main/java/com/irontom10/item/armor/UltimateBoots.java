package com.irontom10.item.armor;

import com.irontom10.item.ModArmorMaterials;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;

public class UltimateBoots extends ArmorItem {
    public UltimateBoots() {
        super(
                ModArmorMaterials.ULTIMATE,  // material
                Type.BOOTS,               // armor type
                new Properties()
                        .fireResistant()  // properties
        );
    }

    @Override
    public void inventoryTick(
            ItemStack stack,
            Level world,
            net.minecraft.world.entity.Entity entity,
            int      slot,
            boolean  selected
    ) {
        if (!world.isClientSide()
                && EnchantmentHelper.getItemEnchantmentLevel(Enchantments.ALL_DAMAGE_PROTECTION, stack) <= 0) {
            stack.enchant(Enchantments.ALL_DAMAGE_PROTECTION, 5);
        }
        if (!world.isClientSide()
                && EnchantmentHelper.getItemEnchantmentLevel(Enchantments.FIRE_PROTECTION, stack) <= 0) {
            stack.enchant(Enchantments.FIRE_PROTECTION, 5);
        }
        if (!world.isClientSide()
                && EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLAST_PROTECTION, stack) <= 0) {
            stack.enchant(Enchantments.BLAST_PROTECTION, 5);
        }
        if( !world.isClientSide()
                && EnchantmentHelper.getItemEnchantmentLevel(Enchantments.PROJECTILE_PROTECTION, stack) <= 0) {
            stack.enchant(Enchantments.PROJECTILE_PROTECTION, 5);
        }
        if (!world.isClientSide()
                && EnchantmentHelper.getItemEnchantmentLevel(Enchantments.FALL_PROTECTION, stack) <= 0) {
            stack.enchant(Enchantments.FALL_PROTECTION, 3);
        }
        if (!world.isClientSide()
                && EnchantmentHelper.getItemEnchantmentLevel(Enchantments.FROST_WALKER, stack) <= 0) {
            stack.enchant(Enchantments.FROST_WALKER, 3);
        }
        super.inventoryTick(stack, world, entity, slot, selected);
    }
}
