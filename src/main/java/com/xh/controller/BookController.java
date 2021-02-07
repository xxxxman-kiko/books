package com.xh.controller;

import com.xh.entity.Book;
import com.xh.entity.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @Autowired
    BookRepository bookRepository;
    @GetMapping("/book/{id}")
    public Book getBook(@PathVariable("id") Integer id){
        Book book = (Book) bookRepository.findById(id).get();
        return book;
    }
    @GetMapping("/book")
    public Book insertUser(Book book){
        Book save = bookRepository.save(book);
        return book;
    }


}
