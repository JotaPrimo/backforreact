package com.backforreact.backforreact.web.controllers;

import com.backforreact.backforreact.domain.entities.Usuario;
import com.backforreact.backforreact.domain.services.PerfilService;
import com.backforreact.backforreact.domain.services.UsuarioService;
import com.backforreact.backforreact.web.dtos.perfil.PerfilCreateDTO;
import com.backforreact.backforreact.web.dtos.perfil.PerfilEditDTO;
import com.backforreact.backforreact.web.dtos.perfil.PerfilResponseDTO;
import com.backforreact.backforreact.web.dtos.usuario.UsuarioEditDTO;
import com.backforreact.backforreact.web.dtos.usuario.UsuarioResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PerfilController {
//    private final PerfilService service;
//
//    public PerfilController(PerfilService service) {
//        this.service = service;
//    }
//
//    @GetMapping
//    public ResponseEntity<List<PerfilResponseDTO>> listar() {
//        List<PerfilResponseDTO> responseDTOS = service.listar();
//        return ResponseEntity.ok(responseDTOS);
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<PerfilResponseDTO> buscarPorId(@PathVariable Long id) {
//        PerfilResponseDTO responseDTO = service.buscarOuFalhar(id);
//        return ResponseEntity.status(HttpStatus.OK).body(responseDTO);
//    }
//
//    @PostMapping
//    public ResponseEntity<PerfilResponseDTO> salvar(@RequestBody PerfilCreateDTO createDTO) {
//        PerfilResponseDTO responseDTO = service.salvar(createDTO);
//        return ResponseEntity.status(HttpStatus.CREATED).body(responseDTO);
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<PerfilResponseDTO> atualizar(@PathVariable Long id, @RequestBody PerfilEditDTO editDTO) {
//        PerfilResponseDTO responseDTO = service.atualizar(id, editDTO);
//        return ResponseEntity.status(HttpStatus.OK).body(responseDTO);
//    }
//
//    @DeleteMapping("/{id}")
//    public void deletar(@PathVariable Long id) {
//        service.deletar(id);
//    }
}