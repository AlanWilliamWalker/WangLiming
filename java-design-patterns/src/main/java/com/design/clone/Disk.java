package com.design.clone;

import lombok.Data;

@Data
public class Disk implements Cloneable{
    private String ssd;
    private String hhd;

    public Disk(String ssd, String hhd) {
        this.ssd = ssd;
        this.hhd = hhd;
    }

    public Object clone(){
        try {
            return (Disk)super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("error");
            return null;
        }
    }
}
