package com.backforreact.backforreact.web.dtos.usuario;

import com.backforreact.backforreact.web.dtos.perfil.PerfilResponseDTO;
import com.backforreact.backforreact.web.dtos.postagem.PostagemResponseDTO;

import java.util.List;

public record UsuarioResponseDTO(
        Long id,

        String nome,
        String email,
        PerfilResponseDTO perfil,
        List<PostagemResponseDTO> postagens
) {
}