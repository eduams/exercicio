package com.example.aula3.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Produto {
    @ManyToOne
    @JoinColumn(name= "categoriaProduto_id")
    private CategoriaProduto categoriaProduto;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 200, nullable = false)
    private String nome;    
    @Column(nullable = false)
    private int prod_qtd;

    public Produto(Long id, String nome, int prod_qtd, CategoriaProduto categoriaProduto) {
        this.id = id;
        this.nome = nome;
        this.prod_qtd = prod_qtd;
        this.categoriaProduto = categoriaProduto;
    }

    public Produto() {
    }

    public CategoriaProduto getCategoriaProduto() {
    return categoriaProduto;
    }

    public void setCategoriaProduto(CategoriaProduto categoriaProduto) {
    this.categoriaProduto = categoriaProduto;
    }



    @Override
    public String toString() {
        return "Produto [id=" + id + ", nome=" + nome + ", prod_qtd=" + prod_qtd + ", categoriaProduto=" + categoriaProduto + "]";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getProd_qtd() {
        return prod_qtd;
    }

    public void setProd_qtd(int prod_qtd) {
        this.prod_qtd = prod_qtd;
    }

}
