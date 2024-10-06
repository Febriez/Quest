package com.coffeetory.quest.quests;

import org.bukkit.inventory.ItemStack;

import java.util.UUID;

public abstract class Quest {

    private final UUID uuid;

    public Quest(UUID uuid) {
        this.uuid = uuid;
    }

    public UUID getID() {
        return uuid;
    }

    public abstract ItemStack displayItem();

    public abstract void start();

    public abstract void stop();

    public enum EndType {
        NATURAL, FORCE, TIME
    }
}
