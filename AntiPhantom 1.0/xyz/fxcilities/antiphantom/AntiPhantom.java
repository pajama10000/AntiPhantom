// 
// Decompiled by Procyon v0.5.36
// 

package org.canadamc.antiphantom;

import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

public final class AntiPhantom extends JavaPlugin
{
    public void onEnable() {
        this.getLogger().info("AntiPhantom plugin enabled.");
        this.getCommand("phantom").setExecutor((CommandExecutor)new PhantomCommand());
    }
}
