package com.example.padraobuilder.model.builder;

import lombok.Data;

@Data
public class Diretor {

    public void construirCasaComGaragem(Builder builder){
        builder.quantidadePisos(1);
        builder.quantidadeParedes(4);
        builder.quantidadeQuartos(2);
        builder.quantidadePortas(6);
        builder.quantidadeBanheiros(1);
        builder.quantidadeJanelas(4);
        builder.cozinha(true);
        builder.quintal(true);
        builder.telhado(true);
        builder.garagem(true);
    }
}
