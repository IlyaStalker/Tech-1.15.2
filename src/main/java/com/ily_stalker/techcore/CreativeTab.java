package com.ily_stalker.techcore;

import com.ily_stalker.techcore.init.block.BlockInit;
import com.ily_stalker.techcore.init.SwordInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = TechCore.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(TechCore.MODID)
public class CreativeTab
{
    public static class SwordItemGroup extends ItemGroup
    {
        public static final SwordItemGroup TECH_SWORD = new SwordItemGroup(ItemGroup.GROUPS.length, "tech_sword");
        private SwordItemGroup(int index, String label)
        {
            super(index, label);
        }

        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(SwordInit.copper_sword);
        }
    }

    public static class MiscItemGroup extends ItemGroup
    {
        public static final SwordItemGroup TECH_MISC = new SwordItemGroup(ItemGroup.GROUPS.length, "tech_misc");
        private MiscItemGroup(int index, String label)
        {
            super(index, label);
        }

        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(BlockInit.cobble);
        }
    }
}
