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


import com.backforreact.backforreact.domain.entities.Perfil;
import com.backforreact.backforreact.domain.entities.Usuario;
import com.backforreact.backforreact.web.dtos.perfil.PerfilCreateDTO;
import com.backforreact.backforreact.web.dtos.perfil.PerfilEditDTO;
import com.backforreact.backforreact.web.dtos.perfil.PerfilResponseDTO;
import com.backforreact.backforreact.web.dtos.usuario.UsuarioCreateDTO;
import com.backforreact.backforreact.web.dtos.usuario.UsuarioEditDTO;
import com.backforreact.backforreact.web.dtos.usuario.UsuarioResponseDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PerfilMapper {
    Perfil toEntity(PerfilCreateDTO createDTO);
    Perfil toEntity(PerfilEditDTO editDTO);
    PerfilResponseDTO toResponse(Perfil entity);
}
