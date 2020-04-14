package com.ily_stalker.techtool;

import com.ily_stalker.techtool.init.AxeInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = TechToolCore.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(TechToolCore.MODID)
public class CreativeTab
{
    public static class ToolItemGroup extends ItemGroup
    {
        public static final ToolItemGroup TECH_TOOL = new ToolItemGroup(ItemGroup.GROUPS.length, "tech_tool");
        private ToolItemGroup(int index, String label)
        {
            super(index, label);
        }

        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(AxeInit.copper_axe);
        }
    }
}
