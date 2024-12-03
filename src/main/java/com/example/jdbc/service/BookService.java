package com.example.jdbc.service;

import com.example.jdbc.model.Book;
import com.example.jdbc.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book createBook(Book book) {
      return bookRepository.save(book);
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book getBookById(Long id) {
        return bookRepository.findById(id);
    }

    public Book updateBook(Long id, Book book) {
        book.setId(id);
      return bookRepository.update(book);
    }
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}
