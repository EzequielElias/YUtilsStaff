package com.ymain.items;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Collections;

public class Ythoraxe {

    private final ItemStack is = new ItemStack(Material.NETHERITE_AXE, 1);
    private final ItemMeta im = is.getItemMeta();

    public ItemStack getIs() {

        im.setDisplayName("§b§lMACHADO DO THOR");
            im.setLore(Collections.singletonList("§cYou're a thor? :o"));
                im.addEnchant(Enchantment.DURABILITY, 1, false);
                    im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        is.setItemMeta(im);
                            return is;

    }
}