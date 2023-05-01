package com.example.stackoverflowreadmap2;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Map;

//@Configuration // @ConfigurationProperties, not @Configuration. Better name it CarProperties.
@ConfigurationProperties(prefix = "car")
public class Car {
    private Map<String, CarModel> model; //= new HashMap<>(); // no need to create an instance

    private int wheels;

    public Map<String, CarModel> getModel() {
        return model;
    }

    public void setModel(Map<String, CarModel> model) {
        this.model = model;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model=" + model +
                ", wheels=" + wheels +
                '}';
    }
}
