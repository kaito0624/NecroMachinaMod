package com.Kaito.KaitoMod.item;

import com.Kaito.KaitoMod.regi.KaitoModTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class ItemKaitoInGod extends Item {
    public ItemKaitoInGod() {
        super(new Properties()
                .fireResistant()
                .stacksTo(75)
        );
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);
        if(stack.is(KaitoModTags.Items.KAITO_SERIES)){
            player.addEffect((new MobEffectInstance(MobEffects.GLOWING, 20*60*3, 0)));
        }else {
            player.addEffect((new MobEffectInstance(MobEffects.DARKNESS, 20*60*3, 0)));
        }
        return InteractionResultHolder.consume(stack);
    }
}
