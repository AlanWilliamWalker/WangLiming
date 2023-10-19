package com.design.abstractfactory;

import com.design.abstractfactory.implinterface.ComputerFactory;
import com.design.abstractfactory.implinterface.PhoneFactory;

public class Start {
    public static void main(String[] args) {
        AbstractFactory phoneFactory = new PhoneFactory();
        Phone huaWei = phoneFactory.createPhone("HuaWei");
        System.out.println(huaWei.call());
        Phone apple = phoneFactory.createPhone("Apple");
        System.out.println(apple.call());

        AbstractFactory computerFactory = new ComputerFactory();
        Computer huaWeiComputer = computerFactory.createComputer("HuaWei");
        System.out.println(huaWeiComputer.internet());
        Computer appleComputer = computerFactory.createComputer("Apple");
        System.out.println(appleComputer.internet());
    }
}
