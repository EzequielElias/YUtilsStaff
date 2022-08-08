package com.ymain.commands;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Ycommandgm implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(!(sender instanceof Player)) return false;
        Player p =(Player) sender;

        if(p.hasPermission("yutil.admin")) {

            if (command.getName().equalsIgnoreCase("gm") && args.length == 0) {

                if (p.getGameMode().equals(GameMode.CREATIVE)) {
                    p.setGameMode(GameMode.SURVIVAL);
                    p.sendMessage("""
                            §a
                            Modo de jogo alterado para §bSURVIVAL
                            §a
                            """);

                        } else if (p.getGameMode().equals(GameMode.SURVIVAL)) {
                        p.setGameMode(GameMode.CREATIVE);
                        p.sendMessage("""
                            §a
                            Modo de jogo alterado para §bCRIATIVO
                            §a
                            """);

                            } else if (p.getGameMode().equals(GameMode.ADVENTURE)) {
                                p.setGameMode(GameMode.CREATIVE);
                                p.sendMessage("""
                                        §a
                                        Modo de jogo alterado para §bCRIATIVO
                                        §a
                                        """);

                                } else if (p.getGameMode().equals(GameMode.SPECTATOR)) {
                                    p.setGameMode(GameMode.CREATIVE);
                                    p.sendMessage("""
                                            §a
                                            Modo de jogo alterado para §bCRIATIVO
                                            §a
                                            """);
                }
                }

                                if (args.length == 1) {
                                    if (args[0].equalsIgnoreCase("0")) {
                                        p.setGameMode(GameMode.SURVIVAL);
                                        p.sendMessage("""
                                                §a
                                                Modo de jogo alterado para §bSURVIVAL
                                                §a
                                                """);

                            } else if (args[0].equalsIgnoreCase("1")) {
                                p.setGameMode(GameMode.CREATIVE);
                                p.sendMessage("""
                                        §a
                                        Modo de jogo alterado para §bCRIATIVO
                                        §a
                                        """);

                        } else if (args[0].equalsIgnoreCase("2")) {
                            p.setGameMode(GameMode.ADVENTURE);
                            p.sendMessage("""
                                    §a
                                    Modo de jogo alterado para §bAVENTURA
                                    §a
                                    """);

                    } else if (args[0].equalsIgnoreCase("3")) {
                        p.setGameMode(GameMode.SPECTATOR);
                        p.sendMessage("""
                                §a
                                Modo de jogo alterado para §bESPECTADOR
                                §a
                                """);
                }
            }
        }
                else p.sendMessage("§cVocê não possui permissao para isto");

        return false;
    }
}
