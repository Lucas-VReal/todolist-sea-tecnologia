package com.br.todolist.api.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.br.todolist.data.models.Todo;
import com.br.todolist.data.repositories.TodoRepository;

import javax.validation.Valid;
import java.util.List;

@AllArgsConstructor //cria os construtores automaticamente
@RestController
@RequestMapping("/todo")
@CrossOrigin(origins = "*")

public class TodoController {

    private final TodoRepository todoRepository;

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

//     @GetMapping("/{id}")
//     public ResponseEntity<Client> findById(@PathVariable Long id){
//         return clientRepository.findById(id)
// //                .map(client -> ResponseEntity.ok(client))
//                 .map(ResponseEntity::ok)
//                 .orElse(ResponseEntity.notFound().build());

// //        Optional<client> clientOptional = clientRepository.findById(id);
// //
// //        if(clientOptional.isPresent()){
// //            return ResponseEntity.ok(clientOptional.get());
// //        }
// //
// //        return ResponseEntity.notFound().build();
//     }

//     @PostMapping
//     @ResponseStatus(HttpStatus.CREATED)
//     public Client addNewClient (@Valid @RequestBody Client client){
//         return clientService.salvar(client);
//     }

//     @PutMapping("/{id}")
//     @ApiOperation(value= "Update a client by Id")
//     public ResponseEntity<Client> updateAClient (@PathVariable Long id, @Valid @RequestBody Client client){
//         if(!clientRepository.existsById(id)){
//             return ResponseEntity.notFound().build();
//         }
//         client.setId(id);
//         clientService.salvar(client);
//         return ResponseEntity.ok(client);
//     }

//     @DeleteMapping("/{id}")
//     @ApiOperation(value= "Delete a client")
//     public ResponseEntity<Void> DeleteById(@PathVariable Long id){
//         if(!clientRepository.existsById(id)){
//             return ResponseEntity.notFound().build();
//         }
//         clientService.excluir(id);
//         return ResponseEntity.noContent().build();
//     }

}