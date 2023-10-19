package com.design.facade;

public class Start {

    public static void main(String[] args) {

        Starter starter = new Starter();
        starter.startup();
        System.out.println("---------------");
        starter.shutdown();

    }
}
