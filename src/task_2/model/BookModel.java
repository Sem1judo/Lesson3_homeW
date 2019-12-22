package task_2.model;

import task_2.model.entity.Book;


import java.util.*;
import java.util.Arrays;

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
        Arrays.sort(newBook, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                String b1 = o1.getPublisher();
                String b2 = o2.getPublisher();
                return b1.compareTo(b2);
            }
        });
        return newBook;
    }
}
