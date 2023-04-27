package org.example;

import java.util.List;

abstract  class Publication {

    private String title;
    private int pageNumber;
    private PaperSize paperSize;
    private PaperType paperType;


    public Publication(String title, int pageNumber, PaperSize paperSize, PaperType paperType) {
        this.title = title;
        this.pageNumber = pageNumber;
        this.paperSize = paperSize;
        this.paperType = paperType;

    }
    public String getTitle() {
        return title;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public PaperSize getPaperSize() {
        return paperSize;
    }

    public PaperType getPaperType() {
        return paperType;
    }

//    public double calculatePrintingCost() {
//        return getPageNumber() * getPaperSize().getPriceMultiplier() * getPaperType().getPriceMultiplier();
//    }

    public abstract double calculatePaperCost();

    public abstract double calculateEmployeeCost(List<Employee> employees);

    public abstract void print();
}


