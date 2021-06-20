package com.example.padraobuilder.model;

import com.example.padraobuilder.model.Casa;
import com.example.padraobuilder.model.builder.Builder;

public class CasaComGaragemBuilder implements Builder {

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

    @Override
    public Builder quantidadeParedes(int quantidadeParedes) {
        this.quantidadeParedes= quantidadeParedes;
        return this;
    }

    @Override
    public Builder quantidadePortas(int quantidadePortas) {
        this.quantidadePortas= quantidadePortas;
        return this;
    }

    @Override
    public Builder quantidadeJanelas(int quantidadeJanelas) {
        this.quantidadeJanelas= quantidadeJanelas;
        return this;
    }

    @Override
    public Builder quantidadeQuartos(int quantidadeQuartos ){
        this.quantidadeQuartos= quantidadeQuartos;
        return this;
    }

    @Override
    public Builder quantidadeBanheiros(int quantidadeBanheiros) {
        this.quantidadeBanheiros= quantidadeBanheiros;
        return this;
    }

    @Override
    public Builder quantidadePisos(int quantidadePisos) {
        this.quantidadePisos= quantidadePisos;
        return this;
    }

    @Override
    public Builder suite(boolean suite ){
        this.suite= suite;
        return this;
    }

    @Override
    public Builder escritorio(boolean escritorio) {
        this.escritorio= escritorio;
        return this;
    }

    @Override
    public Builder closet(boolean closet ){
        this.closet= closet;
        return this;
    }

    @Override
    public Builder despensa(boolean despensa ){
        this.despensa= despensa;
        return this;
    }

    @Override
    public Builder lavanderia(boolean lavanderia ){
        this.lavanderia= lavanderia;
        return this;
    }

    @Override
    public Builder garagem(boolean garagem){
        this.garagem= garagem;
        return this;
    }

    @Override
    public Builder telhado(boolean telhado){
        this.telhado= telhado;
        return this;
    }

    @Override
    public Builder laje(boolean laje){
        this.laje= laje;
        return this;
    }

    @Override
    public Builder quintal(boolean quintal){
        this.quintal= quintal;
        return this;
    }

    @Override
    public Builder jardim(boolean jardim){
        this.jardim= jardim;
        return this;
    }

    @Override
    public Builder piscina(boolean piscina){
        this.piscina= piscina;
        return this;
    }

    @Override
    public Builder churrasqueira(boolean churrasqueira) {
        this.churrasqueira= churrasqueira;
        return this;
    }

    @Override
    public Builder cozinha(boolean cozinha){
        this.cozinha= cozinha;
        return this;
    }

    public Casa getResult() {
        return new Casa(quantidadeParedes,quantidadePortas,quantidadeJanelas,quantidadeQuartos,quantidadeBanheiros,quantidadePisos,suite,escritorio,closet,despensa,lavanderia,garagem,telhado,laje,quintal,jardim,piscina,churrasqueira,cozinha);
    }
}
