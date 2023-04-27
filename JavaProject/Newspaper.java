package org.example;

class Newspaper extends Publication {
    private String editor;

    public Newspaper(String title, String editor, int pageNumber, PaperSize paperSize, PaperType paperType) {
        super(title, pageNumber, paperSize, paperType);
        this.editor = editor;
    }

    public String getEditor() {
        return editor;
    }

    @Override
    public void print() {
        System.out.println("Printing newspaper: " + getTitle() + " edited by " + getEditor());
    }
}
