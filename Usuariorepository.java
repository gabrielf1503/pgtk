package br.uniesp.si.techback.service;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "usuarios")

public class Usuariorepository {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private LocalDate dataNascimento;

    // getters e setters
}

