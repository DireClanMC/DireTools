package com.dire.bukkit;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.SignChangeEvent;

public class Listeners implements Listener{

    String Owner = "DireDay";

    @EventHandler
    public void onSignChange(SignChangeEvent e) {
        if (e.getLine(0).equalsIgnoreCase("[Owner]")) {
                e.setLine(0, "§2[Owner]");
                e.setLine(1, Owner);
        }
    }
    }
