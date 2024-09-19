package com.Spe3.NecroMachinaMod.regi;

import com.Spe3.NecroMachinaMod.item.ItemSkeletonRemains;
import com.Spe3.NecroMachinaMod.item.ItemSoul;
import com.Spe3.NecroMachinaMod.main.NecroMachinaMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class NecroMachinaModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, NecroMachinaMod.MOD_ID);

    public static final RegistryObject<Item> SKELETON_REMAINS = ITEMS.register("skeleton_remains", ItemSkeletonRemains::new);
    public static final RegistryObject<Item> SOUL = ITEMS.register("soul", ItemSoul::new);

}
