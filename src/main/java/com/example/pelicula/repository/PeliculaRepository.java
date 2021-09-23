package com.example.pelicula.repository;

import com.example.pelicula.model.PeliculaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeliculaRepository extends JpaRepository<PeliculaModel, Integer> {
}
