package com.br.todolist.api.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.br.todolist.api.models.Todo;
import com.br.todolist.api.repositories.TodoRepository;
import com.br.todolist.api.service.TodoService;

import javax.validation.Valid;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/todo")
@CrossOrigin(origins = "*")
public class TodoController {

    private final TodoRepository todoRepository;
    private final TodoService todoService;

    @GetMapping
    public List<Todo> listar(){
        return todoRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Todo> findById(@PathVariable Long id){
        return todoRepository.findById(id)
        .map(ResponseEntity::ok)
        .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Todo addNewIntem (@RequestBody Todo newItem){
        return todoService.save(newItem);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Todo> updateAItem (@PathVariable Long id, @Valid @RequestBody Todo updatedItem){
        if(!todoRepository.existsById(id)){
            return ResponseEntity.notFound().build();
        }
        updatedItem.setId(id);
        todoService.save(updatedItem);
        return ResponseEntity.ok(updatedItem);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id){
        if(!todoRepository.existsById(id)){
            return ResponseEntity.notFound().build();
        }
        todoService.delete(id);
        return ResponseEntity.noContent().build();
    }


}