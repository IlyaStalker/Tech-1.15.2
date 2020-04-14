package com.ily_stalker.techore.worldgen;

import com.ily_stalker.techore.TechOreConfig;
import com.ily_stalker.techore.TechOreCore;
import com.ily_stalker.techore.init.OreInit;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = TechOreCore.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(TechOreCore.MODID)
public class OreGen
{
    public static void initGen()
    {
        for(Biome biome : ForgeRegistries.BIOMES)
        {
            if (ModConfigs.GENERATE_SOULSTONE.get()) {
                int size = ModConfigs.SOULSTONE_SPAWN_SIZE.get();
                int rate = ModConfigs.SOULSTONE_SPAWN_RATE.get();
                int height = ModConfigs.SOULSTONE_SPAWN_HEIGHT.get();
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, SoulstoneFeature.INSTANCE.withConfiguration(
                        new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, ModBlocks.SOULSTONE.get().getDefaultState(), size)
                ).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(rate, 0, 0, height))));
            }
        }
    }
}
