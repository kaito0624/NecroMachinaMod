package com.Kaito.KaitoMod.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;

public class BlockKaitoBlock extends Block {

    public BlockKaitoBlock() {
        super(Properties.of()
                .strength(5.0F, 1500)
                .sound(SoundType.ANVIL)
                .lightLevel((a) -> 15)
                .requiresCorrectToolForDrops()
        );
    }
}
