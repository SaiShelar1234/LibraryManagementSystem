package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    private Library myLibrary;
    private Book firstBook;
    private Book secondBook;
    private Book thirdBook;

    // Setup method to initialize the library and books before each test
    @BeforeEach
    public void setUp() {
        myLibrary = new Library();
        firstBook = new Book("978-0134685991", "Effective Java", "Joshua Bloch", 2017);
        secondBook = new Book("978-0596009205", "Head First Java", "Kathy Sierra", 2005);
        thirdBook = new Book("978-0132350884", "Clean Code", "Robert C. Martin", 2008);

        myLibrary.addBook(firstBook);
        myLibrary.addBook(secondBook);
        myLibrary.addBook(thirdBook);
    }

    // Test case to check if the books were added correctly
    @Test
    public void testAddBook() {
        assertEquals(3, myLibrary.getBooks());
    }

    // Test case to verify that books are available when added
    @Test
    public void testBookAvailability() throws Exception {
        assertTrue(myLibrary.isBookAvailable("978-0134685991"), "Effective Java should be available.");
        assertTrue(myLibrary.isBookAvailable("978-0596009205"), "Head First Java should be available.");
        assertTrue(myLibrary.isBookAvailable("978-0132350884"), "Clean Code should be available.");
    }
}