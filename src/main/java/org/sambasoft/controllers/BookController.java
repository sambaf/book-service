package org.sambasoft.controllers;

import org.sambasoft.persistance.Book;
import org.sambasoft.persistance.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("books")
public class BookController {

  @Autowired
  private BookRepository bookRepository;

  @GetMapping
  public Iterable<Book> listBooks() {
    return bookRepository.findAll();
  }

  @PostMapping
  public Book createBook(@RequestBody Book book) {
    return bookRepository.save(book);
  }
}
