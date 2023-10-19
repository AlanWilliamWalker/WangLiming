package com.design.proxy;

public class HR implements Company{

    @Override
    public void findWorker(String title) {
        System.out.println(
                "i need find a worker,title is :"+title
        );
    }
}
