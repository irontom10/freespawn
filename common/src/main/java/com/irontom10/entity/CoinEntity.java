package com.irontom10.entity;

import com.irontom10.main;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.phys.AABB;

public class CoinEntity extends PathfinderMob {
    public CoinEntity(EntityType<? extends CoinEntity> type, Level world) {
        super(type, world);
        this.xpReward = 10;             // experienceValue = 10
        this.fireImmune();              // fireResistance = 100
    }

    /** 1) Register default attributes (called when you register the EntityType) */
    public static AttributeSupplier.Builder createAttributes() {
        return PathfinderMob.createMobAttributes()
                .add(Attributes.MAX_HEALTH,      1.0D)   // mygetMaxHealth() == 1
                .add(Attributes.MOVEMENT_SPEED,  0.0D)   // moveSpeed == 0
                .add(Attributes.ATTACK_DAMAGE,   0.0D);
    }

    /** 2) Give it its one AI goal: look around idly */
    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new RandomLookAroundGoal(this));
    }

    /** 3) No special per‐tick logic—just use the default */
    @Override
    public void tick() {
        super.tick();
    }



    /** 5) No interaction (always return PASS) */
    @Override
    public InteractionResult mobInteract(Player player, InteractionHand hand) {
        return InteractionResult.PASS;
    }


    private static boolean canCoinSpawn(EntityType<CoinEntity> type,
                                        Level world,
                                        MobSpawnType reason,
                                        BlockPos pos,
                                        RandomSource random) {
        // daylight only
        if (!world.canSeeSky(pos) || world.getBrightness( net.minecraft.world.level.LightLayer.SKY, pos ) < 8) {
            return false;
        }
        if (pos.getY() < 50) {
            return false;
        }
        // no other coins within 20×8×20
        var nearby = world.getEntitiesOfClass(
                CoinEntity.class,
                new AABB(pos).inflate(20, 8, 20)
        );
        return nearby.isEmpty();
    }
}
