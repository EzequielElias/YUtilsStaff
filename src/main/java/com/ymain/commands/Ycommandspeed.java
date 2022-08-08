package com.ymain.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Ycommandspeed implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(!(sender instanceof Player p)) return false;

        PotionEffect potion40 = PotionEffectType.SPEED.createEffect(9999999, 40);
        PotionEffect potion80 = PotionEffectType.SPEED.createEffect(9999999, 80);

        if(p.hasPermission("yutil.admin")) {

            if (command.getName().equalsIgnoreCase("speed") && args.length == 0) {
                p.sendMessage("\n §cUso incorreto, utilize /speed (1 a 3) \n ");
            }

                if (args.length == 1 && args[0].equalsIgnoreCase("0")) {
                    p.sendMessage("\n §cUso incorreto, utilize /speed (1 a 3) \n ");
                }

                    if (args.length == 1 && args[0].equalsIgnoreCase("1")) {
                    p.removePotionEffect(potion40.getType());
                    p.removePotionEffect(potion80.getType());
                    p.setFlySpeed(0.1F);
                    p.sendMessage("\n §aVelocidade retornada ao normal, Ufa! ^_^ \n ");

                        } else if (args.length == 1 && args[0].equalsIgnoreCase("2")) {
                        p.addPotionEffect(potion40);
                        p.setFlySpeed(0.5F);
                        p.sendMessage("\n §aWow, você está muito rápido o_o \n ");

                            } else if (args.length == 1 && args[0].equalsIgnoreCase("3")) {
                            p.addPotionEffect(potion80);
                            p.setFlySpeed(1);
                            p.sendMessage("\n §cYra adverte: \n §a| Esta velocidade pode ser prejudicial ao seu FPS *_* \n ");
            }
        }
        else
            p.sendMessage("§cVocê não possui permissao para isto");

        return false;
    }
}
