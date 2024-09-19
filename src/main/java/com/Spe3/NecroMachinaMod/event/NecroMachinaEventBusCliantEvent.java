package com.Spe3.NecroMachinaMod.event;

import com.Spe3.NecroMachinaMod.entity.NecroMachinaEntities;
import com.Spe3.NecroMachinaMod.entity.model.BlueSkeletonModel;
import com.Spe3.NecroMachinaMod.entity.renderer.BlueSkeletonRenderer;
import com.Spe3.NecroMachinaMod.main.NecroMachinaMod;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = NecroMachinaMod.MOD_ID,
        bus = Mod.EventBusSubscriber.Bus.MOD,
        value = Dist.CLIENT)
public class NecroMachinaEventBusCliantEvent {

    @SubscribeEvent
    public static void registerLayerDefinition(EntityRenderersEvent.RegisterLayerDefinitions event){
        event.registerLayerDefinition(BlueSkeletonModel.LAYER_LOCATION, BlueSkeletonModel::createBodyLayer);
    }

    @SubscribeEvent
    public static void registerRenderer(EntityRenderersEvent.RegisterRenderers event){
        event.registerEntityRenderer(NecroMachinaEntities.BLUE_SKELETON.get(), BlueSkeletonRenderer::new);
    }


}
