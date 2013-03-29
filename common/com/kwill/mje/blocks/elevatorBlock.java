package com.kwill.mje.blocks;

import com.kwill.mje.helper.ModLogger;
import com.kwill.mje.libs.Vars;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class ElevatorBlock extends Block {

	public ElevatorBlock(int par1) {
		super(par1, Material.iron);
		this.setUnlocalizedName(Vars.block_elevatorName);
		this.setCreativeTab(CreativeTabs.tabBlock);
		
	}
	
	@Override
	public void registerIcons(IconRegister icon) {
		blockIcon = icon.registerIcon(Vars.mod_modid+":"+Vars.block_elevatorName);
		ModLogger.log("Texture Loaded: " + Vars.block_elevatorName);
	}
	
	
}
