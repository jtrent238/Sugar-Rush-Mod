package com.jtrent238.sugarrush;

import com.jtrent238.sugarrush.items.ItemBottle_Honey;
import com.jtrent238.sugarrush.items.ItemBottle_Milk;
import com.jtrent238.sugarrush.items.ItemLiquorice_Black;
import com.jtrent238.sugarrush.items.ItemLiquorice_Red;

/*
import com.jtrent238.epicproportions.items.itemCaptainCookieCookie;
import com.jtrent238.epicproportions.items.itemEpicProportionsStar;
import com.jtrent238.epicproportions.items.itemJenIngot;
import com.jtrent238.epicproportions.items.itemJenStar;
import com.jtrent238.epicproportions.items.itemJenslips;
import com.jtrent238.epicproportions.items.itemPatIngot;
import com.jtrent238.epicproportions.items.itemPatStar;
import com.jtrent238.epicproportions.items.itemSpawnEgg;
import com.jtrent238.epicproportions.items.itemgemofepicproportions;
import com.jtrent238.epicproportions.items.ammo.itemJenArrow;
import com.jtrent238.epicproportions.items.ammo.itemPatArrow;
import com.jtrent238.epicproportions.items.armor.ItemJenArmor;
import com.jtrent238.epicproportions.items.armor.ItemPatArmor;
import com.jtrent238.epicproportions.items.armor.ItemSuperJenArmor;
import com.jtrent238.epicproportions.items.armor.ItemSuperPatArmor;
import com.jtrent238.epicproportions.items.blockplacers.itemBirthdayPresent;
import com.jtrent238.epicproportions.items.spawners.itemSpawnBomby;
import com.jtrent238.epicproportions.items.spawners.itemSpawnCandyMan;
import com.jtrent238.epicproportions.items.spawners.itemSpawnCandyPopper;
import com.jtrent238.epicproportions.items.spawners.itemSpawnCaptianCookie;
import com.jtrent238.epicproportions.items.spawners.itemSpawnClown;
import com.jtrent238.epicproportions.items.spawners.itemSpawnCookieLittle;
import com.jtrent238.epicproportions.items.spawners.itemSpawnFred2_0;
import com.jtrent238.epicproportions.items.spawners.itemSpawnJen;
import com.jtrent238.epicproportions.items.spawners.itemSpawnNinjaMaster;
import com.jtrent238.epicproportions.items.spawners.itemSpawnPat;
import com.jtrent238.epicproportions.items.spawners.itemSpawnSparky;
import com.jtrent238.epicproportions.items.spawners.itemSpawnjtrent238;
import com.jtrent238.epicproportions.items.structureplacers.itemBombyStructurePlacer;
import com.jtrent238.epicproportions.items.structureplacers.itemHouseOfEpicProportionsPlacer;
import com.jtrent238.epicproportions.items.structureplacers.itemTNTSwordPlacer;
import com.jtrent238.epicproportions.items.tools.itemJenAxe;
import com.jtrent238.epicproportions.items.tools.itemJenHoe;
import com.jtrent238.epicproportions.items.tools.itemJenMultiTool;
import com.jtrent238.epicproportions.items.tools.itemJenPick;
import com.jtrent238.epicproportions.items.tools.itemJenShovel;
import com.jtrent238.epicproportions.items.tools.itemPatAxe;
import com.jtrent238.epicproportions.items.tools.itemPatHoe;
import com.jtrent238.epicproportions.items.tools.itemPatMultiTool;
import com.jtrent238.epicproportions.items.tools.itemPatPick;
import com.jtrent238.epicproportions.items.tools.itemPatShovel;
import com.jtrent238.epicproportions.items.tools.staffs.itemJenStaff;
import com.jtrent238.epicproportions.items.tools.staffs.itemPatStaff;
import com.jtrent238.epicproportions.items.tools.weapons.itemJenSword;
import com.jtrent238.epicproportions.items.tools.weapons.itemPatSword;
import com.jtrent238.epicproportions.items.tools.weapons.bows.itemJenBow;
import com.jtrent238.epicproportions.items.tools.weapons.bows.itemPatBow;
*/
/*
import com.jtrent238.foodmod.FoodMod;
import com.jtrent238.mcrustmod.items.can_beans_empty;
import com.jtrent238.mcrustmod.items.can_tuna_empty;
import com.jtrent238.mcrustmod.items.ammo.ammo_handmade_shell;
import com.jtrent238.mcrustmod.items.ammo.ammo_pistol;
import com.jtrent238.mcrustmod.items.ammo.ammo_pistol_fire;
import com.jtrent238.mcrustmod.items.ammo.ammo_pistol_hv;
import com.jtrent238.mcrustmod.items.ammo.ammo_rifle;
import com.jtrent238.mcrustmod.items.ammo.ammo_rifle_explosive;
import com.jtrent238.mcrustmod.items.ammo.ammo_rifle_hv;
import com.jtrent238.mcrustmod.items.ammo.ammo_rifle_incendiary;
import com.jtrent238.mcrustmod.items.ammo.ammo_rocket_basic;
import com.jtrent238.mcrustmod.items.ammo.ammo_rocket_fire;
import com.jtrent238.mcrustmod.items.ammo.ammo_rocket_hv;
import com.jtrent238.mcrustmod.items.ammo.ammo_rocket_smoke;
import com.jtrent238.mcrustmod.items.ammo.ammo_shotgun;
import com.jtrent238.mcrustmod.items.ammo.ammo_shotgun_slug;
import com.jtrent238.mcrustmod.items.ammo.arrow_hv;
import com.jtrent238.mcrustmod.items.ammo.arrow_wooden;
import com.jtrent238.mcrustmod.items.food.can_beans;
import com.jtrent238.mcrustmod.items.food.can_tuna;
import com.jtrent238.mcrustmod.items.seeds.seed_corn;
import com.jtrent238.mcrustmod.items.seeds.seed_hemp;
import com.jtrent238.mcrustmod.items.seeds.seed_pumpkin;
import com.jtrent238.mcrustmod.items.tools.axe_salvaged;
import com.jtrent238.mcrustmod.items.tools.hammer;
import com.jtrent238.mcrustmod.items.tools.hammer_salvaged;
import com.jtrent238.mcrustmod.items.tools.hatchet;
import com.jtrent238.mcrustmod.items.tools.icepick_salvaged;
import com.jtrent238.mcrustmod.items.tools.lantern;
import com.jtrent238.mcrustmod.items.tools.pickaxe;
import com.jtrent238.mcrustmod.items.tools.stone_hatchet;
import com.jtrent238.mcrustmod.items.tools.stone_pickaxe;
import com.jtrent238.weaponmod.Itemcheeseknife;
*/
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



	/**
	 * Load Items.
	 */
public static void LoadItems() {

	ItemLiquorice_Black = new ItemLiquorice_Black(2, 2, false).setUnlocalizedName("ItemLiquorice_Black").setTextureName("sugarrush:ItemLiquorice_Black").setCreativeTab(SugarRushMod.SugarRushMod);
	ItemLiquorice_Red = new ItemLiquorice_Red(2, 2, false).setUnlocalizedName("ItemLiquorice_Red").setTextureName("sugarrush:ItemLiquorice_Red").setCreativeTab(SugarRushMod.SugarRushMod);
	ItemBottle_Honey = new ItemBottle_Honey().setUnlocalizedName("ItemBottle_Honey").setTextureName("sugarrush:ItemBottle_Honey").setCreativeTab(SugarRushMod.SugarRushMod);
	ItemBottle_Milk	 = new ItemBottle_Milk().setUnlocalizedName("ItemBottle_Milk").setTextureName("sugarrush:ItemBottle_Milk").setCreativeTab(SugarRushMod.SugarRushMod);
	
	
	
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
	
}

}
