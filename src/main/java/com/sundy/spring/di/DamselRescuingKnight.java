package com.sundy.spring.di;

/**解救少女的骑士*/
public class DamselRescuingKnight implements Knight {
    private RescueDamselQuest quest;

    /***
     * 和RescueDamselQuest耦合在一起
     */
    public DamselRescuingKnight() {
        quest = new RescueDamselQuest();
    }

    public void embarkOnQuest() {
        quest.embark();
    }
}