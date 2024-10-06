package com.coffeetory.quest.gui;

import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.jetbrains.annotations.NotNull;

public class PlayerQuestGUI implements InventoryHolder {


    private final Player player;
    private final Inventory inv;

    public PlayerQuestGUI(Player p) {
        this.player = p;
        inv = Bukkit.createInventory(this, 54, Component.text("보유 퀘스트 목록"));
    }



    @Override
    public @NotNull Inventory getInventory() {
        return inv;
    }
}
