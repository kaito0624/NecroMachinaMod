package com.Kaito.KaitoMod.regi;

import com.Kaito.KaitoMod.item.ItemKaitoInGod;
import com.Kaito.KaitoMod.main.KaitoMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class KaitoModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, KaitoMod.MOD_ID);
    public static final RegistryObject<Item> KAITO_INGOD = ITEMS.register("kaito_ingod", ItemKaitoInGod::new);

}
