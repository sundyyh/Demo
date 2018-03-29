package com.sundy.spring.aop;

public class MinistrelPedro implements Ministrel {
    public void singBeforeQuest() {
        System.out.println("Knight is going to make a quest");
    }

    public void singAfterQuest() {
        System.out.println("Knight have completed the quest");
    }
}