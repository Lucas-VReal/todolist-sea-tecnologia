package com.br.todolist.api.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.br.todolist.api.models.Todo;


public interface TodoRepository extends JpaRepository<Todo, Long>{
    
}
