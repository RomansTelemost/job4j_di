package ru.job4j.annotation.configuration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;
import org.springframework.core.annotation.Order;
import ru.job4j.annotation.Dog;

@Configuration
@ComponentScan(basePackages = "ru.job4j.annotation")
@PropertySource("classpath:application.properties")
public class Config {

    @Bean
    @Primary
    @Order(11)
    public Dog getAlfDog() {
        return new Dog("Alf");
    }

    @Bean(name = "SecondDog")
    @Order(3)
    public Dog getDog() {
        return new Dog("SecondDog");
    }

    @Bean
    @Order(5)
    public Dog someDog() {
        return new Dog("Dog");
    }
}
