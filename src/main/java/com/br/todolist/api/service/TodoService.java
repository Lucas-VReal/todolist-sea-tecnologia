package com.br.todolist.api.service;

import java.time.LocalDate;
import org.springframework.stereotype.Service;

import com.br.todolist.api.models.Todo;
import com.br.todolist.api.repositories.TodoRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class TodoService {

    private final TodoRepository todoRepository;

    public Todo salvar (Todo newItem){
        newItem.setDataDeCriacao(LocalDate.now());
        return todoRepository.save(newItem);
    }

    public void excluir(Long id) {
        todoRepository.deleteById(id);
    }
    
}
