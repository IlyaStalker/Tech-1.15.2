package com.ily_stalker.techore;

import com.ily_stalker.techore.init.OreInit;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class TechOreGen {
    public static void generateOre() {
        for (Biome biome : ForgeRegistries.BIOMES) {
            if (biome == Biomes.BAMBOO_JUNGLE) {
                ConfiguredPlacement<CountRangeConfig> customConfig = Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(9, 10, 10, 0));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, OreInit.copper_ore.getDefaultState(), 10)).withPlacement(customConfig));
            }
        }
    }
}
