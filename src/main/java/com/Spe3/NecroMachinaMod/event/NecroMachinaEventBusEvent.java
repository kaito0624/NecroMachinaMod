package com.Spe3.NecroMachinaMod.event;

import com.Spe3.NecroMachinaMod.entity.NecroMachinaEntities;
import com.Spe3.NecroMachinaMod.entity.custom.BlueSkeleton;
import com.Spe3.NecroMachinaMod.main.NecroMachinaMod;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.swing.text.html.parser.Entity;

@Mod.EventBusSubscriber(modid = NecroMachinaMod.MOD_ID,
        bus = Mod.EventBusSubscriber.Bus.MOD)

public class NecroMachinaEventBusEvent {

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event){
        event.put(NecroMachinaEntities.BLUE_SKELETON.get(),
                BlueSkeleton.createAttributes().build());
    }
}
