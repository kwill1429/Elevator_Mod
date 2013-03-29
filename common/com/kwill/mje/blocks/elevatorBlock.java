package com.kwill.mje.blocks;

import com.kwill.mje.libs.Vars;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class elevatorBlock extends Block {

	public elevatorBlock(int par1) {
		super(par1, Material.iron);
		this.setUnlocalizedName(Vars.block_detectorName);
	}
	
	@Override
	public void registerIcons(IconRegister icon) {
		blockIcon = icon.registerIcon(Vars.mod_modid+":"+Vars.block_detectorName);
	}
	
}
