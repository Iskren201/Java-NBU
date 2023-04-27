package org.example;

public enum PaperType {
    PLAIN(1.0),
    GLOSSY(1.5),
    NEWSPRINT(0.5);

    private double priceMultiplier;

    private PaperType(double priceMultiplier) {
        this.priceMultiplier = priceMultiplier;
    }

    public double getPriceMultiplier() {
        return priceMultiplier;
    }
}