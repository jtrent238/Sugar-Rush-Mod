
package com.jtrent238.sugarrush;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraft.world.WorldType;
import net.minecraftforge.common.AchievementPage;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.Metadata;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


	public class Achievements {
    
	public static Achievement achievementinstall;
    

    
  
    
   
    
    public static void loadAchievements()
    {
    	achievementinstall = new Achievement("achievement.install", "install", 0, 0, new ItemStack(Items.golden_apple, 1), (Achievement)null).initIndependentStat().registerStat();
    	
    	AchievementPage.registerAchievementPage(new AchievementPage(SugarRushMod.MODID + SugarRushMod.MODVERSION + "Achievements", new Achievement[]{achievementinstall}));
    	
    	
    	
    	
    	
    	
    	
    }
    
    
}
