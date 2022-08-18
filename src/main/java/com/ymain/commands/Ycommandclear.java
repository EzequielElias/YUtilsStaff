package com.ymain.commands;

import com.ymain.items.Yjail;
import com.ymain.items.Yknockbackstick;
import com.ymain.items.Ythoraxe;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Ycommandclear implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player player = (Player) sender;
            Ythoraxe ythoraxe = new Ythoraxe();
                Yknockbackstick yknockbackstick = new Yknockbackstick();
                    Yjail yjail = new Yjail();

                        if(command.getName().equalsIgnoreCase("clear") && player.getInventory().contains(ythoraxe.getIs())) {
                            player.getInventory().clear();

                            player.getInventory().setItem(2, ythoraxe.getIs());
                        player.getInventory().setItem(4, yknockbackstick.getIs());
                    player.getInventory().setItem(6, yjail.getIs());

                player.sendMessage("\n §aItens não utilitários removidos! \n ");

            }

                else if(player.getInventory().isEmpty()) {

                            player.sendMessage("\n §c Você não possui item algum em seu inventário \n ");

                        }

                   else {
                player.getInventory().clear();
            player.sendMessage("\n §aInventário limpo \n ");

        }
            return false;
    }
}
