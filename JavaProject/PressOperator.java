package org.example;

class PressOperator extends Employee {
    public PressOperator(String name, double basePay) {
        super(name, basePay);
    }

    @Override
    public double calculatePay(double revenue) {
        return getBasePay();
    }
}