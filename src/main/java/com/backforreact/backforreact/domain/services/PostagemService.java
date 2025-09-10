package com.backforreact.backforreact.domain.services;

import com.backforreact.backforreact.domain.entities.Postagem;
import com.backforreact.backforreact.domain.mappers.PostagemMapper;
import com.backforreact.backforreact.infra.PostagemRepository;
import com.backforreact.backforreact.web.dtos.postagem.PostagemCreateDTO;
import com.backforreact.backforreact.web.dtos.postagem.PostagemEditDTO;
import com.backforreact.backforreact.web.dtos.postagem.PostagemResponseDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostagemService {

//    private final PostagemRepository repository;
//    private final PostagemMapper postagemMapper;
//
//    public PostagemService(PostagemRepository repository, PostagemMapper mapper) {
//        this.repository = repository;
//        this.postagemMapper = mapper;
//    }
//
//    public List<PostagemResponseDTO> listar() {
//        return repository.findAll().stream().map(postagemMapper::toResponse).toList();
//    }
//
//    public PostagemResponseDTO buscarOuFalhar(Long id) {
//        Postagem usuario = repository.findById(id).orElseThrow(() -> new RuntimeException("Postagem não encontrada"));
//        return postagemMapper.toResponse(usuario);
//    }
//
//    public PostagemResponseDTO salvar(PostagemCreateDTO postagemCreateDTO) {
//        Postagem postagem = postagemMapper.toEntity(postagemCreateDTO);
//        return postagemMapper.toResponse(repository.save(postagem));
//    }
//
//    public void deletar(Long id) {
//        repository.deleteById(id);
//    }
//
//    public PostagemResponseDTO atualizar(Long id, PostagemEditDTO postagemEditDTO) {
//        Postagem postagemAtualizado = repository.saveAndFlush(postagemMapper.toEntity(postagemEditDTO));
//        return postagemMapper.toResponse(postagemAtualizado);
//    }
}