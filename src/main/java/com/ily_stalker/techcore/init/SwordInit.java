package com.ily_stalker.techcore.init;

import com.ily_stalker.techcore.CreativeTab;
import com.ily_stalker.techcore.TechCore;
import com.ily_stalker.techtool.toolmaterial.bronze_material;
import com.ily_stalker.techtool.toolmaterial.copper_material;
import com.ily_stalker.techtool.toolmaterial.tin_material;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = TechCore.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(TechCore.MODID)
public class SwordInit {

    public static final Item copper_sword = null;
    public static final Item tin_sword = null;
    public static final Item bronze_sword = null;

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new AxeItem(copper_material.TechToolTier.COPPER, 11, 0.0f, new Item.Properties().group(CreativeTab.SwordItemGroup.TECH_SWORD)).setRegistryName("copper_sword"));
        event.getRegistry().register(new AxeItem(tin_material.TechToolTier.TIN, 11, 0.0f, new Item.Properties().group(CreativeTab.SwordItemGroup.TECH_SWORD)).setRegistryName("tin_sword"));
        event.getRegistry().register(new AxeItem(bronze_material.TechToolTier.BRONZE, 11, 0.0f, new Item.Properties().group(CreativeTab.SwordItemGroup.TECH_SWORD)).setRegistryName("bronze_sword"));
    }

}
