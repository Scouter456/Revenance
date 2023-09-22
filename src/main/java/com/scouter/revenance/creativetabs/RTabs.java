package com.scouter.revenance.creativetabs;

import com.scouter.revenance.Revenance;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class RTabs {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Revenance.MODID);

    private static final CreativeModeTab REVENANCE = new CreativeModeTab.Builder(CreativeModeTab.Row.TOP, 9)
            .withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
            .title(Component.translatable("itemGroup.revenance"))
            .icon(() -> new ItemStack(Items.NETHER_BRICK))
            .displayItems((d, entries) ->{


            })
            .build();



    public static final RegistryObject<CreativeModeTab> REVENANCE_TAB = TABS.register("revenance", () -> REVENANCE);
}
