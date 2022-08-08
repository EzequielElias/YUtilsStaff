package com.ymain.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Yplayerjoinserverevent implements Listener {

    @EventHandler
    public void whenJoinServer(PlayerJoinEvent e) {
        Player p = e.getPlayer();

        if (p.hasPermission("yutil.admin")) {

                p.sendMessage("\n §cSeja bem vindo STAFF §b" + p.getDisplayName() +
                                "\n §cPara ficar oculto no servidor use §b/admin" +
                                "\n §cDúvidas? §b/yajuda \n ");

        }
    }
}
