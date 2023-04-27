package org.example;

abstract class Employee {
    private String name;
    private double basePay;

    public Employee(String name, double basePay) {
        this.name = name;
        this.basePay = basePay;
    }

    public String getName() {
        return name;
    }

    public double getBasePay() {
        return basePay;
    }

    public abstract double calculatePay(double revenue);
}
