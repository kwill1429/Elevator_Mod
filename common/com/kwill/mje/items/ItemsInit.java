package com.kwill.mje.items;

import com.kwill.mje.helper.ModLogger;
import com.kwill.mje.libs.Vars;

import cpw.mods.fml.common.registry.GameRegistry;

import net.minecraft.item.Item;

public class ItemsInit {
	
	public static Item wrenchItem;
	public static Item sigtestItem;
	
	public static void init() {
		
		wrenchItem = new WrenchItem(Vars.iid_wrenchItem);
		GameRegistry.registerItem(wrenchItem, Vars.item_wrenchName);
		ModLogger.log("Item Loaded: " + Vars.item_wrenchName);
		
		sigtestItem = new SigTestItem(Vars.iid_sigtestItem);
		GameRegistry.registerItem(sigtestItem, Vars.item_sigTestName);
		ModLogger.log("Item Loaded: " + Vars.item_sigTestName);
		
		initRecipes();
	}
	
	private static void initRecipes() {
		
	}
}
