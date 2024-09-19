package com.Spe3.NecroMachinaMod.item;

import com.Spe3.NecroMachinaMod.block.BlockSkeletonRemains;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ItemSkeletonRemains extends BlockItem {

    public ItemSkeletonRemains(Block block) {
        super(block, new Item.Properties().stacksTo(1));
    }
}
