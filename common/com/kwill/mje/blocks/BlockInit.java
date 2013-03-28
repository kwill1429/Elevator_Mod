package com.kwill.mje.blocks;

import net.minecraft.block.Block;

import com.kwill.mje.helper.ModLogger;
import com.kwill.mje.libs.Vars;

import cpw.mods.fml.common.registry.GameRegistry;

public class BlockInit {
	
	public static Block elevatorBlock;
	public static Block detectorBlock;
	public static Block elerailBlock;
	
	public static void init() {
		
		elevatorBlock = new elevatorBlock(Vars.bid_elevatorBlock);
		GameRegistry.registerBlock(elevatorBlock, Vars.block_elevatorName);
		ModLogger.log("Block Loaded: " + Vars.block_elevatorName);
		
		detectorBlock = new detectorBlock(Vars.bid_detectorBlock);
		GameRegistry.registerBlock(detectorBlock, Vars.block_detectorName);
		ModLogger.log("Block Loaded: " + Vars.block_detectorName);
		
		elerailBlock = new elerailBlock(Vars.bid_elerailBlock);
		GameRegistry.registerBlock(elerailBlock, Vars.block_elerailName);
		ModLogger.log("Block Loaded: " + Vars.block_elerailName);
		
		initRecipe();
	}
	
	private static void initRecipe() {
		
	}
}
