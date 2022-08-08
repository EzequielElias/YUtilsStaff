package com.ymain.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Yhelpcommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(!(sender instanceof Player p)) return false;

        if(p.hasPermission("yutil.admin")) {

            if (command.getName().equalsIgnoreCase("yajuda")) {

                if (args.length != 0) p.sendMessage("&c Argumento inválido, utilize apenas /yajuda");

                else {
                    p.sendMessage(""" 
                             §f
                             §c[Yra Staff]
                             §f
                             §b >> /admin << §a Ocultar sua presença e habilitar ferramentas!
                             §b >> /speed << §a Altere sua velocidade de corrida e voo!
                             §b >> /gm () << §a Alterar gamemodes, (0, 1, 2 ou 3)!
                             §b >> /dia ou /day << §a Torne dia no mundo atual!
                             §b >> /noite ou /night << §a Torne noite no mundo atual!
                             §b >> /chuva << §a Altere o estado atual da chuva!
                             §f
                             """);
                    return true;
                }
            }
        }
            p.sendMessage("§cVocê não possui permissao para isto");

        return false;
    }
}
