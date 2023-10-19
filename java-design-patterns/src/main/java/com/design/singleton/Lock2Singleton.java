package com.design.singleton;

public class Lock2Singleton {

    // 对象锁
    private volatile static Lock2Singleton instance;

    private Lock2Singleton(){};

    // synchronized方法锁
    private static Lock2Singleton getInstance(){
        if(null == instance){
            synchronized(Lock2Singleton.class){
                if(null == instance){
                    instance = new Lock2Singleton();
                }
            }
        }
        return instance;
    }


}
