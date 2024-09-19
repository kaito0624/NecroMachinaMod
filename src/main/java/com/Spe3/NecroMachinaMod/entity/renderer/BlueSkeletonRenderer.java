package com.Spe3.NecroMachinaMod.entity.renderer;

import com.Spe3.NecroMachinaMod.entity.custom.BlueSkeleton;
import com.Spe3.NecroMachinaMod.entity.model.BlueSkeletonModel;
import com.Spe3.NecroMachinaMod.main.NecroMachinaMod;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class BlueSkeletonRenderer extends MobRenderer<BlueSkeleton, BlueSkeletonModel<BlueSkeleton>> {

    private static final ResourceLocation BLUE_SKELETON_LOCATION =
            new ResourceLocation(NecroMachinaMod.MOD_ID, "textures/entity/blue_skeleton.png");


    public BlueSkeletonRenderer(EntityRendererProvider.Context p_174304_) {
        super(p_174304_,
                new BlueSkeletonModel<>(p_174304_.bakeLayer(BlueSkeletonModel.LAYER_LOCATION)),
                0.25f
                );
    }

    @Override
    public ResourceLocation getTextureLocation(BlueSkeleton blueSkeleton) {
        return BLUE_SKELETON_LOCATION;
    }
}
