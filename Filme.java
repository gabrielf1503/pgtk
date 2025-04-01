package br.uniesp.si.techback.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_filme")
public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Object titulo;
    private String autor;

    public Object getTitulo() {
        return titulo;
    }

    public void setTitulo(Object titulo) {
        this. titulo = titulo;
    }
}
