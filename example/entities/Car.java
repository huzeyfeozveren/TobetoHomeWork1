package org.example.entities;

public class Car {
    private String name;
    private int year;
    private double unitPrice;

    public Car() {

    }

    public Car(String name, int year, double unitPrice) {
        this.name = name;
        this.year = year;
        this.unitPrice = unitPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}