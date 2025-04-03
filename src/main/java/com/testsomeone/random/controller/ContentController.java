package com.testsomeone.random.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testsomeone.random.model.Content;
import com.testsomeone.random.model.Status;
import com.testsomeone.random.model.Type;
import com.testsomeone.random.repository.ContentCollectionRepository;

import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping("/api/content")
public class ContentController {

    private final ContentCollectionRepository repository;

    public ContentController(ContentCollectionRepository repository) {
        this.repository = repository;
    }
    @GetMapping("")
    public List<Content> findAll() {
        return repository.findAll();
    }

    
}    

