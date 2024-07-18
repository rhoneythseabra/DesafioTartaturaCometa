package com.rhoneyseabra.api_entregas.repositorio;


import com.rhoneyseabra.api_entregas.entities.Entrega;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EntregaRepositorio extends JpaRepository<Entrega, Long> {
}
