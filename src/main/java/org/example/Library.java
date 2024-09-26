package org.example;
import java.util.ArrayList;
import java.util.List;
public class Library {
    private List<Book> books;

    // Constructor to initialize Library with an empty list of books
    public Library() {
        books = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    public int getBooks() {
        return books.size();
    }
}
