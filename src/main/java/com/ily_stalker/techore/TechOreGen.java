package com.ily_stalker.techore;

import com.mojang.datafixers.Dynamic;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import java.util.function.Function;

public class TechOreGen extends Feature<OreFeatureConfig> {
    public TechOreGen(Function<Dynamic<?>, ? extends OreFeatureConfig> configFactoryIn) {
        super(configFactoryIn);
    }
}
