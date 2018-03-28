package com.sundy.spring.knights;

/**
 *DI 构造器注入（ constructor injection）
 */
public class BraveKnight implements Knight {
    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    public void embarkOnQuest() {
        quest.embark();
    }
}