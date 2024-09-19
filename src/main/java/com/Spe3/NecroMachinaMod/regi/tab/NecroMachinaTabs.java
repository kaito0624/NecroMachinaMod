package com.Spe3.NecroMachinaMod.regi.tab;

import com.Spe3.NecroMachinaMod.main.NecroMachinaMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

//クリエイティブタブ
public class NecroMachinaTabs {

    public static final DeferredRegister<CreativeModeTab> MOD_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NecroMachinaMod.MOD_ID);

    //ネクロマシンMODタブ
    public static final RegistryObject<CreativeModeTab> NECROMACHINA_MAIN = MOD_TABS.register("necromachina_main",
            ()->{return CreativeModeTab.builder()
                    .icon(()->new ItemStack(Items.SKELETON_SKULL))
                    .title(Component.translatable("itemGroup.necromachina_main"))
                    .displayItems((param, output) -> {
                        for (Item item:NecroMachinaMain.items){
                            output.accept(item);
                        }
                    })
                    .build();
    });
}
