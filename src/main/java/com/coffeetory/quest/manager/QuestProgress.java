package com.coffeetory.quest.manager;

import org.json.simple.JSONObject;

import java.util.UUID;

public interface QuestProgress {

    JSONObject getData();
    void loadProgress(JSONObject data);
    void isComplete();
    void reset();

}
