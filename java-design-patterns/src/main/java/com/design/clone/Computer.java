package com.design.clone;

import lombok.Data;

@Data
public class Computer implements Cloneable{

    private String cpu;
    private String memory;
    private String disk;


    public Computer(String cpu, String memory, String disk) {
        this.cpu = cpu;
        this.memory = memory;
        this.disk = disk;
    }

    public Object clone(){
        try {
            return (Computer)super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("error");
            return null;
        }
    }




}
