package com.jtrent238.sugarrush;

import com.jtrent238.sugarrush.items.ItemAJoy;
import com.jtrent238.sugarrush.items.ItemBottle_Honey;
import com.jtrent238.sugarrush.items.ItemBottle_Milk;
import com.jtrent238.sugarrush.items.ItemButterFinger;
import com.jtrent238.sugarrush.items.ItemCandyCane;
import com.jtrent238.sugarrush.items.ItemCrunch;
import com.jtrent238.sugarrush.items.ItemKitKat;
import com.jtrent238.sugarrush.items.ItemLiquorice_Black;
import com.jtrent238.sugarrush.items.ItemLiquorice_Red;
import com.jtrent238.sugarrush.items.ItemSnickers;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemRecord;
import net.minecraft.potion.Potion;

public class ItemLoader {

	
	public static Item ItemLiquorice_Black;
	public static Item ItemLiquorice_Red;
	public static Item ItemBottle_Honey;
	public static Item ItemBottle_Milk;
	public static Item ItemChocolateBar;
	public static Item ItemTest;
	public static Item ItemCandyCane;
	public static Item ItemButterFinger;
	public static Item ItemKitKat;
	public static Item ItemSnickers;
	public static Item ItemAJoy;
	public static Item ItemCrunch;



	/**
	 * Load Items.
	 */
public static void LoadItems() {

	ItemLiquorice_Black = new ItemLiquorice_Black(2, 2, false).setUnlocalizedName("ItemLiquorice_Black").setTextureName("sugarrush:ItemLiquorice_Black").setCreativeTab(SugarRushMod.SugarRushMod);
	ItemLiquorice_Red = new ItemLiquorice_Red(2, 2, false).setUnlocalizedName("ItemLiquorice_Red").setTextureName("sugarrush:ItemLiquorice_Red").setCreativeTab(SugarRushMod.SugarRushMod);
	ItemBottle_Honey = new ItemBottle_Honey().setUnlocalizedName("ItemBottle_Honey").setTextureName("sugarrush:ItemBottle_Honey").setCreativeTab(SugarRushMod.SugarRushMod);
	ItemBottle_Milk	 = new ItemBottle_Milk().setUnlocalizedName("ItemBottle_Milk").setTextureName("sugarrush:ItemBottle_Milk").setCreativeTab(SugarRushMod.SugarRushMod);
	ItemChocolateBar = new ItemChocolateBar(2, 2, false).setUnlocalizedName("ItemChocolateBar").setTextureName("sugarrush:ItemChocolateBar").setCreativeTab(SugarRushMod.SugarRushMod);
	ItemTest = new Item().setUnlocalizedName("ItemTest").setTextureName("sugarrush:ItemTest")/*/.setCreativeTab(SugarRushMod.SugarRushMod)/*/;
	ItemCandyCane = new ItemCandyCane(2, 2, false).setUnlocalizedName("ItemCandyCane").setTextureName("sugarrush:ItemCandyCane").setCreativeTab(SugarRushMod.SugarRushMod);
	ItemButterFinger = new ItemButterFinger(2, 2, false).setUnlocalizedName("ItemButterFinger").setTextureName("sugarrush:ItemButterFinger").setCreativeTab(SugarRushMod.SugarRushMod);
	ItemKitKat = new ItemKitKat(2, 2, false).setUnlocalizedName("ItemKitKat").setTextureName("sugarrush:ItemKitKat").setCreativeTab(SugarRushMod.SugarRushMod);
	ItemSnickers = new ItemSnickers(2, 2, false).setUnlocalizedName("ItemSnickers").setTextureName("sugarrush:ItemSnickers").setCreativeTab(SugarRushMod.SugarRushMod);
	ItemAJoy = new ItemAJoy(2, 2, false).setUnlocalizedName("ItemAJoy").setTextureName("sugarrush:ItemAJoy").setCreativeTab(SugarRushMod.SugarRushMod);
	ItemCrunch = new ItemCrunch(2, 2, false).setUnlocalizedName("ItemCrunch").setTextureName("sugarrush:ItemCrunch").setCreativeTab(SugarRushMod.SugarRushMod);
	
	
	
		registerItems();
}

/**
 * Register Items.
 */
private static void registerItems(){

	GameRegistry.registerItem(ItemLiquorice_Black, ItemLiquorice_Black.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(ItemLiquorice_Red, ItemLiquorice_Red.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(ItemBottle_Honey, ItemBottle_Honey.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(ItemBottle_Milk, ItemBottle_Milk.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(ItemChocolateBar, ItemChocolateBar.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(ItemTest, ItemTest.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(ItemCandyCane, ItemCandyCane.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(ItemButterFinger, ItemButterFinger.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(ItemKitKat, ItemKitKat.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(ItemSnickers, ItemSnickers.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(ItemAJoy, ItemAJoy.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(ItemCrunch, ItemCrunch.getUnlocalizedName().substring(5));
	
}

}
