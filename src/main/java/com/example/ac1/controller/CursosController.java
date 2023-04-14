package com.example.ac1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ac1.model.Cursos;
import com.example.ac1.respository.CursosRepository;

@RestController
@RequestMapping("/cursos")
public class CursosController {
    @Autowired
    private CursosRepository cursosRepository;

    //EndPoint
    //POST: Cadastrar um novo curso
    @PostMapping("/cadastrarCurso")
    public Cursos cadastrarCurso(@RequestBody Cursos curso){
        return cursosRepository.save(curso);
    }

    //EndPoint GET
    //GET: Obter todos os cursos
    @GetMapping("/obterTodos")
    public List<Cursos> obterTodosCursos() {
        return cursosRepository.findAll();
    }

    //EndPoint DELETe
    //DELETE : Deletear pelo ID do curso
    @DeleteMapping("/deletar/{id}")
    public void deletarCurso(@PathVariable Cursos cursos) {
        cursosRepository.delete(cursos);
    }

    //EndPoint PUT
    //PUT: Editar todas as informações de um certo curso
    @PutMapping("/editar/{curso}")
    public Cursos editarCurso(@RequestBody Cursos curso) {
        return cursosRepository.save(curso);
    }

    //EndPoint PATCH
    //PATCH: Editar uma ou demais partes das informações de um certo curso
    @PatchMapping("/editOther/{curso}")
    public Cursos editarComponenteCurso(@RequestBody Cursos curso) {
        return cursosRepository.save(curso);
    }

    //EndPoint GET
    //GET: Obter todos os cursos por uma certa carga horaria
    @GetMapping("/obterTodosHorario/{hora}")
    public List<Cursos> obterTodosCursoPorCargaHoraria(@RequestBody int cargaHoraria) {
        return cursosRepository.findByCargaHoraria(cargaHoraria);
    }

    //EndPoint GET
    //GET: Obter todos os cursos por um respectivo nome
    @GetMapping("/obterTodosCurso/{nome}")
    public List<Cursos> obterTodosCursoPorNome(@RequestBody String nome) {
        return cursosRepository.findByDescricaoLike("%" + nome + "%");
    }


}
