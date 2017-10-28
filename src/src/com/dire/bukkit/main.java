package com.dire.bukkit;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;


public class main extends JavaPlugin{

    @Override
    public void onEnable(){
        getLogger().info("Diretools has been enabled");
        Bukkit.getServer().getPluginManager().registerEvents(new Listeners(), this);
    }

    @Override
    public void onDisable() {
        getLogger().info("Diretools has been disabled");
    }
}

