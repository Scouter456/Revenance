package com.scouter.revenance.setup;

import com.mojang.logging.LogUtils;
import com.scouter.revenance.blocks.RBlocks;
import com.scouter.revenance.creativetabs.RTabs;
import com.scouter.revenance.entity.REntity;
import com.scouter.revenance.items.RItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;


public class Registration {
    private static final Logger LOGGER = LogUtils.getLogger();
    public static void init(){

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        //ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
        RItems.ITEMS.register(bus);
        RBlocks.BLOCKS.register(bus);
        REntity.ENTITY_TYPES.register(bus);
        RTabs.TABS.register(bus);

    }
}
