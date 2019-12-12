package Task_2.model;

import Task_2.SortByPublisher;
import Task_2.model.entity.Book;

import java.util.Arrays;
import java.util.Comparator;

public class BookModel {

    private Book[] books;

    public BookModel() {
        books = DataSourceBooks.getArray();
    }

    public Book[] getBooks() {
        return books;
    }


    public Book[] getSpecificBook(String s) {
        for (Book book : books) {
            if (s.equalsIgnoreCase(book.getAuthor()) ||
                    s.equalsIgnoreCase(book.getPublisher())) {

            }
        }

    }

    public Book[] getSpecificBook(int year) {
        Book[] newBook = null;
        for (Book book : books) {
            if (book.getYear() >= year) {
                int i = 0;
                newBook[i++] = book;
            }
        }
        return newBook;
    }

    public Book[] sortShape() {
        Book[] newBook = Arrays.copyOf(books, books.length);
        Arrays.sort(newBook, new SortByPublisher());
        return newBook;
    }
}
