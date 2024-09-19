package com.Spe3.NecroMachinaMod.block;

import com.Spe3.NecroMachinaMod.entity.NecroMachinaEntities;
import com.Spe3.NecroMachinaMod.entity.custom.BlueSkeleton;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.monster.Skeleton;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class BlockSkeletonRemains extends Block {

    public BlockSkeletonRemains(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        if (!level.isClientSide) {
            ItemStack heldItem = player.getItemInHand(hand);

            // プレイヤーが "soul" アイテムを持っているかチェック
            if (heldItem.getItem() instanceof com.Spe3.NecroMachinaMod.item.ItemSoul) {

                //ブルースケルトン召喚
                BlueSkeleton blueSkeleton = new BlueSkeleton(NecroMachinaEntities.BLUE_SKELETON.get() ,level);
                blueSkeleton.setPos(pos.getX(), pos.getY() + 1, pos.getZ());
                level.addFreshEntity(blueSkeleton);

                // "soul" アイテムを1つ消費
                heldItem.shrink(1);

                // ブロックを削除する（例: remainsが消える）
                level.removeBlock(pos, false);

                return InteractionResult.SUCCESS;
            }
        }
        return InteractionResult.PASS;
    }
}
