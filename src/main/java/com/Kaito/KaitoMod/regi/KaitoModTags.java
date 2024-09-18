package com.Kaito.KaitoMod.regi;

import com.Kaito.KaitoMod.main.KaitoMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class KaitoModTags {

    public static class Blocks{
        private static TagKey<Block> tag (String name){
            return BlockTags.create(new ResourceLocation(KaitoMod.MOD_ID, name));
        }
    }

    public static class Items{

        public static final TagKey<Item> KAITO_SERIES = tag("kaito_series");

        private static TagKey<Item> tag (String name){
            return ItemTags.create(new ResourceLocation(KaitoMod.MOD_ID, name));
        }
    }
}
