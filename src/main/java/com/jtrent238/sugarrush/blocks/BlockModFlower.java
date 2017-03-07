package com.jtrent238.sugarrush.blocks;

import java.util.List;

import com.jtrent238.sugarrush.SugarRushMod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class BlockModFlower  extends BlockBush
{
    public static final String[][] field_149860_M = new String[][] {{"flower_chocolate"}, {"flower_vanilla"}, {"flower_strawberry"}, {"flower_Liquorice_Red"}, {"flower_Liquorice_Black"}, {"flower_0"}, {"flower_1"}, {"flower_2"}, {"flower_3"}, {"flower_4"} };
    public static final String[] field_149859_a = new String[] {};
    public static final String[] field_149858_b = new String[] {};
   
    @SideOnly(Side.CLIENT)
    private IIcon[] field_149861_N;
    private int field_149862_O;
    private static final String __OBFID = "CL_00000246";

    public BlockModFlower(int p_i2173_1_)
    {
        super(Material.plants);
        this.field_149862_O = p_i2173_1_;
        this.setCreativeTab(SugarRushMod.SugarRushMod);
        this.setBlockTextureName("sugarrush:" + field_149860_M);
    }

    /**
     * Gets the block's texture. Args: side, meta
     */
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int p_149691_1_, int p_149691_2_)
    {
        if (p_149691_2_ >= this.field_149861_N.length)
        {
            p_149691_2_ = 0;
        }

        return this.field_149861_N[p_149691_2_];
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(String[][] field149860m)
    {
        this.field_149861_N = new IIcon[field_149860_M[this.field_149862_O].length];

        for (int i = 0; i < this.field_149861_N.length; ++i)
        {
            //this.field_149861_N[i] = p_149651_1_.registerIcon(field_149860_M[this.field_149862_O][i]);
        	this.registerBlockIcons(field_149860_M);
        }
    }

    /**
     * Determines the damage on the item the block drops. Used in cloth and wood.
     */
    public int damageDropped(int p_149692_1_)
    {
        return p_149692_1_;
    }

    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item p_149666_1_, CreativeTabs p_149666_2_, List p_149666_3_)
    {
        //for (int i = 0; i < this.field_149861_N.length; ++i)
        {
            //p_149666_3_.add(new ItemStack(p_149666_1_, 1, i));
        }
        //this.getSubBlocks(p_149666_1_, p_149666_2_, p_149666_3_);
    }

    public static BlockFlower func_149857_e(String p_149857_0_)
    {
        String[] astring = field_149858_b;
        int i = astring.length;
        int j;
        String s1;

        for (j = 0; j < i; ++j)
        {
            s1 = astring[j];

            if (s1.equals(p_149857_0_))
            {
                return Blocks.yellow_flower;
            }
        }

        astring = field_149859_a;
        i = astring.length;

        for (j = 0; j < i; ++j)
        {
            s1 = astring[j];

            if (s1.equals(p_149857_0_))
            {
                return Blocks.red_flower;
            }
        }

        return null;
    }

    public static int func_149856_f(String p_149856_0_)
    {
        int i;

        for (i = 0; i < field_149858_b.length; ++i)
        {
            if (field_149858_b[i].equals(p_149856_0_))
            {
                return i;
            }
        }

        for (i = 0; i < field_149859_a.length; ++i)
        {
            if (field_149859_a[i].equals(p_149856_0_))
            {
                return i;
            }
        }

        return 0;
    }
    
}