package com.dire.bukkit;

import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin{
    // Fired when plugin is first enabled
	
	public static main plugin;
    
	@Override
    public void onEnable(){
    	getLogger().info("Diretools has been enabled");
    }
    // Fired when plugin is disabled
    @Override
    public void onDisable() {
       getLogger().info("Diretools has been disabled");
    }
}
 