package ru.job4j.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.job4j.annotation.configuration.Config;

public class MainConfApp {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Man man = context.getBean(Man.class);
        man.print();
    }
}
