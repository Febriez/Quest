package com.coffeetory.quest.data;

import com.coffeetory.quest.QuestMain;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;

public class DataManager {

    private static final File QuestDataFile = new File(QuestMain.getInstance().getDataFolder() + "/quest.yml");

    public void save() {

    }

    private void saveQuestData() {
        YamlConfiguration data = new YamlConfiguration();
    }

}
