package com.design.bridge;

public class MyDriverBridge extends DriverManagerBridge{


    public void execute(){
        getDriver().executeSQL();
    }


}
