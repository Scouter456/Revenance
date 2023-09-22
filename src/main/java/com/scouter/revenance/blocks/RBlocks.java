package com.scouter.revenance.blocks;

import com.mojang.logging.LogUtils;
import com.scouter.revenance.Revenance;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.slf4j.Logger;

@Mod.EventBusSubscriber(modid = Revenance.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class RBlocks {
    private static final Logger LOGGER = LogUtils.getLogger();
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Revenance.MODID);

}
