package com.irontom10;


import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;

/**
 * A little DSL to build ArmorItems with effects, now using the proper Type.
 */
public class ModArmorBuilder {
    private final ArmorMaterial material;
    private ArmorItem.Type type;
    private Item.Properties props = new Item.Properties();

    private boolean slowFall, speedBoost;

    private ModArmorBuilder(ArmorMaterial material) {
        this.material = material;
    }

    public static ModArmorBuilder of(ArmorMaterial material) {
        return new ModArmorBuilder(material);
    }

    /** Use the nested ArmorItem.Type, not EquipmentSlot */
    public ModArmorBuilder type(ArmorItem.Type type) {
        this.type = type;
        return this;
    }

    public ModArmorBuilder props(Item.Properties p) {
        this.props = p;
        return this;
    }

    public ModArmorBuilder withSlowFall() {
        this.slowFall = true;
        return this;
    }

    public ModArmorBuilder withSpeedBoost() {
        this.speedBoost = true;
        return this;
    }

    public ArmorItem build() {
        if (slowFall) {
            return ModArmorModifiers.slowFall(material, type, props);
        }
        if (speedBoost) {
            return ModArmorModifiers.speedBoost(material, type, props);
        }
        // plain vanilla armor item
        return new ArmorItem(material, type, props);
    }
}
