package com.backforreact.backforreact.web.dtos.postagem;

import com.backforreact.backforreact.web.dtos.usuario.UsuarioResponseDTO;

public record PostagemResponseDTO(
        Long id,

        String titulo,

        String conteudo,

        boolean ativo
) {
}
