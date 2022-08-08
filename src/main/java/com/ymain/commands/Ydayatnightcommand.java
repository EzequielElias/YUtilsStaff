package com.ymain.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Ydayatnightcommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(!(sender instanceof Player p)) return false;

            if(p.hasPermission("yutil.admin")) {

                if (command.getName().equalsIgnoreCase("dia") && args.length == 0) {
                    p.getWorld().setFullTime(1000);
                    p.sendMessage("\n §aAgora faz sol! \n ");
                }

                    if (command.getName().equalsIgnoreCase("noite") && args.length == 0) {
                        p.getWorld().setFullTime(13000);
                        p.sendMessage("\n §aA lua deu as caras! \n ");
            }
        }
            else
                p.sendMessage("§cVocê não possui permissao para isto");

        return false;
    }
}
