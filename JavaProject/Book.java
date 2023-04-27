package org.example;

import java.util.List;

class Book extends Publication {
    private String author;

    public Book(String title, String author, int pageNumber, PaperSize paperSize, PaperType paperType) {
        super(title, pageNumber, paperSize, paperType);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

//    @Override
//    public void print() {
//        System.out.println("Printing book: " + getTitle() + " by " + getAuthor());
//    }

    @Override
    public double calculatePaperCost() {
        double pricePerSheet = getPricePerSheet(getPaperSize(), getPaperType());
        return getPageCount() * pricePerSheet / 2; // divide by 2 since each sheet has 2 pages
    }
// tuk ima nqkav problem ^
    @Override
    public double calculateEmployeeCost(List<Employee> employees) {
        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.calculatePay(0);
        }
        return totalSalary;
    }
}
