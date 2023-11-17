package com.example.controllers;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.aula3.dto.ProdutoDTO;
import com.example.aula3.models.Produto;
import com.example.aula3.services.ProdutoService;

@RestController
@RequestMapping("/api/curso")
public class ProdutoController {
    private ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService){
        this.produtoService = produtoService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Produto save(@RequestBody ProdutoDTO dto) {
    Produto produto = produtoService.salvar(dto);
    return produto;
    }

    @GetMapping
    public java.util.List<Produto> listarTodos() {
        return produtoService.listarTodos();
    }

}
