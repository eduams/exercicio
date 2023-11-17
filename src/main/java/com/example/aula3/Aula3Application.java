package com.example.aula3;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.aula3.models.CategoriaProduto;
import com.example.aula3.models.Produto;
import com.example.aula3.repository.CategoriaProdutoRepository;
import com.example.aula3.repository.ProdutoRepository;

@SpringBootApplication
public class Aula3Application {

	@Bean
	public CommandLineRunner init(@Autowired ProdutoRepository produtoRepository, @Autowired CategoriaProdutoRepository categoriaProdutoRepository ) {
			return args -> {
			CategoriaProduto escreve = new CategoriaProduto(0,"Escreve");
			CategoriaProduto apaga = new CategoriaProduto(0,"Apaga");
			categoriaProdutoRepository.inserir(escreve);
			categoriaProdutoRepository.inserir(apaga);
			
			//Teste do método inserir
			produtoRepository.inserir(
					new Produto((long) 0, "Lapis", 8000,escreve));
			produtoRepository.inserir(
					new Produto((long) 0, "Borracha", 5050,apaga));
			produtoRepository.inserir(
					new Produto((long) 0, "Caneta", 8000,escreve));
			//Teste do método para selecionar todos
			List<Produto> listaProdutos = produtoRepository.obterTodos();
			listaProdutos.forEach(System.out::println);
			//Teste do método para excluir por seleção de ID
			produtoRepository.excluirPorId(1);
			//Teste do método para editar por seleção de ID
			produtoRepository.editarNomePorId(2, "Lapiseira");
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(Aula3Application.class, args);
	}

}
