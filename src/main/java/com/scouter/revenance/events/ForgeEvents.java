package com.scouter.revenance.events;

import com.mojang.logging.LogUtils;
import com.scouter.revenance.Revenance;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

@Mod.EventBusSubscriber(modid = Revenance.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ForgeEvents {
    private static final Logger LOGGER = LogUtils.getLogger();

}

