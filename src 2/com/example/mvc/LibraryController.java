package com.example.mvc;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class LibraryController {

    List<String> books = new ArrayList<>();

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to Library";
    }

    @GetMapping("/count")
    public int count(){
        return 100;
    }

    @GetMapping("/price")
    public double price(){
        return 250.5;
    }

    @GetMapping("/books")
    public List<String> getBooks(){
        return Arrays.asList("Java","Spring","Python");
    }

    @GetMapping("/books/{id}")
    public String book(@PathVariable int id){
        return "Book ID: "+id;
    }

    @GetMapping("/search")
    public String search(@RequestParam String title){
        return "Searching book: "+title;
    }
}
