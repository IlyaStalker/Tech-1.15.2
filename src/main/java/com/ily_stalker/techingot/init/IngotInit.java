package com.ily_stalker.techingot.init;

import com.ily_stalker.techingot.CreativeTab;
import com.ily_stalker.techingot.TechIngotCore;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = TechIngotCore.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(TechIngotCore.MODID)
public class IngotInit
{
    public static final Item copper_ingot = null;
    public static final Item tin_ingot = null;
    public static final Item bronze_ingot = null;
    public static final Item aluminium_ingot = null;
    public static final Item uranium_ingot = null;
    public static final Item tungsten_ingot = null;

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event)
    {
        event.getRegistry().register(new Item(new Item.Properties().group(CreativeTab.IngotItemGroup.TECH_INGOT)).setRegistryName("copper_ingot"));
        event.getRegistry().register(new Item(new Item.Properties().group(CreativeTab.IngotItemGroup.TECH_INGOT)).setRegistryName("tin_ingot"));
        event.getRegistry().register(new Item(new Item.Properties().group(CreativeTab.IngotItemGroup.TECH_INGOT)).setRegistryName("bronze_ingot"));
        event.getRegistry().register(new Item(new Item.Properties().group(CreativeTab.IngotItemGroup.TECH_INGOT)).setRegistryName("aluminium_ingot"));
        event.getRegistry().register(new Item(new Item.Properties().group(CreativeTab.IngotItemGroup.TECH_INGOT)).setRegistryName("uranium_ingot"));
        event.getRegistry().register(new Item(new Item.Properties().group(CreativeTab.IngotItemGroup.TECH_INGOT)).setRegistryName("tungsten_ingot"));
    }

}
