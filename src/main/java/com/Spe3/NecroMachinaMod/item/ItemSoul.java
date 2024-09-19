package com.Spe3.NecroMachinaMod.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class ItemSoul extends Item {
    public ItemSoul() {
        super(new Properties()
                .stacksTo(1)
                .rarity(Rarity.EPIC)
        );
    }
}
