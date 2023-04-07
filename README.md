
![Logo](https://media.licdn.com/dms/image/C4D0BAQEbpXvEMioABA/company-logo_200_200/0/1635539682599?e=2147483647&v=beta&t=cVr_hUYp9WS9X-E4cDREnLVzMJ74r92Ue_7tZAoYKEU)


# To do List para SEA Tecnologia

Como parte da seleção para se tornar membro do time SEA Tecnologia, realizei um pequeno desafio: 

- Desenvolver um CRUD na sua linguagem preferida



## Como baixar e rodar a aplicação: 
 
  ### Abra seu terminal git bash e cole (na ordem): 
 
  ``` 
    git clone https://github.com/Lucas-VReal/todolist-sea-tecnologia
  ```
    cd todolist-sea-tecnologia
  ```
    mvn clean install
  ```
    cd target
  ```
    java -jar todolist-0.0.1-SNAPSHOT.jar
  ```
### Feito isso, abra seu navegador e cole:

http://localhost:8080/swagger-ui/#/
## Documentação da API

#### Retorna todos os itens
##### Requisição http: Get

```http
  http://localhost:8080/todo
```

| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `nenhum` | `vazio` | |

#### Retorna um item
##### Requisição http: Get

```http
  http://localhost:8080/todo/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `Long` | **Obrigatório**. O ID do item que você quer |

#### Adiciona um item
##### Requisição http: POST

```http
  http://localhost:8080/todo/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `Long` | **Obrigatório**. O ID do item que você quer e o JSON contendo os dados necessários |

##### JSON
| atributo  | Tipo       | Obrigatoriedade|
| :---------- | :--------- | :------------------------------------------ |
| `titulo`      | `String` | **Obrigatório** |
| `dataDeCriacao`  | `Date` | **Obrigatório** |
| `feito`      | `Boolean` | **Obrigatório** |

#### Atualiza um item
##### Requisição http: PUT

```http
  http://localhost:8080/todo/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `Long` | **Obrigatório**. O ID do item que você quer e o JSON contendo os dados necessários |

##### JSON

| atributo  | Tipo       | Obrigatoriedade|
| :---------- | :--------- | :------------------------------------------ |
| `titulo`      | `String` | **Pelo menos um** |
| `dataDeCriacao`  | `Date` | **Pelo menos um** |
| `feito`      | `Boolean` | **Pelo menos um** |

#### Deletar um item
##### Requisição http: DELETE

```http
  http://localhost:8080/todo/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `Long` | **Obrigatório**. O ID do item que você quer excluir |



Link para testes: http://localhost:8080/swagger-ui/#/

## Autor

- [@Lucas-VReal](https://github.com/Lucas-VReal)
