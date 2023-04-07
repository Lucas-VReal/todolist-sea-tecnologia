package com.br.todolist.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.br.todolist.data.models.Todo;
import com.br.todolist.data.repositories.TodoRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class TodoService {

    private final TodoRepository todoRepository;

    public Todo salvar (Todo newItem){
        return todoRepository.save(newItem);
    }

    
}
