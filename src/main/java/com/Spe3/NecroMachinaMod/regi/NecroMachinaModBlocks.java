package com.Spe3.NecroMachinaMod.regi;

import com.Spe3.NecroMachinaMod.block.BlockSkeletonRemains;
import com.Spe3.NecroMachinaMod.main.NecroMachinaMod;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class NecroMachinaModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, NecroMachinaMod.MOD_ID);

    // ブロックの登録を別ファイルで行う
    public static final RegistryObject<Block> SKELETON_REMAINS_BLOCK = BLOCKS.register("skeleton_remains_block",
            () -> new BlockSkeletonRemains(BlockBehaviour.Properties.of()));
}
