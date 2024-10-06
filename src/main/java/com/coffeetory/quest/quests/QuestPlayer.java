package com.coffeetory.quest.quests;

import org.bukkit.configuration.MemorySection;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

public class QuestPlayer {

    private final UUID who;

    private final Map<UUID, Float> questProgresses;

    QuestPlayer(UUID who) {
        this.who = who;
        questProgresses = new HashMap<>();
    }

    QuestPlayer(@NotNull MemorySection data) {
        this.who = UUID.fromString(Objects.requireNonNull(data.getString("who")));
        questProgresses = new HashMap<>();
    }

    public Map<UUID, Float> getQuestProgresses() {
        return questProgresses;
    }
}
