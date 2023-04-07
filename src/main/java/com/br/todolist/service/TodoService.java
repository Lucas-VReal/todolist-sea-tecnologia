package com.br.todolist.service;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.stereotype.Service;

import com.br.todolist.data.models.Todo;
import com.br.todolist.data.repositories.TodoRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class TodoService {

    private final TodoRepository todoRepository;

    public Todo salvar (Todo newItem){
        newItem.setDataDeCriacao(LocalDate.now());
        return todoRepository.save(newItem);
    }

    private Date dft(LocalDate now) {
        return null;
    }

    public void excluir(Long id) {
        todoRepository.deleteById(id);
    }
    
}
