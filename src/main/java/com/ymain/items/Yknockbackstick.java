package com.ymain.items;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Collections;

public class Yknockbackstick {

    private final ItemStack is = new ItemStack(Material.STICK, 1);
    private final ItemMeta im = is.getItemMeta();

    public ItemStack getIs() {

        im.setDisplayName("§5§lKNOCKBACK TEST");
            im.setLore(Collections.singletonList("§c:O"));
                im.addEnchant(Enchantment.KNOCKBACK, 30, true);
                    im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        is.setItemMeta(im);
                            return is;

    }
}
