package com.books_store.books_store.repository;


import org.springframework.data.jpa.repository.JpaRepository;


import com.books_store.books_store.entity.Book;

public interface BookRepository extends JpaRepository <Book, Integer> {


    
}
