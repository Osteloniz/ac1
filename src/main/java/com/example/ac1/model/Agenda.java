package com.example.ac1.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Agenda {
      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private long id;

      @Column(length = 200, nullable = false)
      private int horaInicio, horaFim;
      @Column(length = 200, nullable = false)
      private String dataInicio, dataFim;
      @Column(length = 200, nullable = false)
      private String cidade, cep, estado;
      @Column(length = 200, nullable = false)
      private String responsavel;
      
      //Muitas agenda para um curso
      @ManyToOne
      @JoinColumn(name = "cursosAgenda_id")
      private Cursos curso;

       //Muitas agenda para um professor
       @ManyToOne
       @JoinColumn(name = "professorAgenda_id")
       private Professores professor;
    
}
