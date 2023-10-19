package com.design.singleton;

public class LazySingleton {
    private static LazySingleton instance;
    private LazySingleton(){};
    private static synchronized LazySingleton getInstance(){
        if(null == instance){
            instance = new LazySingleton();
        }
        return instance;
    }
}
