package com.design.decorator;

public class Source implements Sourceable{

    @Override
    public void createComputer() {
        System.out.println("create computer by Source");
    }
}
