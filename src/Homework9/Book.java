package Homework9;

public class Book  {
    private final String namePublisher;
    private int yearPublisher;
    private final Author nameAuthor;

    @Override
    public String toString() {
        return "Book{" +
                "Название книги - '" + namePublisher + '\'' +
                ", Год публикации - " + yearPublisher +
                ", Имя автора книги - '" + nameAuthor + '\'' +
                '}';
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

    public Book (String namePublisher, int yearPublisher, Author nameAuthor) {
        this.yearPublisher = yearPublisher;
        this.namePublisher = namePublisher;
        this.nameAuthor = nameAuthor;
    }
}