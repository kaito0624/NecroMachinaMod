package com.Spe3.NecroMachinaMod.main;

import com.Spe3.NecroMachinaMod.regi.tab.NecroMachinaTabs;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("necromachinamod")
public class NecroMachinaMod {

    public static final String MOD_ID = "necromachinamod";

    public NecroMachinaMod(){

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        NecroMachinaTabs.MOD_TABS.register(bus);
        
    }
}
