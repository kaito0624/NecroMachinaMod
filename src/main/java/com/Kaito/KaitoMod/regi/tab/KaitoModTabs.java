package com.Kaito.KaitoMod.regi.tab;

import com.Kaito.KaitoMod.main.KaitoMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.awt.*;
import java.rmi.registry.Registry;

public class KaitoModTabs {

    public static final DeferredRegister<CreativeModeTab> MOD_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, KaitoMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> KAITO_MAIN = MOD_TABS.register("kaito_main",
            ()->{return CreativeModeTab.builder()
                    .icon(()->new ItemStack(Blocks.CHERRY_PLANKS))
                    .title(Component.translatable("itemGroup.Kaito_main"))
                    .displayItems((param,output)->{
                        for(Item item:KaitoMain.items){
                            output.accept(item);
                        }
                    })
                    .build();
    });

    public static final RegistryObject<CreativeModeTab> KAITO_SUB = MOD_TABS.register("kaito_sub",
            ()->{return CreativeModeTab.builder()
                    .icon(()->new ItemStack(Blocks.CHERRY_PLANKS))
                    .title(Component.translatable("itemGroup.Kaito_sub"))
                    .withTabsBefore(KaitoModTabs.KAITO_MAIN.getId())
                    .displayItems((param,output)->{
                        for(Item item:KaitoMain.items){
                            output.accept(item);
                        }
                    })
                    .build();
            });
}
