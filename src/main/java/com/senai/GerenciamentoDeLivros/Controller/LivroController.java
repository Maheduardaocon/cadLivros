package com.senai.GerenciamentoDeLivros.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.GerenciamentoDeLivros.entities.Livro;
import com.senai.GerenciamentoDeLivros.services.LivroService;


	@RestController
	@RequestMapping("/livros")
	public class LivroController {
		private final LivroService service;

	    @Autowired
	    public LivroController(LivroService service) {
	        this.service = service;
	    }

	    @PostMapping
	    public Livro createLivro(@RequestBody Livro livro) {
	        return service.saveLivro(livro);
	    }

	    @GetMapping("/{id}")
	    public Livro getLivro(@PathVariable Long id) {
	        return service.getLivroById(id);
	    }

	    @GetMapping
	    public List<Livro> getAllLivros() {
	        return service.getAllLivro();
	    }

	    @DeleteMapping("/{id}")
	    public void deleteLivros(@PathVariable Long id) {
	    	service.deleteLivro(id);
	    }
	}
