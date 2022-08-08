package com.ymain.events;

import com.ymain.items.Yjail;
import com.ymain.items.Yknockbackstick;
import com.ymain.items.Ythoraxe;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

public class Yplayerdropitemevent implements Listener {

    Ythoraxe ythoraxe = new Ythoraxe();
    Yknockbackstick yknockbackstick = new Yknockbackstick();
    Yjail yjail = new Yjail();

    @EventHandler
    public void onPlayerDropItem(PlayerDropItemEvent e) {
        Player p = e.getPlayer();
        if (e.getItemDrop().getItemStack().equals(ythoraxe.getIs())
                || e.getItemDrop().getItemStack().equals(yknockbackstick.getIs())
                    || e.getItemDrop().getItemStack().equals(yjail.getIs())) {

            p.sendMessage("§cNão é possível dropar este item!");
            e.setCancelled(true);
        }
    }
}
