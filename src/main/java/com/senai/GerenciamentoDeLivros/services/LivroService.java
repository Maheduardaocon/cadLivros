package com.senai.GerenciamentoDeLivros.services;

import java.util.List;


import com.senai.GerenciamentoDeLivros.entities.Livro;
import com.senai.GerenciamentoDeLivros.repository.LivroRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LivroService {
		private final LivroRepository LivroRepository;

		@Autowired
		public LivroService(LivroRepository LivroRepository) {
			this.LivroRepository = LivroRepository;

		}

		public Livro saveLivro(Livro Livro) {
			return LivroRepository.save(Livro);
		}

		public Livro getLivroById(Long id) {
			return LivroRepository.findById(id).orElse(null);
		}

		public List<Livro> getAllLivro() {
			return LivroRepository.findAll();
		}

		public void deleteLivro(Long id) {
			LivroRepository.deleteById(id);
		}

	
		}
			