package com.generation.backend.farmacia.repository;

import java.util.List; 

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.backend.farmacia.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	
	public List<Categoria> findAllByTarjaContainingIgnoreCase (String tarja);
	
	

}
