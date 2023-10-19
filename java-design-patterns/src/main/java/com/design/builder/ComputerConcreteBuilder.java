package com.design.builder;

public class ComputerConcreteBuilder implements ComputerBuilder{

    Computer computer;

    public ComputerConcreteBuilder(){
        computer = new Computer();
    }

    public void buildcpu() {
        computer.setCpu("8g");
    }

    public void buildDisk() {
        computer.setDisk("256G");
    }

    public void buildmemory() {
        computer.setMemory("1T");
    }

    public Computer buildComputer() {
        return computer;
    }
}
