package com.example.stackoverflowreadmap2;

public class CarModel {
    private Office office;

    private String year;

    private int ranking;

    //setters and getters

    public Office getOffice() {
        return office;
    }

    public void setOffice(Office office) {
        this.office = office;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    @Override
    public String toString() {
        return "CarModel{" +
                "office=" + office +
                ", year='" + year + '\'' +
                ", ranking=" + ranking +
                '}';
    }
}