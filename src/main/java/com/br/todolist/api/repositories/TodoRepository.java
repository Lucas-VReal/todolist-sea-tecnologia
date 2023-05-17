package com.br.todolist.api.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.todolist.api.models.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long>{
    
}
