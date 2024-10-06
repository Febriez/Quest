package com.coffeetory.quest.event;

import com.coffeetory.quest.quests.Quest;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class PlayerQuestCompleteEvent extends Event {

    private final HandlerList handlerList = new HandlerList();

    private final Player who;
    private final Quest quest;

    public PlayerQuestCompleteEvent(Player p, Quest quest) {
        this.who = p;
        this.quest = quest;
    }

    public Player getCompleter() {
        return who;
    }

    public Quest getQuest() {
        return quest;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return handlerList;
    }
}
