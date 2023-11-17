package com.example.aula3.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="categoria_produto")
public class CategoriaProduto {
@OneToMany(mappedBy = "categoriaProduto")
private List<Produto> produtos;
public List<Produto> getProdutos() {
    return produtos;
    }
    public void setProdutos(List<Produto> produtos) {
    this. produtos = produtos;
    }
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String nome;
public CategoriaProduto() {
}
public CategoriaProduto(int id, String nome) {
this.id = id;
this.nome = nome;
}
public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}

}