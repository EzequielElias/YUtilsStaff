package com.ymain.commands;

import com.ymain.items.Yjail;
import com.ymain.items.Yknockbackstick;
import com.ymain.items.Ythoraxe;
import org.bukkit.GameMode;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Ysigilocommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(!(sender instanceof Player p)) return false;

        Ythoraxe ythoraxe = new Ythoraxe();
        Yknockbackstick yknockbackstick = new Yknockbackstick();
        Yjail yjail = new Yjail();

        if(p.hasPermission("yutil.admin")) {

            if (command.getName().equalsIgnoreCase("admin")) {

                if (args.length != 0) p.sendMessage("§c Argumento inválido, utilize apenas /admin");

                    else {

                        if (p.getInventory().contains(ythoraxe.getIs())) {
                            p.setInvisible(false);
                            p.sendMessage("\n §aSaiu do modo admin! \n ");
                            p.getInventory().remove(ythoraxe.getIs());
                            p.getInventory().remove(yknockbackstick.getIs());
                            p.getInventory().remove(yjail.getIs());
                        }
                                else {
                                p.setInvisible(true);
                                p.setInvulnerable(true);
                                p.playSound(p, Sound.ENTITY_ENDER_DRAGON_GROWL, 10, 10);
                                p.sendMessage("\n §aEntrou no modo admin! \n ");
                                p.getInventory().setItem(2, ythoraxe.getIs());
                                p.getInventory().setItem(4, yknockbackstick.getIs());
                                p.getInventory().setItem(6, yjail.getIs());
                        }

                    return true;
                }
            }
        }
            else
                p.sendMessage("§cVocê não possui permissao para isto");

        return false;
    }
}
