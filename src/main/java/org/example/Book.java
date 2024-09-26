package org.example;

// Class representing a Publication with attributes code, name, writer, and yearOfPublication
public class Book {
    private String code;
    private String name;
    private String writer;
    private int yearOfPublication;
    private boolean isInStock;

    // Constructor to initialize Publication object
    public Book(String code, String name, String writer, int yearOfPublication) {
        this.code = code;
        this.name = name;
        this.writer = writer;
        this.yearOfPublication = yearOfPublication;
        this.isInStock = true;  // Publications are in stock by default when added
    }

    // Getters and setters for publication attributes
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public boolean isInStock() {
        return isInStock;
    }

    public void setInStock(boolean inStock) {
        isInStock = inStock;
    }

    // Method to display publication details
    @Override
    public String toString() {
        return "Publication [code=" + code + ", name=" + name + ", writer=" + writer + ", yearOfPublication=" + yearOfPublication + "]";
    }
}
