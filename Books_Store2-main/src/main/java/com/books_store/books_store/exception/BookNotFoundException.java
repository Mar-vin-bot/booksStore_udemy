package com.books_store.books_store.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class BookNotFoundException extends Exception {

    public BookNotFoundException(Integer id){
        super(String.format("Book with not found "+ id));
    }
    
}
