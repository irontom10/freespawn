package com.irontom10.item.tools;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.FishingRodItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.level.Level;

public class UltimateFishingRod extends FishingRodItem {
    public UltimateFishingRod() {
        super(new Item.Properties()
                .durability(3000)
                .arch$tab(CreativeModeTabs.TOOLS_AND_UTILITIES)
                .fireResistant()
        );
    }

    // Auto-enchant when crafted or first given:
    @Override
    public void onCraftedBy(ItemStack stack, Level world, Player player) {
        stack.enchant(Enchantments.UNBREAKING,      2);
        stack.enchant(Enchantments.FISHING_LUCK, 3);
        stack.enchant(Enchantments.FISHING_SPEED,   2);
    }

    // Keep those enchants if somehow lost:
    @Override
    public void inventoryTick(ItemStack stack, Level world, net.minecraft.world.entity.Entity entity, int slot, boolean selected) {
        if (!world.isClientSide()
                && EnchantmentHelper.getItemEnchantmentLevel(Enchantments.UNBREAKING, stack) <= 0) {
            stack.enchant(Enchantments.UNBREAKING,      2);
            stack.enchant(Enchantments.FISHING_LUCK, 3);
            stack.enchant(Enchantments.FISHING_SPEED,   2);
        }
        super.inventoryTick(stack, world, entity, slot, selected);
    }

    // Override the “use” method to spawn your UltimateFishHook:
    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);

        // If there’s already a bobber out, reel it in:
        if (player.fishing != null) {
            int ret = player.fishing.retrieve(stack);
            stack.hurtAndBreak(ret, player, p -> p.broadcastBreakEvent(hand));
            world.playSound(null, player.blockPosition(),
                    SoundEvents.FISHING_BOBBER_RETRIEVE, SoundSource.PLAYERS,
                    1.0F, 1.0F
            );
        } else {
            // Cast a new bobber
            world.playSound(null, player.blockPosition(),
                    SoundEvents.FISHING_BOBBER_THROW, SoundSource.PLAYERS,
                    0.5F, 0.4F / (world.random.nextFloat() * 0.4F + 0.8F)
            );
            player.swing(hand);
        }

        return InteractionResultHolder.sidedSuccess(stack, world.isClientSide);
    }
}
