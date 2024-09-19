package com.Spe3.NecroMachinaMod.main;

import com.Spe3.NecroMachinaMod.regi.NecroMachinaModItems;
import com.Spe3.NecroMachinaMod.regi.NecroMachinaModBlocks;
import com.Spe3.NecroMachinaMod.regi.tab.NecroMachinaTabs;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("necromachinamod")
public class NecroMachinaMod {

    public static final String MOD_ID = "necromachinamod";

    public NecroMachinaMod(){

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        // アイテムの登録
        NecroMachinaModItems.ITEMS.register(bus);

        // ブロックの登録を追加
        NecroMachinaModBlocks.BLOCKS.register(bus);

        // タブの登録
        NecroMachinaTabs.MOD_TABS.register(bus);
    }
}
