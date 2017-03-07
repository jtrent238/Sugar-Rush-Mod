package com.jtrent238.sugarrush.blocks;

import com.jtrent238.sugarrush.tileentity.TileEntityCandyCrusher;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
//import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class BlockCandyCrusher extends Block{



	private static final Material mymaterial = Material.iron;
	private int TileEntityCandyCrusher;

	public BlockCandyCrusher(Material material) {
		super(mymaterial);
		this.hasTileEntity(TileEntityCandyCrusher);
	}
	
		
	
		
		public TileEntity createTileEntity(){
			return new TileEntityCandyCrusher();
			
		}
		
		
}