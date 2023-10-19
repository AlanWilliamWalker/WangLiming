package com.design.factory;

public class Start {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Phone apple = factory.createPhone("Apple");
        Phone huaWei = factory.createPhone("HuaWei");
        System.out.println(apple.brand());
        System.out.println(huaWei.brand());
    }
}
