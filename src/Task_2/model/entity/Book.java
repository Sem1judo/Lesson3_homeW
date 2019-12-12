package Task_2.model.entity;


public class Book {
    private String title;
    private String author;
    private String publisher;
    private int year;
    private int numberOfPages;
    private double price;

    public Book() {
    }

    public Book(String title, String author, String publisher, int year, int numberOfPages, double price) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.numberOfPages = numberOfPages;
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Book: " + "title= " + title + ", author=" + author + ", publisher=" + publisher + ", year=" + year + ", numberOfPages=" + numberOfPages + ", price=" + price + "\n";
    }
}

