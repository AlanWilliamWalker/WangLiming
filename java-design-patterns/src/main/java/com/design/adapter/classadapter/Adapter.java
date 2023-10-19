package com.design.adapter.classadapter;

public class Adapter extends Source implements Targetable{
    public void editWordFile() {
        System.out.println("a word file editting");
    }
}
