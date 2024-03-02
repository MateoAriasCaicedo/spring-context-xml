package com.mateoarias;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("greetings.xml", "bean.xml");

        PeopleService peopleService = applicationContext.getBean("people", PeopleService.class);

        System.out.println(peopleService.getHelloService().sayHello());
        System.out.println(peopleService.getGoodbyeService().sayGoodbye());
    }
}
