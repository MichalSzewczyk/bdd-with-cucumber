package com.zoo;

import com.zoo.di.ApplicationConfiguration;
import com.zoo.ducks.Duck;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        Duck duck = getInitializedDuck();

        System.out.println(duck.getName());

        duck.fly();
        duck.quack();
    }

    private static Duck getInitializedDuck() {
        AnnotationConfigApplicationContext applicationContext = getConfiguredApplicationContext();
        return applicationContext.getBean(Duck.class);
    }

    private static AnnotationConfigApplicationContext getConfiguredApplicationContext() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(ApplicationConfiguration.class);
        applicationContext.refresh();
        return applicationContext;
    }
}
