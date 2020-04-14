package com.ily_stalker.techingot;

import com.ily_stalker.techingot.init.IngotInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = TechIngotCore.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(TechIngotCore.MODID)
public class CreativeTab
{

    public static class IngotItemGroup extends ItemGroup
    {
        public static final IngotItemGroup TECH_INGOT = new IngotItemGroup(ItemGroup.GROUPS.length, "tech_ingot");
        private IngotItemGroup(int index, String label)
        {
            super(index, label);
        }

        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(IngotInit.copper_ingot);
        }
    }
}
