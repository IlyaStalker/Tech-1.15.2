package com.ily_stalker.techtool.init;

import com.ily_stalker.techtool.CreativeTab;
import com.ily_stalker.techtool.TechToolCore;
import com.ily_stalker.techtool.toolmaterial.bronze_material;
import com.ily_stalker.techtool.toolmaterial.copper_material;
import com.ily_stalker.techtool.toolmaterial.tin_material;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = TechToolCore.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(TechToolCore.MODID)
public class PickaxeInit {

    public static final Item copper_pickaxe = null;
    public static final Item tin_pickaxe = null;
    public static final Item bronze_pickaxe = null;

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new PickaxeItem(copper_material.TechToolTier.COPPER, 1, 0.0f, new Item.Properties().group(CreativeTab.ToolItemGroup.TECH_TOOL)).setRegistryName("copper_pickaxe"));
        event.getRegistry().register(new PickaxeItem(tin_material.TechToolTier.TIN, 1, 0.0f, new Item.Properties().group(CreativeTab.ToolItemGroup.TECH_TOOL)).setRegistryName("tin_pickaxe"));
        event.getRegistry().register(new PickaxeItem(bronze_material.TechToolTier.BRONZE, 1, 0.0f, new Item.Properties().group(CreativeTab.ToolItemGroup.TECH_TOOL)).setRegistryName("bronze_pickaxe"));
    }

}
