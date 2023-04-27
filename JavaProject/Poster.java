package org.example;

class Poster extends Publication {
    private String creator;

    public Poster(String title, String creator, int pageNumber, PaperSize paperSize, PaperType paperType) {
        super(title, pageNumber, paperSize, paperType);
        this.creator = creator;
    }

    public String getCreator() {
        return creator;
    }

    @Override
    public void print() {
        System.out.println("Printing poster: " + getTitle() + " by " + getCreator());
    }
}