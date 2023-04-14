package com.example.ac1.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.ac1.model.Cursos;

public interface CursosRepository extends JpaRepository<Cursos, Long>{

    List<Cursos> findByCargaHoraria(int cargaHoraria);
    List<Cursos> findByDescricaoLike(String desc);
}