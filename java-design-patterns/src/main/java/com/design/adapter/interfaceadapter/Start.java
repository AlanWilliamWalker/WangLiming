package com.design.adapter.interfaceadapter;

public class Start {

    public static void main(String[] args) {
        SourceSub2 sourceSub2 = new SourceSub2();
        SourceSub1 sourceSub1 = new SourceSub1();
        sourceSub1.editTextFile();
        sourceSub2.editTextFile();
        sourceSub2.editWordFile();
    }
}
