package org.example;

class Manager extends Employee {
    private double bonusThreshold;
    private double bonusPercentage;

    public Manager(String name, double basePay, double bonusThreshold, double bonusPercentage) {
        super(name, basePay);
        this.bonusThreshold = bonusThreshold;
        this.bonusPercentage = bonusPercentage;
    }

    public double getBonusThreshold() {
        return bonusThreshold;
    }

    public double getBonusPercentage() {
        return bonusPercentage;
    }

    @Override
    public double calculatePay(double revenue) {
        if (revenue > getBonusThreshold()) {
            return getBasePay() + (revenue - getBonusThreshold()) * getBonusPercentage();
        } else {
            return getBasePay();
        }
    }
}