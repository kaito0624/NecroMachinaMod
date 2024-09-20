package com.Spe3.NecroMachinaMod.entity.custom;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.goal.FollowOwnerGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.monster.WitherSkeleton;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.player.Player;

import javax.annotation.Nullable;
import java.util.UUID;

public class BlueSkeleton extends WitherSkeleton {

    private UUID ownerUUID; // オーナーのUUIDを保持するフィールド

    public BlueSkeleton(EntityType<? extends WitherSkeleton> entityType, Level level) {
        super(entityType, level);
    }

    // WitherSkeletonの属性を維持
    public static AttributeSupplier.Builder createAttributes(){
        return WitherSkeleton.createAttributes(); // WitherSkeletonの属性を継承
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        // プレイヤーをフォローするAIゴールを追加
        this.goalSelector.addGoal(1, new FollowOwnerGoal(this, 1.0D, 10.0F, 2.0F, false));
        // 敵を攻撃するAIゴールを追加
        this.goalSelector.addGoal(2, new MeleeAttackGoal(this, 1.0D, true));
    }

    // スポーン時に武器を持たせる
    public void giveWeapon() {
        this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(Items.IRON_SWORD)); // 武器を持たせる
    }

    // モブがプレイヤーと友好関係を築けるかチェック
    @Override
    public boolean canBeLeashed(Player player) {
        return this.isTamed() && super.canBeLeashed(player);
    }

    // 友好状態を確認するメソッド
    public boolean isTamed() {
        return this.ownerUUID != null; // オーナーがいる場合は手懐けられている
    }

    // 友好状態をセットするメソッド
    public void setTamed(Player player) {
        this.ownerUUID = player.getUUID(); // プレイヤーをオーナーとして設定
    }

    // オーナーのUUIDを基にオーナーエンティティを取得
    @Nullable
    public LivingEntity getOwner() {
        try {
            UUID uuid = this.ownerUUID;
            return uuid == null ? null : this.getLevel().getPlayerByUUID(uuid); // getLevel()でアクセス
        } catch (IllegalArgumentException var2) {
            return null;
        }
    }

    // NBTにオーナー情報を保存
    @Override
    public void addAdditionalSaveData(CompoundTag compound) {
        super.addAdditionalSaveData(compound);
        if (this.ownerUUID != null) {
            compound.putUUID("OwnerUUID", this.ownerUUID);
        }
    }

    // NBTからオーナー情報を読み込む
    @Override
    public void readAdditionalSaveData(CompoundTag compound) {
        super.readAdditionalSaveData(compound);
        if (compound.hasUUID("OwnerUUID")) {
            this.ownerUUID = compound.getUUID("OwnerUUID");
        }
    }
}
