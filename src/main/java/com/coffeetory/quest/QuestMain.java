package com.coffeetory.quest;

import org.bukkit.plugin.java.JavaPlugin;

public final class QuestMain extends JavaPlugin {

    private static QuestMain instance;

    @Override
    public void onEnable() {
        instance = this;
    }

    @Override
    public void onDisable() {
    }

    public static QuestMain getInstance() {
        return instance;
    }
}
