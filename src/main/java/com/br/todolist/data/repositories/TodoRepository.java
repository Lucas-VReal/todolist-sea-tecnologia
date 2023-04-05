package com.br.todolist.data.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.todolist.data.models.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long>{
    
}
