package com.books_store.books_store.Dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MessageResponseDTO {

    private String mensagem;
    
}
