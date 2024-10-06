package com.coffeetory.quest.quests;

import org.bukkit.configuration.MemoryConfiguration;
import org.bukkit.inventory.ItemStack;

import java.util.UUID;

public class SimpleQuest extends Quest{

    public SimpleQuest(UUID uuid) {
        super(uuid);
    }

    @Override
    public ItemStack displayItem() {
        return null;
    }


    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }
}
