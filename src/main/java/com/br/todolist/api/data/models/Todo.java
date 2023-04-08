package com.br.todolist.api.data.models;

import java.time.LocalDate;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull(message = "Obrigatorio informar o titulo")
    @NotBlank(message = "O titulo não pode estar em branco")
    private String titulo;
    private LocalDate dataDeCriacao;
    @NotNull(message = "Necessario informar se ja foi concluida ou nao")
    private boolean feito;
}