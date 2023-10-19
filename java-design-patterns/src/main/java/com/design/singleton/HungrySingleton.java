package com.design.singleton;

public class HungrySingleton {

    private HungrySingleton(){};

    private static HungrySingleton instance = new HungrySingleton();

    private static HungrySingleton getInstance(){
        return instance;
    }



}
