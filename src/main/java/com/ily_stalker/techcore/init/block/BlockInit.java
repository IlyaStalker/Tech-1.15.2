package com.ily_stalker.techcore.init.block;

import com.ily_stalker.techcore.CreativeTab;
import com.ily_stalker.techcore.TechCore;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = TechCore.MODID, bus = Bus.MOD)
@ObjectHolder(TechCore.MODID)
public class BlockInit
{
    public static final Block cobble = null;
    public static final Block coble2 = null;

    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event)
    {
        event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1f, 15.0f).sound(SoundType.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE)).setRegistryName("cobble"));
        event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1f, 15.0f).sound(SoundType.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE)).setRegistryName("coble2"));
    }

    @SubscribeEvent
    public static void registerBlockItems(final RegistryEvent.Register<Item> event)
    {
        event.getRegistry().register(new BlockItem(cobble, new Item.Properties().maxStackSize(64).group(CreativeTab.MiscItemGroup.TECH_MISC)).setRegistryName("cobble"));
        event.getRegistry().register(new BlockItem(coble2, new Item.Properties().maxStackSize(64).group(CreativeTab.MiscItemGroup.TECH_MISC)).setRegistryName("coble2"));
    }

}
