package com.rhoneyseabra.api_entregas.repositorio;

import com.rhoneyseabra.api_entregas.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepositorio extends JpaRepository<Produto, Long> {
}
