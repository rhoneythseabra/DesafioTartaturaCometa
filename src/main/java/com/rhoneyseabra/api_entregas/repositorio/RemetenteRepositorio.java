package com.rhoneyseabra.api_entregas.repositorio;


import com.rhoneyseabra.api_entregas.entities.Remetente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RemetenteRepositorio extends JpaRepository<Remetente, Long> {
}
