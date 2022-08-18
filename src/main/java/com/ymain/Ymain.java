package com.ymain;

import com.ymain.commands.*;
import com.ymain.events.*;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Ymain extends JavaPlugin {

    @Override
    public void onEnable() {
                Bukkit.getConsoleSender().sendMessage("§2 Plugin iniciado com sucesso!");
                        registerEvents();
                            registerCommand();
    }

    private void registerEvents() {

        Bukkit.getPluginManager().registerEvents(new Yplayerjoinserverevent(), this);
            Bukkit.getPluginManager().registerEvents(new Yplayerdropitemevent(), this);
                Bukkit.getPluginManager().registerEvents(new Yplayermoveiteminventoryevent(), this);
                    Bukkit.getPluginManager().registerEvents(new Yplayerinteractevent(), this);
                        Bukkit.getPluginManager().registerEvents(new Yserverevents(), this);
    }

    private void registerCommand() {
        getCommand("yajuda").setExecutor(new Yhelpcommand());
            getCommand("admin").setExecutor(new Ysigilocommand());
                getCommand("gm").setExecutor(new Ycommandgm());
                    getCommand("speed").setExecutor(new Ycommandspeed());
                        getCommand("chuva").setExecutor(new Ystopraincommand());
                            getCommand("dia").setExecutor(new Ydayatnightcommand());
                                getCommand("noite").setExecutor(new Ydayatnightcommand());
                                    getCommand("clear").setExecutor(new Ycommandclear());
    }
}
