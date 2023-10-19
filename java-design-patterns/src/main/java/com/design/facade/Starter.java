package com.design.facade;

public class Starter {


    private Dashboard dashboard;
    private Engine engine;
    private SelfCheck selfCheck;


    public Starter() {
        this.dashboard = new Dashboard();
        this.engine = new Engine();
        this.selfCheck = new SelfCheck();
    }

    public void startup(){
        engine.startup();
        dashboard.startup();
        selfCheck.startup();
    }

    public void shutdown(){
        selfCheck.shutdown();
        engine.shutdown();
        dashboard.shutdown();
    }

}
