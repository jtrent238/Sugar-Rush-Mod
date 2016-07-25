package com.jtrent238.sugarrush;

import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class ServerProxy {

	private static final String modid = "sugarrush";
	
	public void registerRenderThings() {

	}

	public int addArmor(String armor) {
		return 0;
	}
	
	public void registerNetworkStuff(){
		//NetworkRegistry.INSTANCE.registerGuiHandler(MainRegistry.modInstance, new TMGuiHandler());
	}

	public void registerTileEntities(){
		//GameRegistry.registerTileEntity(TileEntityPatChest.class, modid);
		//GameRegistry.registerTileEntity(TileEntityJenChest.class, modid);
	}
}