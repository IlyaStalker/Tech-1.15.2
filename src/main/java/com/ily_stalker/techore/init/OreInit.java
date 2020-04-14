package com.ily_stalker.techore.init;

import com.ily_stalker.techore.CreativeTab;
import com.ily_stalker.techore.TechOreCore;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = TechOreCore.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(TechOreCore.MODID)
public class OreInit
{
    public static final Block copper_ore = null;
    public static final Block tin_ore = null;
    public static final Block tungsten_ore = null;
    public static final Block uranium_ore = null;
    public static final Block bauxite_ore = null;

    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.5f, 15.0f).sound(SoundType.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE)).setRegistryName("copper_ore"));
        event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.5f, 15.0f).sound(SoundType.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE)).setRegistryName("tin_ore"));
        event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.5f, 15.0f).sound(SoundType.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE)).setRegistryName("tungsten_ore"));
        event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.5f, 15.0f).sound(SoundType.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE)).setRegistryName("uranium_ore"));
        event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.5f, 15.0f).sound(SoundType.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE)).setRegistryName("bauxite_ore"));
    }

    @SubscribeEvent
    public static void registerBlockItems(final RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new BlockItem(copper_ore, new Item.Properties().maxStackSize(64).group(CreativeTab.OreItemGroup.TECH_ORE)).setRegistryName("copper_ore"));
        event.getRegistry().register(new BlockItem(tin_ore, new Item.Properties().maxStackSize(64).group(CreativeTab.OreItemGroup.TECH_ORE)).setRegistryName("tin_ore"));
        event.getRegistry().register(new BlockItem(tungsten_ore, new Item.Properties().maxStackSize(64).group(CreativeTab.OreItemGroup.TECH_ORE)).setRegistryName("tungsten_ore"));
        event.getRegistry().register(new BlockItem(uranium_ore, new Item.Properties().maxStackSize(64).group(CreativeTab.OreItemGroup.TECH_ORE)).setRegistryName("uranium_ore"));
        event.getRegistry().register(new BlockItem(bauxite_ore, new Item.Properties().maxStackSize(64).group(CreativeTab.OreItemGroup.TECH_ORE)).setRegistryName("bauxite_ore"));
    }

}
