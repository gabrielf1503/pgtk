package br.uniesp.si.techback.service;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "usuario")
class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;

    @Column(name = "data_nascimento")
    private LocalDate dataNascimento;

    // Getters e Setters (pode usar Lombok para simplificar)
}
