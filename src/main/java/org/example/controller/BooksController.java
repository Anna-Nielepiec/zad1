package org.example.controller;

import org.example.domain.Books;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;
import java.util.ArrayList;

@RestController
public class BooksController {

    @GetMapping("/books")
    public List<Books> getBooks() {


        Books book1 = new Books("Harry Potter i Kamien Filozoficzny", "J.K.Rowling", 1, 1997);
        Books book2 = new Books("Nauka programowania. Rusz głową!", "Eric Freeman", 2, 2019);
        Books book3 = new Books("Java. Efektywne programowanie", "Joshua Bloch", 3, 2017);
        Books book4 = new Books("Rusz glowa! Java", "Kathy Sierra, Bert Bates", 4, 2010);
        Books book5 = new Books("SQL. Rusz głową!", "Lynn Beighley", 5, 2011);


        return toList(book5);
    }

    @PostMapping("/books")
    public boolean postBooks() {

        return true;
    }

    @DeleteMapping("/books")
    public boolean deleteBooks() {

        return true;
    }


    @PutMapping("/books")
    public boolean putBooks() {

        return true;
    }

    private java.util.List<Books> toList(Books... books) {
        return java.util.List.of(books);
    }

    private java.util.List<Books> toList(Books gr1, Books gr2,Books gr3,Books gr4) {
        java.util.List<Books> books = new ArrayList();
        books.add(gr1);
        books.add(gr2);
        books.add(gr3);
        books.add(gr4);
        return books;
    }
}
