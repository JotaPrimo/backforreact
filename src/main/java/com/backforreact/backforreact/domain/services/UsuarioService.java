package com.backforreact.backforreact.domain.services;

import com.backforreact.backforreact.domain.entities.Usuario;
import com.backforreact.backforreact.domain.mappers.UsuarioMapper;
import com.backforreact.backforreact.infra.UsuarioRepository;
import com.backforreact.backforreact.web.dtos.usuario.UsuarioEditDTO;
import com.backforreact.backforreact.web.dtos.usuario.UsuarioResponseDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Stream;

@Service
public class UsuarioService {

    private final UsuarioRepository repository;
    private final UsuarioMapper usuarioMapper;

    public UsuarioService(UsuarioRepository repostory, UsuarioMapper usuarioMapper) {
        this.repository = repostory;
        this.usuarioMapper = usuarioMapper;
    }

    public List<UsuarioResponseDTO> listar() {
        return repository.findAll().stream().map(usuarioMapper::toResponse).toList();
    }

    public UsuarioResponseDTO buscarOuFalhar(Long id) {
        Usuario usuario = repository.findById(id).orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
        return usuarioMapper.toResponse(usuario);
    }

    public UsuarioResponseDTO salvar(Usuario usuario) {
        return usuarioMapper.toResponse(repository.save(usuario));
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }

    public UsuarioResponseDTO atualizar(Long id, UsuarioEditDTO usuarioEditDTO) {
        Usuario usuarioAtualizado = repository.saveAndFlush(usuarioMapper.toEntity(usuarioEditDTO));
        return usuarioMapper.toResponse(usuarioAtualizado);
    }
}