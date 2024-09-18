package com.Kaito.KaitoMod.regi;

import com.Kaito.KaitoMod.block.BlockKaitoBlock;
import com.Kaito.KaitoMod.main.KaitoMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class KaitoModBlocks {

    public static class Blocks{

        public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, KaitoMod.MOD_ID);
        public static final RegistryObject<Block> KAITO_BLOCK = BLOCKS.register("kaito_block", BlockKaitoBlock::new);
    }

    public static class BlockItems{

        public static final DeferredRegister<Item> BLOCK_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, KaitoMod.MOD_ID);
        public static final RegistryObject<Item> KAITO_BLOCK = BLOCK_ITEMS.register("kaito_block", () -> new BlockItem(Blocks.KAITO_BLOCK.get(), new Item.Properties().fireResistant()));
    }
}
