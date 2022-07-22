package com.books_store.books_store.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.books_store.books_store.Dto.BookDTO;
import com.books_store.books_store.Dto.MessageResponseDTO;
import com.books_store.books_store.entity.Book;
import com.books_store.books_store.service.BookService;

@RestController
@RequestMapping("/api/v1/books")
public class BookControler {

    private BookService bookservice;

    @Autowired
    public BookControler(BookService bookservice) {
        this.bookservice = bookservice;
    }



    @PostMapping
    public MessageResponseDTO create (@RequestBody @Valid BookDTO bookDTO){
        return bookservice.create(bookDTO);   
    }
/*/
    @GetMapping("/{id}")
    public BookDTO findById(@PathVariable Integer id){
        return bookservice.findById(id);
    }
*/

    @GetMapping("/{id}")
	public Optional<Book> findById (@PathVariable Integer id) {
		return bookservice.findById(id);
	}



}
