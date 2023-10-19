package com.design.adapter.objectadapter;

public class ObjectAdapter implements Targetable{

    private Source source;
    public ObjectAdapter(Source source){
        super();
        this.source = source;
    }


    @Override
    public void editTextFile() {

        this.source.editTextFile();;
    }

    @Override
    public void editWordFile() {

        System.out.println("word file editing");
    }

    public void editOtherFile(){
        System.out.println("other file editing");
    }
}
