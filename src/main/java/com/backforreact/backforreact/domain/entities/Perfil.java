package com.backforreact.backforreact.domain.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "perfis")
@Data
public class Perfil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cargo;

    private String departamento;

    @OneToOne(mappedBy = "perfil")
    private Usuario usuario;

    private boolean ativo = true;

}