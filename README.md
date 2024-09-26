# LibraryManagementSystem
# Library Management System

A simple Library Management System implemented in Java to manage books in a library, allowing users to add, issue, and return books. This project includes unit tests to verify the functionality.

## Features

- **Add Books**: Add new books to the library by specifying their ISBN, title, author, and year of publication.
- **Issue Books**: Issue books to users and mark them as unavailable.
- **Return Books**: Return issued books and mark them as available again.
- **Check Availability**: Verify if a specific book is available in the library or has already been issued.
- **Print Available Books**: Display all books currently available in the library.

## Technologies Used

- **Java**: Core programming language.
- **JUnit**: Testing framework for unit testing.

## Project Structure


## Getting Started

### Prerequisites

- **Java** (JDK 8 or higher)
- **JUnit 5** for running unit tests

### Installation

1. Clone this repository:

   ```bash
   git clone https://github.com/your-username/library-management-system.git
   cd library-management-system

javac src/main/java/com/library/management/*.java

java src/main/java/com/library/management/LibraryManagementSystem
compile:
javac -cp .:path/to/junit-platform-console-standalone.jar src/test/java/com/library/management/LibraryTest.java
run:
java -jar path/to/junit-platform-console-standalone.jar --class-path src/test/java/ --scan-class-path

Example Usage:
// Add books to the library
Library myLibrary = new Library();
Book book1 = new Book("978-9588671003", "Effective Java", "Sai Shelar", 2017);
myLibrary.addBook(book1);

// Issue a book
myLibrary.issueBook("978-0134685991");

// Check book availability
boolean isAvailable = myLibrary.isBookAvailable("978-0134685991");
System.out.println("Book available: " + isAvailable);

// Return the book
myLibrary.returnBook("978-0134685991");

To run  test:
mvn test


