package com.ily_stalker.techore;

import com.ily_stalker.techore.init.OreInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = TechOreCore.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(TechOreCore.MODID)
public class CreativeTab {
    public static class OreItemGroup extends ItemGroup
    {
        public static final OreItemGroup TECH_ORE = new OreItemGroup(ItemGroup.GROUPS.length, "tech_ore");
        private OreItemGroup(int index, String label)
        {
            super(index, label);
        }

        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(OreInit.copper_ore);
        }
    }
}
