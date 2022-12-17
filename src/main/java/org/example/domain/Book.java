package org.example.domain;

public class Book {

    private String title;
    private String author;
    private int id;
    private int yearOfPublishment;

    public Book() {
    }

    public Book(String title, String author, int id, int yearOfPublishment) {
        this.title = title;
        this.author = author;
        this.id = id;
        this.yearOfPublishment = yearOfPublishment;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYearOfPublishment() {
        return yearOfPublishment;
    }

    public void setYearOfPublishment(int yearOfPublishment) {
        this.yearOfPublishment = yearOfPublishment;
    }

}
