package com.ily_stalker.techtool.init;

import com.ily_stalker.techtool.CreativeTab;
import com.ily_stalker.techtool.TechToolCore;
import com.ily_stalker.techtool.toolmaterial.bronze_material;
import com.ily_stalker.techtool.toolmaterial.copper_material;
import com.ily_stalker.techtool.toolmaterial.tin_material;
import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = TechToolCore.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(TechToolCore.MODID)
public class ShovelInit {

    public static final Item copper_shovel = null;
    public static final Item tin_shovel = null;
    public static final Item bronze_shovel = null;

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new ShovelItem(copper_material.TechToolTier.COPPER, 1, 0.0f, new Item.Properties().group(CreativeTab.ToolItemGroup.TECH_TOOL)).setRegistryName("copper_shovel"));
        event.getRegistry().register(new ShovelItem(tin_material.TechToolTier.TIN, 1, 0.0f, new Item.Properties().group(CreativeTab.ToolItemGroup.TECH_TOOL)).setRegistryName("tin_shovel"));
        event.getRegistry().register(new ShovelItem(bronze_material.TechToolTier.BRONZE, 1, 0.0f, new Item.Properties().group(CreativeTab.ToolItemGroup.TECH_TOOL)).setRegistryName("bronze_shovel"));
    }

}
