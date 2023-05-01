package com.example.stackoverflowreadmap2;

public class Office {
    private String country;

    private String city;

    //setters and getters

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Office{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}