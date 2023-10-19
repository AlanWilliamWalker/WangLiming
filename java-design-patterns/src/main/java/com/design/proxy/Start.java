package com.design.proxy;

public class Start {

    public static void main(String[] args) {
        Company company = new Porxy();

        company.findWorker("Java");

    }
}
