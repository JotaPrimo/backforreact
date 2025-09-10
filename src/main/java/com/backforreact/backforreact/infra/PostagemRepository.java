package com.backforreact.backforreact.infra;

import com.backforreact.backforreact.domain.entities.Postagem;
import com.backforreact.backforreact.domain.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> {
}