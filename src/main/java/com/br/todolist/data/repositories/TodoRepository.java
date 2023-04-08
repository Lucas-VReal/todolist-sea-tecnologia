package com.br.todolist.data.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.br.todolist.data.models.Todo;


public interface TodoRepository extends JpaRepository<Todo, Long>{
    
}
