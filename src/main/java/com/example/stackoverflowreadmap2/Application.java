package com.example.stackoverflowreadmap2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;

@EnableConfigurationProperties(Car.class)
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    ApplicationListener<ApplicationReadyEvent> runnerListener(Car car) {
        return applicationReadyEvent -> System.out.println(car);
        // output:
        // Car{model={volkswagen=CarModel{office=Office{country='germany', city='wolfsburg'}, year='1937', ranking=2}, honda=CarModel{office=Office{country='japan', city='tokyo'}, year='1948', ranking=3}}, wheels=4}
    }

}
