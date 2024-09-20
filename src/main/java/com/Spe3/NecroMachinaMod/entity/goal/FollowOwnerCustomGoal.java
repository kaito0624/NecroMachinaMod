package com.Spe3.NecroMachinaMod.entity.goal;

import com.Spe3.NecroMachinaMod.entity.custom.BlueSkeleton;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

import java.util.EnumSet;

public class FollowOwnerCustomGoal extends Goal {
    private final PathfinderMob mob;
    private LivingEntity owner;
    private final Level level;
    private final double followSpeed;
    private final float maxDist;
    private final float stopDist;

    public FollowOwnerCustomGoal(PathfinderMob mob, double speed, float maxDist, float stopDist) {
        this.mob = mob;
        this.level = mob.level();
        this.followSpeed = speed;
        this.maxDist = maxDist;
        this.stopDist = stopDist;
        this.setFlags(EnumSet.of(Goal.Flag.MOVE));
    }

    @Override
    public boolean canUse() {
        // オーナーを取得
        if (!(mob instanceof BlueSkeleton)) {
            return false;
        }

        this.owner = ((BlueSkeleton) mob).getOwner(); // BlueSkeletonからオーナーを取得

        if (this.owner == null) {
            return false;
        } else if (this.mob.distanceToSqr(this.owner) < (double) (this.stopDist * this.stopDist)) {
            return false; // 近すぎる場合はフォローしない
        } else {
            return true; // フォロー可能
        }
    }

    @Override
    public boolean canContinueToUse() {
        // オーナーが一定の距離以上にいる場合はフォローを続ける
        return this.mob.distanceToSqr(this.owner) > (double) (this.stopDist * this.stopDist) &&
                this.mob.distanceToSqr(this.owner) < (double) (this.maxDist * this.maxDist);
    }

    @Override
    public void start() {
        // 移動を開始
        this.mob.getNavigation().moveTo(this.owner, this.followSpeed);
    }

    @Override
    public void stop() {
        // 移動を終了
        this.owner = null;
        this.mob.getNavigation().stop();
    }

    @Override
    public void tick() {
        if (this.mob.distanceToSqr(this.owner) > (double) (this.maxDist * this.maxDist)) {
            this.mob.getNavigation().moveTo(this.owner, this.followSpeed); // オーナーを追跡
        } else if (this.mob.distanceToSqr(this.owner) <= (double) (this.stopDist * this.stopDist)) {
            this.mob.getNavigation().stop(); // 近すぎる場合は停止
        }
    }
}

