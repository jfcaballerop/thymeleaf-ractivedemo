package com.mrknight.tutorial.thymeleafreactivedemo.controller;

import com.mrknight.tutorial.thymeleafreactivedemo.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.spring5.context.webflux.IReactiveDataDriverContextVariable;
import org.thymeleaf.spring5.context.webflux.ReactiveDataDriverContextVariable;

@Controller
public class ReactiveController {

    @Autowired
    private ProductoRepository repository;

    @RequestMapping("/lista")
    public String lista(final Model modelo) {
        IReactiveDataDriverContextVariable listaReactiva = new ReactiveDataDriverContextVariable(repository.buscarTodos(),1);

        modelo.addAttribute("listaProductos", listaReactiva);

        return "lista";
    }
}
