package com.ily_stalker.techtool.init;

import com.ily_stalker.techtool.CreativeTab;
import com.ily_stalker.techtool.TechToolCore;
import com.ily_stalker.techtool.toolmaterial.bronze_material;
import com.ily_stalker.techtool.toolmaterial.copper_material;
import com.ily_stalker.techtool.toolmaterial.tin_material;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = TechToolCore.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(TechToolCore.MODID)
public class AxeInit {

    public static final Item copper_axe = null;
    public static final Item tin_axe = null;
    public static final Item bronze_axe = null;

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new AxeItem(copper_material.TechToolTier.COPPER, 1, 0.0f, new Item.Properties().group(CreativeTab.ToolItemGroup.TECH_TOOL)).setRegistryName("copper_axe"));
        event.getRegistry().register(new AxeItem(tin_material.TechToolTier.TIN, 1, 0.0f, new Item.Properties().group(CreativeTab.ToolItemGroup.TECH_TOOL)).setRegistryName("tin_axe"));
        event.getRegistry().register(new AxeItem(bronze_material.TechToolTier.BRONZE, 1, 0.0f, new Item.Properties().group(CreativeTab.ToolItemGroup.TECH_TOOL)).setRegistryName("bronze_axe"));
    }

}