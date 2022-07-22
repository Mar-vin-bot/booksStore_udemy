package com.books_store.books_store.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.books_store.books_store.Dto.BookDTO;
import com.books_store.books_store.Dto.MessageResponseDTO;
import com.books_store.books_store.entity.Book;
import com.books_store.books_store.mapper.BookMapper;
import com.books_store.books_store.repository.BookRepository;

@Service

public class BookService {

    private BookRepository bookRepository;

    private final BookMapper bookMapper = BookMapper.INSTANCE;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public MessageResponseDTO create(BookDTO bookDTO) {

        Book bookToSave = bookMapper.toModel(bookDTO);

        /*
         * Book bookToSave = Book.builder()
         * .name(bookDTO.getName())
         * .pages(bookDTO.getPages())
         * .chapters(bookDTO.getChapters())
         * .isbn(bookDTO.getIsbn())
         * .publisherName(bookDTO.getPublisherName())
         * .autor(bookDTO.getAutor())
         * .build();
         */

        Book saveBook = bookRepository.save(bookToSave);
        return MessageResponseDTO.builder()
                .mensagem("Book create white id " + saveBook.getId())
                .build();

    }
 /*
    public BookDTO findById(Integer id){
        Optional <Book>  optionalBook = bookRepository.findById(id);
        return bookMapper.toDTO(optionalBook.get());
    }

   
     * public Optional<Book> findById (Integer id) {
     * return bookRepository.findById(id);
     * }
     * 
     * public Optional<Book> busca(Integer id) {
     * return bookRepository.findById(id);
     * }
     */


    public Optional<Book> findById(Integer id) {
		return bookRepository.findById(id);
	}

}
