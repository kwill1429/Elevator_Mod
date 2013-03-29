package com.kwill.mje.blocks;

import java.util.Random;

import com.kwill.mje.libs.Vars;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class ElerailBlock extends Block {

	public ElerailBlock(int par1) {
		super(par1, Material.iron);
		setUnlocalizedName(Vars.block_elerailName);
		setCreativeTab(CreativeTabs.tabRedstone);
	}
	
	public int idDropped(int par1, Random par2Random, int par3){
	       
		return Vars.bid_elerailBlock;
    }
	
	@Override
	public void registerIcons(IconRegister icon) {
		blockIcon = icon.registerIcon(Vars.mod_modid + ":" + Vars.block_elerailName);
	}

}
