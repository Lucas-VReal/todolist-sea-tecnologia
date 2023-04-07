package com.br.todolist.data.models;

import java.util.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@JsonIgnoreProperties
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    @SequenceGenerator(initialValue = 3, name = "seq_generator")
    private Long id;

    private String titulo;
    private Date dataDeCriacao;
    private boolean feito;
}
