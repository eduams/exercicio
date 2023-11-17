package com.example.aula3.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public class ProdutoDTO { 
        private Long id;
        private String nome;
        private Integer produtoQtd;
        private Integer categoriaProdutoId;
    }
