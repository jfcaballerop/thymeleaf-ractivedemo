package com.mrknight.tutorial.thymeleafreactivedemo.services;

import com.mrknight.tutorial.thymeleafreactivedemo.entity.Producto;
import com.mrknight.tutorial.thymeleafreactivedemo.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class ProductoService {

    @Autowired
    ProductoRepository repository;

    public Flux<Producto> buscarTodos(){
        Flux<Producto> flujo1 = repository.buscarTodos();
        Flux<Producto> flujo2 = repository.buscarOtros();

        return Flux.merge(flujo1, flujo2);

    }
}
