package com.design.abstractfactory;

public abstract class AbstractFactory {
    public abstract Phone createPhone(String brand);
    public abstract Computer createComputer(String brand);
}
