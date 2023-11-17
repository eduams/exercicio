package com.example.aula3.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.aula3.models.CategoriaProduto;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
public class CategoriaProdutoRepository {
@Autowired
private EntityManager entityManager;
@Transactional
public CategoriaProduto inserir(CategoriaProduto categoriaProduto) {
entityManager.persist(categoriaProduto);
return categoriaProduto;
}
public List< CategoriaProduto > obterTodos() {
return entityManager.createQuery("from categoriaProduto", CategoriaProduto.class).getResultList();
}
}