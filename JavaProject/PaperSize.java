package org.example;

enum PaperSize {
    A1(3.0),
    A2(2.0),
    A3(1.5),
    A4(1.0),
    A5(0.5);

    private double priceMultiplier;

    private PaperSize(double priceMultiplier) {
        this.priceMultiplier = priceMultiplier;
    }

    public double getPriceMultiplier() {
        return priceMultiplier;
    }
}
