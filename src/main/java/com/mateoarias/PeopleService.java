package com.mateoarias;

public class PeopleService {

    private HelloService helloService;

    private GoodbyeService goodbyeService;

    public PeopleService() {
    }

    public PeopleService(HelloService helloService, GoodbyeService goodbyeService) {
        this.helloService = helloService;
        this.goodbyeService = goodbyeService;
    }

    public HelloService getHelloService() {
        return helloService;
    }

    public GoodbyeService getGoodbyeService() {
        return goodbyeService;
    }

    public void setHelloService(HelloService helloService) {
        this.helloService = helloService;
    }

    public void setGoodbyeService(GoodbyeService goodbyeService) {
        this.goodbyeService = goodbyeService;
    }
}
