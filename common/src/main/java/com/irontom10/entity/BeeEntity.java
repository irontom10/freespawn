package com.irontom10.entity;

import com.irontom10.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.control.FlyingMoveControl;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.*;
import net.minecraft.world.entity.ai.navigation.FlyingPathNavigation;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;

public class BeeEntity extends Monster {
    private static final EntityDataAccessor<Boolean> ATTACKING =
            SynchedEntityData.defineId(BeeEntity.class, EntityDataSerializers.BOOLEAN);

    public static AttributeSupplier.Builder createAttributes() {
        return Monster.createMonsterAttributes()
                .add(Attributes.MAX_HEALTH,      20.0D)
                .add(Attributes.ATTACK_DAMAGE,    4.0D)
                .add(Attributes.FLYING_SPEED,     0.6D)
                .add(Attributes.MOVEMENT_SPEED,   0.3D)
                .add(Attributes.FOLLOW_RANGE,    16.0D);
    }

    public BeeEntity(EntityType<? extends BeeEntity> type, Level world) {
        super(type, world);
        this.moveControl   = new FlyingMoveControl(this, 20, true);
        this.navigation    = new FlyingPathNavigation(this, world);
        this.setNoGravity(true);
    }

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(ATTACKING, false);
    }

    @Override
    protected void registerGoals() {
        goalSelector.addGoal(0, new FloatGoal(this));
        goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.2D, true));
        goalSelector.addGoal(5, new RandomLookAroundGoal(this));

        targetSelector.addGoal(1, new HurtByTargetGoal(this));
        targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, Player.class, true));
        targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, Villager.class, true));
    }

    @Override
    public void tick() {
        super.tick();
        if (!this.isNoGravity()) this.setNoGravity(true);
        // flip attacking flag based on having a target
        this.entityData.set(ATTACKING, this.getTarget() != null);
    }

    public int getAttacking() {
        return this.entityData.get(ATTACKING) ? 1 : 0;
    }

    @Override
    protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHit) {
        super.dropCustomDeathLoot(source, looting, recentlyHit);
        RandomSource rand = this.random;

        // gold nuggets
        int n = 2 + rand.nextInt(10);
        for (int i = 0; i < n; i++) this.spawnAtLocation(Items.GOLD_NUGGET);

        // butter candy
        n = 2 + rand.nextInt(10);
        for (int i = 0; i < n; i++) this.spawnAtLocation(ModItems.BUTTER_CANDY.get());

        // flowers
        n = 2 + rand.nextInt(10);
        for (int i = 0; i < n; i++) this.spawnAtLocation(Items.DANDELION);

        // sugar
        n = 2 + rand.nextInt(10);
        for (int i = 0; i < n; i++) this.spawnAtLocation(Items.SUGAR);
    }

    public static boolean canSpawnHere(EntityType<BeeEntity> type, LevelAccessor world, MobSpawnType reason, BlockPos pos, RandomSource rand) {
        // your custom spawn logic, e.g. daytime, high Y, no water…
        return world.getRawBrightness(pos, 0) > 8 && pos.getY() > 50;
    }
}
