package com.design.bridge.impl;

import com.design.bridge.Driver;

public class MysqlDriver implements Driver {
    @Override
    public void executeSQL() {
        System.out.println("execute sql by mysql driver");
    }
}
