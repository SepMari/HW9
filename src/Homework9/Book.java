package Homework9;

public class Book  {
    private String namePublisher;
    private int yearPublisher;
    private String nameAuthor;

    public Book (String namePublisher, int yearPublisher, String nameAuthor) {
        this.yearPublisher = yearPublisher;
        this.namePublisher = namePublisher;
        this.nameAuthor = nameAuthor;

    }

    public String getNamePublisher() {

        return this.namePublisher;
    }

    public int getYearPublisher() {

        return this.yearPublisher;
    }
    public String getNameAuthor() {
        return this.nameAuthor;
    }

    public void setYearPublisher(int yearPublisher) {

        this.yearPublisher = yearPublisher;
    }
}