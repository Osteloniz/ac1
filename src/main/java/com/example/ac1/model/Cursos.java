package com.example.ac1.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Cursos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 200, nullable = false)
    private String descricao;
    private int cargaHoraria;
    private String objetivo;
    private String resumo;

    //relação de um curso para muitas especializações
    @OneToMany(mappedBy = "curso")
    private List<Especializacao> especializacaos;

     //relação de um curso para muitas especializações
     @OneToMany(mappedBy = "curso")
     private List<Agenda> agendas;

    public Cursos() {
    }

    public Cursos(String descricao, int cargaHoraria, String objetivo, String resumo) {
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
        this.objetivo = objetivo;
        this.resumo = resumo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    
}
