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

    // Method to check if a book is available based on its ISBN
    public boolean isBookAvailable(String ISBN) throws Exception {
        for (Book book : books) {
            if (book.getISBN().equals(ISBN)) {
                if (book.isAvailable()) {
                    return true;
                } else {
                    throw new Exception("Book is Not Available");
                }
            }
        }
        throw new Exception("Book with ISBN " + ISBN + " does not exist in the library.");
    }
    // Method to issue a book based on ISBN
    public void issueBook(String ISBN) throws Exception {
        if (isBookAvailable(ISBN)) {
            for (Book book : books) {
                if (book.getISBN().equals(ISBN)) {
                    book.setAvailable(false);
                    System.out.println("The book with ISBN " + ISBN + " has been issued.");
                    return;
                }
            }
        }
    }

    // Method to return a book based on ISBN
    public void returnBook(String ISBN) throws Exception {
        for (Book book : books) {
            if (book.getISBN().equals(ISBN)) {
                if (!book.isAvailable()) {
                    book.setAvailable(true);
                    System.out.println("The book with ISBN " + ISBN + " has been returned.");
                } else {
                    throw new Exception("The book was not issued, so it cannot be returned.");
                }
                return;
            }
        }
        throw new Exception("Book with ISBN " + ISBN + " does not exist in the library.");
    }

    // Method to print a list of all available books in the library
    public void printAvailableBooks() {
        System.out.println("List of available books:");
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println(book);
            }
        }
    }



}
