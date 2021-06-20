package com.example.padraobuilder.model;

import lombok.Data;

@Data
public class Casa {

    private int quantidadeParedes;
    private int quantidadePortas;
    private int quantidadeJanelas;
    private int quantidadeQuartos;
    private int quantidadeBanheiros;
    private int quantidadePisos;
    private boolean suite;
    private boolean escritorio;
    private boolean closet;
    private boolean despensa;
    private boolean lavanderia;
    private boolean garagem;
    private boolean telhado;
    private boolean laje;
    private boolean quintal;
    private boolean jardim;
    private boolean piscina;
    private boolean churrasqueira;
    private boolean cozinha;

     Casa(int quantidadeParedes, int quantidadePortas, int quantidadeJanelas, int quantidadeQuartos, int quantidadeBanheiros, int quantidadePisos, boolean suite, boolean escritorio, boolean closet, boolean despensa, boolean lavanderia, boolean garagem, boolean telhado, boolean laje, boolean quintal, boolean jardim, boolean piscina, boolean churrasqueira, boolean cozinha) {
        this.quantidadeParedes = quantidadeParedes;
        this.quantidadePortas = quantidadePortas;
        this.quantidadeJanelas = quantidadeJanelas;
        this.quantidadeQuartos = quantidadeQuartos;
        this.quantidadeBanheiros = quantidadeBanheiros;
        this.quantidadePisos = quantidadePisos;
        this.suite = suite;
        this.escritorio = escritorio;
        this.closet = closet;
        this.despensa = despensa;
        this.lavanderia = lavanderia;
        this.garagem = garagem;
        this.telhado = telhado;
        this.laje = laje;
        this.quintal = quintal;
        this.jardim = jardim;
        this.piscina = piscina;
        this.churrasqueira = churrasqueira;
        this.cozinha = cozinha;
    }

}
