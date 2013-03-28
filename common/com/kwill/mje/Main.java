package com.kwill.mje;

import com.kwill.mje.blocks.BlockInit;
import com.kwill.mje.items.ItemsInit;
import com.kwill.mje.libs.Vars;
import com.kwill.mje.proxy.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;


@Mod(name = Vars.mod_name, modid = Vars.mod_modid, version = Vars.mod_version)
@NetworkMod(clientSideRequired = true, serverSideRequired = false, versionBounds = Vars.mod_version) 
public class Main {
	@Instance(Vars.mod_modid)
	public static Main instance;
	
	@SidedProxy(clientSide = "com.kwill.mje.proxy.ClientProxy", serverSide = "com.kwill.mje.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	@PreInit
	public static void preInit(FMLPreInitializationEvent e) {	
		
	}
	
	@Init
	public static void init(FMLInitializationEvent e) {
		BlockInit.init();
		ItemsInit.init();
	}
	
	@PostInit
	public static void postInit(FMLPostInitializationEvent e) {
		
	}
	
}
