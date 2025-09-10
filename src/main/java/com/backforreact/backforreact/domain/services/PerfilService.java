package com.backforreact.backforreact.domain.services;

import com.backforreact.backforreact.domain.entities.Perfil;
import com.backforreact.backforreact.domain.mappers.PerfilMapper;
import com.backforreact.backforreact.infra.PerfilRepository;
import com.backforreact.backforreact.web.dtos.perfil.PerfilCreateDTO;
import com.backforreact.backforreact.web.dtos.perfil.PerfilEditDTO;
import com.backforreact.backforreact.web.dtos.perfil.PerfilResponseDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PerfilService {

//    private final PerfilRepository repository;
//    private final PerfilMapper perfilMapper;
//
//    public PerfilService(PerfilRepository repository, PerfilMapper mapper) {
//        this.repository = repository;
//        this.perfilMapper = mapper;
//    }
//
//
//    public List<PerfilResponseDTO> listar() {
//        return repository.findAll().stream().map(perfilMapper::toResponse).toList();
//    }
//
//    public PerfilResponseDTO buscarOuFalhar(Long id) {
//        Perfil perfil = repository.findById(id).orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
//        return perfilMapper.toResponse(perfil);
//    }
//
//    public PerfilResponseDTO salvar(PerfilCreateDTO perfilCreateDTO) {
//        Perfil perfil = perfilMapper.toEntity(perfilCreateDTO);
//        return perfilMapper.toResponse(repository.save(perfil));
//    }
//
//    public void deletar(Long id) {
//        repository.deleteById(id);
//    }
//
//    public PerfilResponseDTO atualizar(Long id, PerfilEditDTO perfilEditDTO) {
//        Perfil usuarioAtualizado = repository.saveAndFlush(perfilMapper.toEntity(perfilEditDTO));
//        return perfilMapper.toResponse(usuarioAtualizado);
//    }
}