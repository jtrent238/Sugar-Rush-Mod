package com.jtrent238.sugarrush.tileentity;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class TileEntityCandyCrusher extends TileEntity{

	public int Field_TileEntityCandyCrusher;

	@Override
	  public void writeToNBT(NBTTagCompound par1)
	  {
	     super.writeToNBT(par1);
	     this.Field_TileEntityCandyCrusher = par1.getInteger("Field_TileEntityCandyCrusher");
	  }

	 @Override
	  public void readFromNBT(NBTTagCompound par1)
	  {
	     super.readFromNBT(par1);
	     par1.setInteger("customField", Field_TileEntityCandyCrusher);
	  }
	 
	 
}
