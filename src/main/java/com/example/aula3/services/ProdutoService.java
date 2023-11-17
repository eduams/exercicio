package com.example.aula3.services;

import org.hibernate.mapping.List;

import com.example.aula3.dto.ProdutoDTO;
import com.example.aula3.models.Produto;

public interface ProdutoService {
    Produto salvar(ProdutoDTO cursoDTO);

    java.util.List<Produto> listarTodos();

    void excluir(Long id);

    void editar(Long id, ProdutoDTO dto);
}
