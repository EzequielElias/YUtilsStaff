package com.ymain.events;

import com.ymain.items.Yjail;
import com.ymain.items.Ythoraxe;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;

public class Yplayerinteractevent implements Listener {

    Ythoraxe ythoraxe = new Ythoraxe();
    Yjail yjail = new Yjail();

    @EventHandler
    public void whenUseItemInEntity(PlayerInteractEntityEvent e) {

        Player p = e.getPlayer();
            Entity en = e.getRightClicked();

                if(p.getInventory().getItemInMainHand().equals(ythoraxe.getIs())) {

                    en.getWorld().strikeLightningEffect(en.getLocation());
        }
    }

    @EventHandler
    public void whenUseItemInLocation(PlayerInteractEvent e) {

        Player p = e.getPlayer();

            if(p.getInventory().getItemInMainHand().equals(ythoraxe.getIs())

                && e.getClickedBlock() != null) {

                    p.getWorld().strikeLightningEffect(e.getClickedBlock().getLocation());
        }
    }

    @EventHandler
    public void whenJailPlayer(PlayerInteractEntityEvent e) {

        Player p = e.getPlayer();
            Entity en = e .getRightClicked();
                World wP = en.getWorld();

                    double pX = en.getLocation().getBlockX();
                        double pY = en.getLocation().getBlockY() + 35;
                            double pZ = en.getLocation().getBlockZ();

                                Location lTP = new Location(wP, pX, pY, pZ);

                                    if(p.getInventory().getItemInMainHand().equals(yjail.getIs())) {

                                        en.sendMessage("""
                                            §f
                                            §cVocê foi para jail, não deslogue ou será banido!!
                                            §cVocê foi para jail, não deslogue ou será banido!!
                                            §cVocê foi para jail, não deslogue ou será banido!!
                                            §f
                                            """);

    en.teleport(lTP);

        en.getWorld().setBlockData(new Location(wP,lTP.getBlockX() - 1, lTP.getBlockY() -1, lTP.getBlockZ() - 1), Material.BEDROCK.createBlockData());
            en.getWorld().setBlockData(new Location(wP,lTP.getBlockX() - 1, lTP.getBlockY() + 2, lTP.getBlockZ() - 1), Material.BEDROCK.createBlockData());
                en.getWorld().setBlockData(new Location(wP,lTP.getBlockX() - 2, lTP.getBlockY(), lTP.getBlockZ() - 1), Material.BEDROCK.createBlockData());
                    en.getWorld().setBlockData(new Location(wP,lTP.getBlockX() - 1, lTP.getBlockY(), lTP.getBlockZ() - 2), Material.BEDROCK.createBlockData());
                        en.getWorld().setBlockData(new Location(wP,lTP.getBlockX() - 1, lTP.getBlockY(), lTP.getBlockZ()), Material.BEDROCK.createBlockData());
                            en.getWorld().setBlockData(new Location(wP,lTP.getBlockX(), lTP.getBlockY(), lTP.getBlockZ() - 1), Material.BEDROCK.createBlockData());

                                p.sendMessage("\n §c Após utilizar a jaula, a mesma deve ser quebrada manualmente \n ");

            if(en.getServer().dispatchCommand(en, "/spawn")) {

                en.sendMessage("§cVocê está em uma jaula, não é permitido utilizar comandos.");

            }
        }
    }
}
