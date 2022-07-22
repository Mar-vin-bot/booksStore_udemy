package com.books_store.books_store.mapper;

import com.books_store.books_store.Dto.BookDTO;
import com.books_store.books_store.entity.Book;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-07-22T17:15:05-0300",
    comments = "version: 1.5.2.Final, compiler: Eclipse JDT (IDE) 1.4.100.v20220318-0906, environment: Java 17.0.3 (Eclipse Adoptium)"
)
public class BookMapperImpl implements BookMapper {

    @Override
    public Book toModel(BookDTO bookDTO) {
        if ( bookDTO == null ) {
            return null;
        }

        Book.BookBuilder book = Book.builder();

        book.autor( bookDTO.getAutor() );
        book.chapters( bookDTO.getChapters() );
        book.id( bookDTO.getId() );
        book.isbn( bookDTO.getIsbn() );
        book.name( bookDTO.getName() );
        book.pages( bookDTO.getPages() );
        book.publisherName( bookDTO.getPublisherName() );

        return book.build();
    }

    @Override
    public BookDTO toDTO(Book book) {
        if ( book == null ) {
            return null;
        }

        BookDTO.BookDTOBuilder bookDTO = BookDTO.builder();

        bookDTO.autor( book.getAutor() );
        bookDTO.chapters( book.getChapters() );
        bookDTO.id( book.getId() );
        bookDTO.isbn( book.getIsbn() );
        bookDTO.name( book.getName() );
        bookDTO.pages( book.getPages() );
        bookDTO.publisherName( book.getPublisherName() );

        return bookDTO.build();
    }
}
