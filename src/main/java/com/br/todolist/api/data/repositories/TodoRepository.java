package com.br.todolist.api.data.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.br.todolist.api.data.models.Todo;


public interface TodoRepository extends JpaRepository<Todo, Long>{
    
}
