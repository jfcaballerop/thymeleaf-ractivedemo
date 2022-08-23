package com.mrknight.tutorial.thymeleafreactivedemo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Producto {

    private int numero;
    private String concepto;
    private int importe;


}
