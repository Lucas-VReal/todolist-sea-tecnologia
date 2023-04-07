package com.br.todolist.api.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.br.todolist.data.models.Todo;
import com.br.todolist.data.repositories.TodoRepository;
import com.br.todolist.service.TodoService;

import javax.validation.Valid;
import java.util.List;

@AllArgsConstructor //cria os construtores automaticamente
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
    public ResponseEntity<Todo> buscarPeloId(@PathVariable Long id){
        return todoRepository.findById(id)
        .map(ResponseEntity::ok)
        .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Todo addNewIntem (@RequestBody Todo newItem){
        return todoService.salvar(newItem);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Todo> updateAItem (@PathVariable Long id, @Valid @RequestBody Todo updatedItem){
        if(!todoRepository.existsById(id)){
            return ResponseEntity.notFound().build();
        }
        updatedItem.setId(id);
        todoService.salvar(updatedItem);
        return ResponseEntity.ok(updatedItem);
    }


}