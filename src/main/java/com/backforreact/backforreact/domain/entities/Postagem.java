package com.backforreact.backforreact.domain.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "postagens")
@Data
public class Postagem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private String conteudo;


    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    private boolean ativo = true;
}