package com.backforreact.backforreact.infra;

import com.backforreact.backforreact.domain.entities.Perfil;
import com.backforreact.backforreact.domain.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerfilRepository extends JpaRepository<Perfil, Long> {
}