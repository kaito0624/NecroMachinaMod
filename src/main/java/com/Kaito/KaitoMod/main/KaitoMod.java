package com.Kaito.KaitoMod.main;

import com.Kaito.KaitoMod.regi.KaitoModItems;
import com.Kaito.KaitoMod.regi.tab.KaitoModTabs;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("kaitomod")    //kaitomod : アルファベットの小文字のみ
public class KaitoMod {
    public static final String MOD_ID = "kaitomod";
    //コンストラクタ
    public KaitoMod(){
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        KaitoModItems.ITEMS.register(bus);
        KaitoModTabs.MOD_TABS.register(bus);
    }
}




