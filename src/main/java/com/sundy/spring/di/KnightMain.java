package com.sundy.spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class KnightMain {

    public static void main(String[] args) throws Exception {
        //ClassPathXmlApplicationContext是类路径（ 包含JAR文件） 下查找 knight.xml文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("knight.xml");
        //从Java配置中加载应用上下文
//        ApplicationContext context = new AnnotationConfigApplicationContext();
//        ApplicationContext context = new FileSystemXmlApplicationContext("c:/knight.xml");

//        Knight knight = (Knight) context.getBean("knight");
        //当获取接口实例有多个的时候就出现异常
            Knight knight = (Knight) context.getBean("knight");
//        Quest quest = context.getBean(SlayDragonQuest.class);
        knight.embarkOnQuest();
        context.close();
    }

}