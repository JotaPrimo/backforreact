package com.backforreact.backforreact.web.controllers;

import com.backforreact.backforreact.domain.services.PostagemService;
import com.backforreact.backforreact.web.dtos.postagem.PostagemCreateDTO;
import com.backforreact.backforreact.web.dtos.postagem.PostagemEditDTO;
import com.backforreact.backforreact.web.dtos.postagem.PostagemResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostagemController {
//    private final PostagemService service;
//
//    public PostagemController(PostagemService service) {
//        this.service = service;
//    }
//
//    @GetMapping
//    public ResponseEntity<List<PostagemResponseDTO>> listar() {
//        List<PostagemResponseDTO> responseDTOS = service.listar();
//        return ResponseEntity.ok(responseDTOS);
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<PostagemResponseDTO> buscarPorId(@PathVariable Long id) {
//        PostagemResponseDTO responseDTO = service.buscarOuFalhar(id);
//        return ResponseEntity.status(HttpStatus.OK).body(responseDTO);
//    }
//
//    @PostMapping
//    public ResponseEntity<PostagemResponseDTO> salvar(@RequestBody PostagemCreateDTO createDTO) {
//        PostagemResponseDTO responseDTO = service.salvar(createDTO);
//        return ResponseEntity.status(HttpStatus.CREATED).body(responseDTO);
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<PostagemResponseDTO> atualizar(@PathVariable Long id, @RequestBody PostagemEditDTO editDTO) {
//        PostagemResponseDTO responseDTO = service.atualizar(id, editDTO);
//        return ResponseEntity.status(HttpStatus.OK).body(responseDTO);
//    }
//
//    @DeleteMapping("/{id}")
//    public void deletar(@PathVariable Long id) {
//        service.deletar(id);
//    }
}