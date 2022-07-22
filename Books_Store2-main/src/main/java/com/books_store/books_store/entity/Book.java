package com.books_store.books_store.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique =  true)
    private String name;

    @Column(nullable = false)
    private Integer pages;

    @Column(nullable = false)
    private Integer chapters;

    @Column(nullable = false)
    private String isbn;

    @Column(name = "publisher_name", nullable = false, unique =  true)
    private String publisherName;

 
    @JoinColumn(name = "autor_id")
    @ManyToOne (fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE} )
    @JsonBackReference
    private Autor autor;

  

    //ManyToOne -> varios livros para 1 autor
    //fetch = FetchType.LAZY -> para fazer a consulta livro e autores a consulta tera um join 
    //cascade  -> toda vez que inserir/remover um livro afetará a tabela autor
    //@JoinColumn -> qual coluna fará o relacionamento, chave estrangeira para tabela de autor
}
