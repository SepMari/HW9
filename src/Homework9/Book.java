package Homework9;

public class Book  {
    private String namePublisher;
    private int yearPublisher;


    public Book (String namePublisher, int yearPublisher) {
        this.yearPublisher = yearPublisher;
        this.namePublisher = namePublisher;
    }

    public String getNamePublisher() {
        return this.namePublisher;
    }

    public int getYearPublisher() {
        return this.yearPublisher;
    }

    public void setYearPublisher(int yearPublisher) {
        this.yearPublisher = yearPublisher;
    }
}