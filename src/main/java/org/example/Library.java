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
}
