package com.ymain.items;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Collections;

public class Yjail {

    private final ItemStack is = new ItemStack(Material.IRON_BARS, 1);
    private final ItemMeta im = is.getItemMeta();

    public ItemStack getIs() {

        im.setDisplayName("§c§lJAIL");
            im.setLore(Collections.singletonList("§c:X"));
                im.addEnchant(Enchantment.DURABILITY, 1, true);
                    im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        is.setItemMeta(im);
                            return is;

    }
}
