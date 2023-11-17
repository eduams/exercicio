package com.example.aula3.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import com.example.aula3.dto.ProdutoDTO;
import com.example.aula3.models.CategoriaProduto;
import com.example.aula3.models.Produto;
import com.example.aula3.repository.ProdutoRepository;

    @Service
    @RequiredArgsConstructor
    public class ProdutoServiceImpl implements ProdutoService {


    @Override
    public Produto salvar(ProdutoDTO dto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'salvar'");
    }

    @Override
    public List<Produto> listarTodos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarTodos'");
    }

    @Override
    public void excluir(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'excluir'");
    }

    @Override
    public void editar(Long id, ProdutoDTO dto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'editar'");
    }
    

}
