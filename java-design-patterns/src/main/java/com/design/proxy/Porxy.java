package com.design.proxy;

import java.util.HashMap;

public class Porxy implements Company{
    private final HR hr;

    public Porxy() {
        super();
        this.hr = new HR();
    }

    @Override
    public void findWorker(String title) {
        // 代理的方法
        hr.findWorker(title);
        // 增强
        String worker = getWorker(title);
        System.out.println("find worker:"+worker);


    }


    private String getWorker(String title){
        HashMap<String, String> hashMap = new HashMap<String, String>() {
            {
                put("Java", "张三");
                put("Python", "李四");
                put("Php", "王五");
            }
        };
        return hashMap.get(title);

    }
}
