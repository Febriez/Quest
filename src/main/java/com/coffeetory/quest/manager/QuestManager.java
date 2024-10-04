package com.coffeetory.quest.manager;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class QuestManager {

    private static QuestManager instance;

    private final Map<UUID, Quest> questMap;
    private final Map<UUID, List<UUID>> playerQuestMap;

    private QuestManager() {
        questMap = new HashMap<>();
        playerQuestMap = new HashMap<>();
    }

    public void registerQuest(Quest quest) {
        if (quest == null) throw new RuntimeException("Error Code: 1011");
        questMap.put(quest.getId(), quest);
    }

    public static QuestManager getInstance() {
        if (instance == null) instance = new QuestManager();
        return instance;
    }
}
