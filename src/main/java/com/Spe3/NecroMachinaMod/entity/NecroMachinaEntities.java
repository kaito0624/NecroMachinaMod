package com.Spe3.NecroMachinaMod.entity;

import com.Spe3.NecroMachinaMod.entity.custom.BlueSkeleton;
import com.Spe3.NecroMachinaMod.main.NecroMachinaMod;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class NecroMachinaEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES,
                    NecroMachinaMod.MOD_ID);

    public static final RegistryObject<EntityType<BlueSkeleton>> BLUE_SKELETON =
            ENTITY_TYPES.register("blue_skeleton",
                    () -> EntityType.Builder.of(BlueSkeleton::new, MobCategory.CREATURE)
                            .build("blue_skeleton"));

    public static void register(IEventBus eventBus){
        ENTITY_TYPES.register(eventBus);
    }
}
