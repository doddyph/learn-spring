package com.nitelab.spring.jpa;

import com.nitelab.spring.jpa.model.Notebook;
import com.nitelab.spring.jpa.model.NotebookDetail;
import com.nitelab.spring.jpa.repository.NotebookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dph on 09/10/16.
 * Link:
 * https://hellokoding.com/jpa-one-to-one-foreignkey-relationship-example-with-spring-boot-maven-and-mysql/
 */
@SpringBootApplication
public class Application implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    @Autowired
    NotebookRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        List<Notebook> notebooks = new ArrayList<>();
        notebooks.add(new Notebook("Notebook A", new NotebookDetail(49)));
        notebooks.add(new Notebook("Notebook B", new NotebookDetail(59)));
        notebooks.add(new Notebook("Notebook C", new NotebookDetail(69)));
        repository.save(notebooks);
    }
}
