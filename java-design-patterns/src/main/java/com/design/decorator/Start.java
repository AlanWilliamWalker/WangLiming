package com.design.decorator;

public class Start {

    public static void main(String[] args) {
        Source source = new Source();
        Decorator decorator = new Decorator(source);
        decorator.createComputer();
    }
}
