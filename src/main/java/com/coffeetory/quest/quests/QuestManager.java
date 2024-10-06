package com.coffeetory.quest.quests;

import com.coffeetory.quest.QuestMain;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class QuestManager {

    private static QuestManager instance;

    private static final File file = new File(QuestMain.getInstance().getDataFolder() + "/data.yml");

    private final Map<UUID, Quest> questMap;
    private final Map<UUID, QuestPlayer> questPlayerMap;

    private QuestManager() {
        questMap = new HashMap<>();
        questPlayerMap = new HashMap<>();
    }

    public void receiveQuest(@NotNull Quest quest, UUID who) {
        if (!questMap.containsKey(quest.getID())) questMap.put(quest.getID(), quest);
        if (!questPlayerMap.containsKey(who)) questPlayerMap.put(who, new QuestPlayer(who));
    }

    public static QuestManager getInstance() {
        if (instance == null) instance = new QuestManager();
        return instance;
    }
}
