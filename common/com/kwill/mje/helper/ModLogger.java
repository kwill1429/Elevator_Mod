package com.kwill.mje.helper;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.kwill.mje.libs.Vars;

import cpw.mods.fml.common.FMLLog;

public class ModLogger {
	private static Logger logger = Logger.getLogger(Vars.mod_modid);
	
	public static void init() {
		logger.setParent(FMLLog.getLogger());
		ModLogger.log(Level.INFO, "ModLogger initialized");
	}
	
	public static void log(Level level, String message) {
		if (Vars.conf_debug) {logger.log(level, message); }
	}
	
	public static void log(String message) {
		if (Vars.conf_debug) {logger.log(Level.INFO, message);}
	}
}
