package com.design.adapter.objectadapter;

public class Start {
    public static void main(String[] args) {
        Source source = new Source();
        ObjectAdapter objectAdapter = new ObjectAdapter(source);
        objectAdapter.editTextFile();
        objectAdapter.editWordFile();
        objectAdapter.editOtherFile();
    }
}
