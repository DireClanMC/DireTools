package com.dire.bukkit;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.*;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getLogger().info("Diretools has been enabled");
        getLogger().info("Diretools is coded by Dire aka _Dayton");
    }

    @Override
    public void onDisable() {
        getLogger().info("Diretools has been disabled");
    }

    //Handles events thrown before a player logs into server
    @EventHandler
    public void onPlayerPreLogin(PlayerPreLoginEvent e) {
        getLogger().info("[PreLogin Event] " + e.getName() +  " is connecting to the server");
        PlayerPreLoginEvent.Result loginresult = e.getResult();
        if (e.getResult() != PlayerPreLoginEvent.Result.ALLOWED) {
            getLogger().info("[Pre Login Event] " + e.getName() + " Failed to connect to server - Details below");
            getLogger().info("[Pre Login Event Details] " + "Kick Reason: " + e.getKickMessage());
        } else {
            getLogger().info("[Pre Login Event] " + e.getName() + " has connected successfully and is preparing to login to server");
        }
        getLogger().info("Login result is: " + loginresult.toString());
    }

    //Handles events thrown during a player login to server
    @EventHandler
    public void onPlayerLogin(PlayerLoginEvent e) {
        getLogger().info("[Login Event] " + e.getPlayer().getDisplayName() + "has logged in successfully and is preparing to join server");
    }

    //Handles events thrown when a player joins the server and is visible to other players
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        getLogger().info("[Join Event] " + e.getPlayer().getDisplayName() +  " successfully joined the server");
    }

    //Handles events thrown when a player disconnects
    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent e) {
        getLogger().info( "[Quit Event] "  + e.getPlayer().getDisplayName() +  " left the server");
        getLogger().info("[Quit Event Details] " + "Quit Reason: " + e.getQuitMessage());
    }

    //Handles events thrown when a player is kicked
    @EventHandler
    public void onPlayerKick(PlayerKickEvent e) {
        getLogger().info( "[Kick Event] " + e.getPlayer().getName() + e.getLeaveMessage().concat("."));
        getLogger().info("[Kick Event Details] " + "Kick Reason: " + e.getReason());
    }
}

