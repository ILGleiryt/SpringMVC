package com.testsomeone.random.repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.testsomeone.random.model.Content;
import com.testsomeone.random.model.Status;
import com.testsomeone.random.model.Type;

import jakarta.annotation.PostConstruct;

@Repository
public class ContentCollectionRepository {

    private final List<Content> content = new ArrayList<>();

    public ContentCollectionRepository() {
    }

    public List<Content> findAll() {
        return content;
    }
    public Optional<Content> findById(Integer id) {
        return content.stream().filter(c -> c.id().equals(id)).findFirst();
    }
    @PostConstruct
    private void init() {
        Content c = new Content(1,
         "MyFirstPost",
          "Hello all", 
          Status.IDEA,
           Type.ARTICLE,
            LocalDateTime.now(), 
            null,
             "");

            content.add(c); 
    }
}
