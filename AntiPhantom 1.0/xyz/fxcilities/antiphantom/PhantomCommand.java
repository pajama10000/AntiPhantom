// 
// Decompiled by Procyon v0.5.36
// 

package org.canadamc.antiphantom;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import java.util.UUID;
import java.util.HashMap;
import org.bukkit.command.CommandExecutor;

public class PhantomCommand implements CommandExecutor
{
    public static HashMap<UUID, Boolean> phantomMap;
    
    public boolean onCommand(final CommandSender sender, final Command command, final String label, final String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Only players can run this command!");
            return true;
        }
        final Player p = (Player)sender;
        final boolean shouldSpawn = PhantomCommand.phantomMap.getOrDefault(p.getUniqueId(), true);
        PhantomCommand.phantomMap.put(p.getUniqueId(), !shouldSpawn);
        p.sendMessage(ChatColor.translateAlternateColorCodes('&', invokedynamic(makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;, shouldSpawn ? "&c&lnot" : "&a&lwill")));
        return true;
    }
    
    static {
        PhantomCommand.phantomMap = new HashMap<UUID, Boolean>();
    }
}
