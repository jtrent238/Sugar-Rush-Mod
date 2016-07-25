package com.jtrent238.sugarrush;

import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends ServerProxy{
	
	public void registerRenderThings(){
/*
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityJenChest.class, new JenChestRenderer());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockLoader.blockJenChest), new ItemRenderJenChest());
		*/
		/*
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPatChest.class, new PatChestRenderer());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockLoader.blockPatChest), new ItemRenderPatChest());
	*/
	}
	
	public int addArmor(String armor){
		return RenderingRegistry.addNewArmourRendererPrefix(armor);
	}
}