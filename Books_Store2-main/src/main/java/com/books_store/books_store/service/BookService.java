package com.books_store.books_store.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.books_store.books_store.Dto.BookDTO;
import com.books_store.books_store.Dto.MessageResponseDTO;
import com.books_store.books_store.entity.Book;
import com.books_store.books_store.exception.BookNotFoundException;
import com.books_store.books_store.mapper.BookMapper;
import com.books_store.books_store.repository.BookRepository;

@Service

public class BookService {

    @Autowired
    private BookRepository bookRepository;

    private final BookMapper bookMapper = BookMapper.INSTANCE;

    


    public MessageResponseDTO create(BookDTO bookDTO) {
        Book bookToSave = bookMapper.toModel(bookDTO);

        Book saveBook = bookRepository.save(bookToSave);
        return MessageResponseDTO.builder()
                .mensagem("Book create white id " + saveBook.getId())
                .build();

    }
 
    public BookDTO findById(Integer id) throws BookNotFoundException{
        Book book =  bookRepository.findById(id)
        .orElseThrow(() -> new BookNotFoundException(id));

        return bookMapper.toDTO(book);
    }

}
