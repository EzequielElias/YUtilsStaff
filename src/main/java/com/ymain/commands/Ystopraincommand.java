package com.ymain.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Ystopraincommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!(sender instanceof Player p)) return false;

        if (p.hasPermission("yutil.admin")) {

            if (command.getName().equalsIgnoreCase("chuva") && args.length == 0 && p.getWorld().getClearWeatherDuration() == 0) {
                p.getWorld().setClearWeatherDuration(1);
                p.sendMessage("\n §aEstado da chuva alterado. \n ");

            }
        }
            else
                p.sendMessage("§cVocê não possui permissao para isto");

        return false;
    }
}
