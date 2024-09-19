package com.Spe3.NecroMachinaMod.regi;

import com.Spe3.NecroMachinaMod.block.BlockSkeletonRemains;
import com.Spe3.NecroMachinaMod.item.ItemSoul;
import com.Spe3.NecroMachinaMod.main.NecroMachinaMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class NecroMachinaModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, NecroMachinaMod.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, NecroMachinaMod.MOD_ID);

    // Material.STONE を使わない代わりに、直接プロパティを指定
    public static final RegistryObject<Block> SKELETON_REMAINS_BLOCK = BLOCKS.register("skeleton_remains_block",
            () -> new BlockSkeletonRemains(Block.Properties.of()));  // デフォルトのプロパティを使用

    public static final RegistryObject<Item> SKELETON_REMAINS = ITEMS.register("skeleton_remains",
            () -> new BlockItem(SKELETON_REMAINS_BLOCK.get(), new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> SOUL = ITEMS.register("soul", ItemSoul::new);
}
