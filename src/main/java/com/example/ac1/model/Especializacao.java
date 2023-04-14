package com.example.ac1.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;



@Entity
public class Especializacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //muitas especializações para um profeddor
    @ManyToOne
    @JoinColumn(name = "especializacaoProfessores_id")
    private Professores professor;

     //muitas especializações para um curso
     @ManyToOne
     @JoinColumn(name = "cursos_id")
     private Cursos curso;

}
