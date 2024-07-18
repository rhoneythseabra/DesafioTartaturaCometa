package com.rhoneyseabra.api_entregas.repositorio;


import com.rhoneyseabra.api_entregas.entities.Destinatario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DestinatarioRepositorio extends JpaRepository<Destinatario, Long> {
}
