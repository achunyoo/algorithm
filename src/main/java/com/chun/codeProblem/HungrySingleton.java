package com.chun.codeProblem;

/**
 * @description: 饿汉式单例模式
 * @author: chun
 **/

public class HungrySingleton {
    private HungrySingleton(){}

    private static  HungrySingleton instance  = new HungrySingleton();

    public static HungrySingleton getInstance(){
        return instance ;
    }

}
