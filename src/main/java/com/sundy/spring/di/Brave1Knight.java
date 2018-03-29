package com.sundy.spring.di;

/**
 *DI 构造器注入（ constructor injection）
 */
public class Brave1Knight implements Knight {
    private Quest quest;

    public Brave1Knight(Quest quest) {
        this.quest = quest;
    }

    public void embarkOnQuest() {
        quest.embark();
    }
}