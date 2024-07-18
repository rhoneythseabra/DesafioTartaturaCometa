package com.rhoneyseabra.api_entregas.controller;

import com.rhoneyseabra.api_entregas.entities.Entrega;
import com.rhoneyseabra.api_entregas.services.EntregaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/entregas")
public class EntregaController {

    @Autowired
    private EntregaService entregaService;

    @GetMapping
    public String list(Model model){
        model.addAttribute("entregas", entregaService.findAll());
        return "entregas/list";
    }

    @GetMapping("/new")
    public String createForm(Model model){
        model.addAttribute("entrega", new Entrega());
        return "entregas/create";
    }

    @PostMapping
    public String create(Entrega entrega){
        entregaService.save(entrega);
        return "redirect:/entregas";
    }

}
