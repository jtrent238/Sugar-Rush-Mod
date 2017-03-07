package com.jtrent238.sugarrush;

import com.jtrent238.sugarrush.blocks.BlockCandyCrusher;
import com.jtrent238.sugarrush.blocks.BlockModFlower;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockLoader {
/*
	public static Block BlockModFlower_0;
	public static Block BlockModFlower_1;
	public static Block BlockModFlower_2;
	public static Block BlockModFlower_3;
	public static Block BlockModFlower_4;
	public static Block BlockModFlower_5;
	public static Block BlockModFlower_6;
	public static Block BlockModFlower_7;
	public static Block BlockModFlower_8;
	public static Block BlockModFlower_9;
	public static Block BlockModFlower_10;
*/
	public static Block BlockCandyCrusher;
	
	/**
	 * Load Blocks.
	 */
	public static void loadBlocks() {
		/*
		BlockModFlower_0 = new BlockModFlower(0).setBlockName("BlockModFlower").setBlockTextureName("sugarrush:BlockModFlower" + BlockModFlower.field_149860_M).setCreativeTab(SugarRushMod.SugarRushMod);
		BlockModFlower_1 = new BlockModFlower(1).setBlockName("BlockModFlower").setBlockTextureName("sugarrush:BlockModFlower" + BlockModFlower.field_149860_M).setCreativeTab(SugarRushMod.SugarRushMod);
		BlockModFlower_2 = new BlockModFlower(2).setBlockName("BlockModFlower").setBlockTextureName("sugarrush:BlockModFlower" + BlockModFlower.field_149860_M).setCreativeTab(SugarRushMod.SugarRushMod);
		BlockModFlower_3 = new BlockModFlower(3).setBlockName("BlockModFlower").setBlockTextureName("sugarrush:BlockModFlower" + BlockModFlower.field_149860_M).setCreativeTab(SugarRushMod.SugarRushMod);
		BlockModFlower_4 = new BlockModFlower(4).setBlockName("BlockModFlower").setBlockTextureName("sugarrush:BlockModFlower" + BlockModFlower.field_149860_M).setCreativeTab(SugarRushMod.SugarRushMod);
		BlockModFlower_5 = new BlockModFlower(5).setBlockName("BlockModFlower").setBlockTextureName("sugarrush:BlockModFlower" + BlockModFlower.field_149860_M).setCreativeTab(SugarRushMod.SugarRushMod);
		BlockModFlower_6 = new BlockModFlower(6).setBlockName("BlockModFlower").setBlockTextureName("sugarrush:BlockModFlower" + BlockModFlower.field_149860_M).setCreativeTab(SugarRushMod.SugarRushMod);
		BlockModFlower_7 = new BlockModFlower(7).setBlockName("BlockModFlower").setBlockTextureName("sugarrush:BlockModFlower" + BlockModFlower.field_149860_M).setCreativeTab(SugarRushMod.SugarRushMod);
		BlockModFlower_8 = new BlockModFlower(8).setBlockName("BlockModFlower").setBlockTextureName("sugarrush:BlockModFlower" + BlockModFlower.field_149860_M).setCreativeTab(SugarRushMod.SugarRushMod);
		BlockModFlower_9 = new BlockModFlower(9).setBlockName("BlockModFlower").setBlockTextureName("sugarrush:BlockModFlower" + BlockModFlower.field_149860_M).setCreativeTab(SugarRushMod.SugarRushMod);
		BlockModFlower_10 = new BlockModFlower(10).setBlockName("BlockModFlower").setBlockTextureName("sugarrush:BlockModFlower" + BlockModFlower.field_149860_M).setCreativeTab(SugarRushMod.SugarRushMod);
		*/
		BlockCandyCrusher = new BlockCandyCrusher(Material.iron).setBlockName("BlockCandyCrusher").setBlockTextureName("sugarrush:BlockCandyCrusher").setCreativeTab(SugarRushMod.SugarRushMod);
		
		
		registerBlocks();
	}

	/**
	 * Register Blocks.
	 */
	private static void registerBlocks(){
		/*
		GameRegistry.registerBlock(BlockModFlower_0, "BlockModFlower_0");
		GameRegistry.registerBlock(BlockModFlower_1, "BlockModFlower_1");
		GameRegistry.registerBlock(BlockModFlower_2, "BlockModFlower_2");
		GameRegistry.registerBlock(BlockModFlower_3, "BlockModFlower_3");
		GameRegistry.registerBlock(BlockModFlower_4, "BlockModFlower_4");
		GameRegistry.registerBlock(BlockModFlower_5, "BlockModFlower_5");
		GameRegistry.registerBlock(BlockModFlower_6, "BlockModFlower_6");
		GameRegistry.registerBlock(BlockModFlower_7, "BlockModFlower_7");
		GameRegistry.registerBlock(BlockModFlower_8, "BlockModFlower_8");
		GameRegistry.registerBlock(BlockModFlower_9, "BlockModFlower_9");
		GameRegistry.registerBlock(BlockModFlower_10, "BlockModFlower_10");
		*/
		GameRegistry.registerBlock(BlockCandyCrusher, "BlockCandyCrusher");
		
	}
}
