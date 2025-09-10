/*
 * Copyright (c) 2024. Defensoria P�blica Geral de MS. All rights reserved.
 *
 *  Defensoria P�blica Geral de MS confidential and Proprietary information. It is strictly
 *  forbidden for 3rd parties to modify, decompile, disassemble, defeat, disable
 *  or circumvent any protection mechanism; to sell, license, lease, rent,
 *  redistribute or make accessible to any third party, whether for profit or
 *  without charge.
 */

package com.backforreact.backforreact.domain.mappers;


import com.backforreact.backforreact.domain.entities.Postagem;
import com.backforreact.backforreact.domain.entities.Usuario;
import com.backforreact.backforreact.web.dtos.postagem.PostagemCreateDTO;
import com.backforreact.backforreact.web.dtos.postagem.PostagemEditDTO;
import com.backforreact.backforreact.web.dtos.postagem.PostagemResponseDTO;
import com.backforreact.backforreact.web.dtos.usuario.UsuarioCreateDTO;
import com.backforreact.backforreact.web.dtos.usuario.UsuarioEditDTO;
import com.backforreact.backforreact.web.dtos.usuario.UsuarioResponseDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PostagemMapper {
    Postagem toEntity(PostagemCreateDTO createDTO);
    Postagem toEntity(PostagemEditDTO editDTO);
    PostagemResponseDTO toResponse(Postagem entity);
}