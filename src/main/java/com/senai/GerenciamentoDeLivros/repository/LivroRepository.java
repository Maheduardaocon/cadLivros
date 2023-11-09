package com.senai.GerenciamentoDeLivros.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.GerenciamentoDeLivros.entities.Livro;

public interface LivroRepository extends JpaRepository <Livro, Long> { 

}