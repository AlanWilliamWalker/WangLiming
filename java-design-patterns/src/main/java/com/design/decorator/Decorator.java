package com.design.decorator;

public class Decorator implements Sourceable{

    private Source source;

    public Decorator(Source source) {
        super();
        this.source = source;
    }

    @Override
    public void createComputer() {
        source.createComputer();
        // 创建电脑后，组装系统
        System.out.println("make system");

    }
}
