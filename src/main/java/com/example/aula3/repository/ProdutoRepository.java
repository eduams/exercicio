package com.example.aula3.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.aula3.models.Produto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
public class ProdutoRepository {
    @Autowired
    private EntityManager entityManager;

    @Transactional
    public Produto inserir(Produto produto) {
        entityManager.merge(produto);
        return produto;
    }

    @Transactional
    public void excluirPorId(int id) {
        String jpql = "DELETE FROM Produto c WHERE c.id = :id";
        entityManager.createQuery(jpql)
            .setParameter("id", id)
            .executeUpdate();
    }

    @Transactional
    public void editarNomePorId(int id, String novoNome) {
        String jpql = "UPDATE Produto p SET p.nome = :nome WHERE p.id = :id";
        entityManager.createQuery(jpql)
            .setParameter("id", id)
            .setParameter("nome", novoNome)
            .executeUpdate();
    }


    public List<Produto> obterTodos() {
        return entityManager.createQuery("from Produto",
                Produto.class).getResultList();
    }

    List<Produto> listarTodos();


    public List<Produto> obterPorNome(String nome) {
        String jpql = " select c from Produto c where c.nome like :nome";
        TypedQuery<Produto> query = entityManager.createQuery(jpql, Produto.class);
        query.setParameter("nome", "%" + nome + "%");
        return query.getResultList();
    }

}
