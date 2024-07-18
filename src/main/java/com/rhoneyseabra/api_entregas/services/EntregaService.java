package com.rhoneyseabra.api_entregas.services;

import com.rhoneyseabra.api_entregas.entities.Entrega;
import com.rhoneyseabra.api_entregas.repositorio.EntregaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntregaService {

    @Autowired
    private EntregaRepositorio entregaRepositorio;

    public List<Entrega> findAll(){
        return entregaRepositorio.findAll();
    }

    public Entrega save(Entrega entrega){
        return entregaRepositorio.save(entrega);
    }


}
