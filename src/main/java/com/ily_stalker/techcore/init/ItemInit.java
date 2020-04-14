package com.ily_stalker.techcore.init;

import com.ily_stalker.techcore.CreativeTab;
import com.ily_stalker.techcore.TechCore;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = TechCore.MODID, bus = Bus.MOD)
@ObjectHolder(TechCore.MODID)
public class ItemInit
{
    public static final Item ad = null;
    public static final Item as = null;
    public static final Item af = null;

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event)
    {
        event.getRegistry().register(new Item(new Item.Properties().group(CreativeTab.MiscItemGroup.TECH_MISC)).setRegistryName("ad"));
        event.getRegistry().register(new Item(new Item.Properties().group(CreativeTab.MiscItemGroup.TECH_MISC)).setRegistryName("as"));
        event.getRegistry().register(new Item(new Item.Properties().group(CreativeTab.MiscItemGroup.TECH_MISC)).setRegistryName("af"));
    }

}
