package com.ymain.events;

import com.ymain.items.Yjail;
import com.ymain.items.Yknockbackstick;
import com.ymain.items.Ythoraxe;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCreativeEvent;
import org.bukkit.inventory.Inventory;

import java.util.Objects;

public class Yplayermoveiteminventoryevent implements Listener {

    @EventHandler
    public void onMoveItemInventory(InventoryClickEvent e, InventoryCreativeEvent eic) {
        Ythoraxe ythoraxe = new Ythoraxe();
        Yknockbackstick yknockbackstick = new Yknockbackstick();
        Yjail yjail = new Yjail();

        Player p = (Player) e.getWhoClicked();
        Inventory i = p.getInventory();

        if(eic.getWhoClicked().dropItem(true)) {
            return;
        }

        if ((Objects.requireNonNull(e.getCurrentItem()).equals(ythoraxe.getIs())

                && e.getCurrentItem() != null) ||

                (Objects.requireNonNull(e.getCurrentItem()).equals(yknockbackstick.getIs())

                        && e.getCurrentItem() != null) ||

                    Objects.requireNonNull(e.getCurrentItem()).equals(yjail.getIs())

                                && e.getCurrentItem() != null) {

                                    p.sendMessage("§c[C4 DEV] Não é possível alterar o local do item!");
                                        e.setCancelled(true);
                                            e.getView().close();
                                                i.clear();
                                                    i.setItem(2, ythoraxe.getIs());
                                                        i.setItem(4, yknockbackstick.getIs());
                                                            i.setItem(6, yjail.getIs());



                if (e.getClick().isKeyboardClick()

                        || e.getClick().isShiftClick()) {

                            e.setCancelled(true);
                                e.getView().close();
                                    i.clear();
                                        i.setItem(2, ythoraxe.getIs());
                                            i.setItem(4, yknockbackstick.getIs());
                                                i.setItem(6, yjail.getIs());
}

            if((Objects.equals(Objects.requireNonNull(e.getClickedInventory()).getItem(2), ythoraxe.getIs())

                    && e.getClick().isKeyboardClick())

                        || Objects.requireNonNull(e.getClickedInventory().getItem(4)).equals(yknockbackstick.getIs())

                            && e.getClick().isKeyboardClick()

                                || Objects.requireNonNull(e.getClickedInventory().getItem(6)).equals(yjail.getIs())

                                    && e.getClick().isKeyboardClick()) {

                                        e.setCancelled(true);
                                            i.clear();
                                                i.setItem(2, ythoraxe.getIs());
                                                    i.setItem(4, yknockbackstick.getIs());
                                                        i.setItem(6, yjail.getIs());

            }
        }
    }
}
