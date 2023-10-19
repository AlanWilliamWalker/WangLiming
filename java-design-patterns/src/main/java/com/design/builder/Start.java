package com.design.builder;

public class Start {
    public static void main(String[] args) {
        ComputerDirector director = new ComputerDirector();
        ComputerBuilder computerBuilder = new ComputerConcreteBuilder();
        Computer computer = director.constructComputer(computerBuilder);
        System.out.println(computer.getCpu());
    }
}
