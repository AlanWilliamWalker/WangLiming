package com.design.bridge;

import com.design.bridge.impl.MysqlDriver;

public class Start {

    public static void main(String[] args) {
        MyDriverBridge myDriverBridge = new MyDriverBridge();
        myDriverBridge.setDriver(new MysqlDriver());
        myDriverBridge.execute();
    }
}
