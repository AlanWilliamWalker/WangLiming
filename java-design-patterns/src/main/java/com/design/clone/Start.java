package com.design.clone;

import com.alibaba.fastjson.JSON;

public class Start {

    public static void main(String[] args) {

        // 浅复制
        Computer computer = new Computer("8g", "512g", "1TB");
        System.out.println("before:"+JSON.toJSONString(computer));
        Computer computerClone = (Computer) computer.clone();
        System.out.println("after:"+JSON.toJSONString(computerClone));

        // 深复制
        Disk disk = new Disk("512g", "1TB");
        ComputerDetail computerDetail = new ComputerDetail("8g", "512g", disk);
        System.out.println("before detail:"+JSON.toJSONString(computerDetail));
        disk.setHhd("343434");
        ComputerDetail computerDetailClone = (ComputerDetail) computerDetail.clone();
        System.out.println("after detail:"+JSON.toJSONString(computerDetailClone));




    }
}
