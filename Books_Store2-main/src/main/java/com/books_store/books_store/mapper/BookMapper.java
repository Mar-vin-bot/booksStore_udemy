package com.books_store.books_store.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.books_store.books_store.Dto.BookDTO;
import com.books_store.books_store.entity.Book;

@Mapper 
public interface BookMapper {
    
    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    Book toModel (BookDTO bookDTO);

    BookDTO toDTO (Book book);
}
