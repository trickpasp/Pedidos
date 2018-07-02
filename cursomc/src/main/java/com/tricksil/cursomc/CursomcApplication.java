package com.tricksil.cursomc;

import com.tricksil.cursomc.domain.Categoria;
import com.tricksil.cursomc.repositories.CategoriaRepository;
import javafx.print.Collation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Collections;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public static void main(String[] args) {
        SpringApplication.run(CursomcApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Categoria categoria1 = new Categoria("Informática");
        Categoria categoria2 = new Categoria("Escritório");
        categoriaRepository.saveAll(Arrays.asList(categoria1,categoria2));
    }
}
