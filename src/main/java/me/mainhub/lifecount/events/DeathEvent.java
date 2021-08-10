package me.mainhub.lifecount.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class DeathEvent implements Listener {
    public void onDeath(PlayerDeathEvent e) {
        Player p = e.getEntity();
        Player p2 = p.getKiller();
        if (p2 instanceof Entity) {
            e.setDeathMessage(ChatColor.RED + p.getDisplayName() + " was brutally murdered by " + p2.getDisplayName());

        }
    }
}
