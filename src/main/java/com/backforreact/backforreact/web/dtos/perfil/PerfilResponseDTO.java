package com.backforreact.backforreact.web.dtos.perfil;

public record PerfilResponseDTO(
        Long id,

        String cargo,

        String departamento,

        boolean ativo
) {
}
