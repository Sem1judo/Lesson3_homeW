package Task_2.model;

import Task_2.SortByPublisher;
import Task_2.model.entity.Book;


import java.util.*;
import java.util.Arrays;
import java.util.Comparator;

public class BookModel<T> {

    private Book[] books;

    public BookModel() {
        books = DataSourceBooks.getArray();
    }

    public Book[] getBooks() {
        return books;
    }


    public Book[] getSpecificBook(String s) {
        List<Book> booksList = new ArrayList<>();
        for (Book book : books) {
            if (s.equalsIgnoreCase(book.getAuthor()) ||
                    s.equalsIgnoreCase(book.getPublisher())) {
                booksList.add(book);
            }
        }
        return booksList.toArray(new Book[booksList.size()]);

    }

    public Book[] getSpecificBooktillYear(int year) {
        List<Book> booksList = new ArrayList<>();
        for (Book book : books) {
            if (book.getYear() >= year) {
                booksList.add(book);
            }
        }
        return booksList.toArray(new Book[booksList.size()]);
    }

    public Book[] sortBook(Book[] books) {
        Book[] newBook = Arrays.copyOf(books, books.length);
        Arrays.sort(newBook, new SortByPublisher());
        return newBook;
    }
}
