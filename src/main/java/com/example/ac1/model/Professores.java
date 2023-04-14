package com.example.ac1.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity
public class Professores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 200, nullable = false)
    private String nome;
    private String cpf;
    private String rg;
    private String end;
    private int celular;

    //relação de um professor para muitas especializações
    @OneToMany(mappedBy = "professor")
    private List<Especializacao> especializacaos;

     //relação de um professor para muitas especializações
     @OneToMany(mappedBy = "professor")
     private List<Agenda> agendas;

    public Professores() {}

    public Professores(String nome, String cpf, String rg, String end, int celular) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.end = end;
        this.celular = celular;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

}
