package Task_2;


public class Book {
    private String title;
    private String author;
    private String publisher;
    private int year;
    private int numberOfPages;
    private double price;
    private Book[] books;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public void printBooks(Book[] books) {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void getSpecificBook(String s, Book[] books) {

        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                if (s.equals(books[i].author) ||
                        (s.equals(books[i].publisher))) {
                    System.out.println(books[i].toString());
                } else {
                    System.out.println("Wrong input");
                    break;
                }
            }
        }
    }

    public void getSpecificBook(int year, Book[] books) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                if (books[i].year >= year) {
                    System.out.println(books[i].toString());
                } else {
                    System.out.println("Wrong input");
                    break;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Book: " + "title= " + title + ", author=" + author + ", publisher=" + publisher + ", year=" + year + ", numberOfPages=" + numberOfPages + ", price=" + price + "\n";
    }
}

