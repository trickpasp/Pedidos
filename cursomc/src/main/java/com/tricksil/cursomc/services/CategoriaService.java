package com.tricksil.cursomc.services;

import com.tricksil.cursomc.domain.Categoria;
import com.tricksil.cursomc.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria buscar(Integer id){

        return  categoriaRepository.findById(id).orElse(null);
    }

}
