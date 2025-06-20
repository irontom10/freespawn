package com.irontom10.item.armor;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

/**
 * A collection of factory‐style helpers for making ArmorItems
 * with built‐in status‐effect behavior.
 */
public class ModArmorModifiers {
    private ModArmorModifiers() {} // no instantiation

    /**
     * Wraps an ArmorMaterial and EquipmentSlot in an ArmorItem
     * that grants Slow Falling I while worn.
     */
    public static ArmorItem slowFall(ArmorMaterial material, ArmorItem.Type type, Item.Properties props) {
        return new ArmorItem(material, type, props) {

            public void onArmorTick(ItemStack stack, Level world, Player player) {
                if (!world.isClientSide) {
                    // re‐apply every tick so it never fades
                    player.addEffect(new MobEffectInstance(
                            MobEffects.SLOW_FALLING,
                            40,    // 2 seconds, but we reapply each tick
                            0,     // level 1
                            true,  // ambient
                            false, // no particles
                            false  // no icon
                    ));
                }
            }
        };
    }

    /**
     * Wraps an ArmorMaterial and EquipmentSlot in an ArmorItem
     * that grants Movement Speed I while worn.
     */
    public static ArmorItem speedBoost(ArmorMaterial material, ArmorItem.Type type, Item.Properties props) {
        return new ArmorItem(material, type, props) {
            public void onArmorTick(ItemStack stack, Level world, Player player) {
                if (!world.isClientSide) {
                    player.addEffect(new MobEffectInstance(
                            MobEffects.MOVEMENT_SPEED,
                            40,
                            0,
                            true,
                            false,
                            false
                    ));
                }
            }
        };
    }

    // … you can add more modifiers here the same way …
}