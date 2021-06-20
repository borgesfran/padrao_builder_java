package com.example.padraobuilder.model.builder;

public interface Builder {

    Builder quantidadeParedes(int quantidadeParedes);

    Builder quantidadePortas(int quantidadePortas);

    Builder quantidadeJanelas(int quantidadeJanelas);

    Builder quantidadeQuartos(int quantidadeQuartos);

    Builder quantidadeBanheiros(int quantidadeBanheiros);

    Builder quantidadePisos(int quantidadePisos);

    Builder  suite(boolean suite);

    Builder  escritorio(boolean escritorio);

    Builder  closet(boolean closet);

    Builder  despensa(boolean despensa);

    Builder  lavanderia(boolean lavanderia);

    Builder  garagem(boolean garagem);

    Builder  telhado(boolean telhado);

    Builder  laje(boolean laje);

    Builder  quintal(boolean quintal);

    Builder  jardim(boolean jardim);

    Builder  piscina(boolean piscina);

    Builder  churrasqueira(boolean churrasqueira);

    Builder  cozinha(boolean cozinha);

}
