package com.ymain.events;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;

public class Yserverevents implements Listener {

    @EventHandler
    public void whenAreInWL(ServerListPingEvent e) {

        if(!Bukkit.hasWhitelist()) e.setMotd("§a Venha jogar em nosso servidor!");
            else
                e.setMotd("§c Servidor em manutenção!");
    }

}
