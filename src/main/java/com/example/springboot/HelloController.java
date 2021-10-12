package com.example.springboot;

import com.example.springboot.domain.Todo;
import com.example.springboot.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class HelloController {
    @Autowired
    private ApplicationConfigBeen appConfigBeen;

    @Autowired
    private TodoRepository todoRepository;

    @GetMapping("/")
    public String index() throws Exception {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/todo")
    public List<Todo> getTodoList() {
        return todoRepository.findAll();
    }

    @PostMapping("/todo")
    @ResponseStatus(HttpStatus.CREATED)
    public Todo createTodo(@RequestBody Todo todo)   {
        return todoRepository.save(todo);
    }
}
