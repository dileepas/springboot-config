package com.example.springboot.controller;

import com.example.springboot.ApplicationConfigBeen;
import com.example.springboot.domain.Todo;
import com.example.springboot.repository.TodoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class HelloController {

    private final Logger logger = LoggerFactory.getLogger(HelloController.class);

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
        logger.info("Getting all list");
        return todoRepository.findAll();
    }

    @PostMapping("/todo")
    @ResponseStatus(HttpStatus.CREATED)
    public Todo createTodo(@RequestBody Todo todo)   {
        return todoRepository.save(todo);
    }
}
