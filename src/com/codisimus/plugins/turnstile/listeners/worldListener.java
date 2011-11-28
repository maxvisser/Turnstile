package com.codisimus.plugins.turnstile.listeners;

import com.codisimus.plugins.turnstile.SaveSystem;
import org.bukkit.event.world.WorldListener;
import org.bukkit.event.world.WorldLoadEvent;

/**
 * Loads Turnstile data for each World that is loaded
 *
 * @author Codisimus
 */
public class worldListener extends WorldListener{

    /**
     * Loads ChestLock data for the loaded World
     * 
     * @param event The WorldLoadEvent that occurred
     */
    @Override
    public void onWorldLoad (WorldLoadEvent event) {
        SaveSystem.load(event.getWorld());
    }
}

