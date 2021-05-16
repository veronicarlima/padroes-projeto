package com.company.orcamento;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal valor;
    private int quantidadedeItens;


    public Orcamento(BigDecimal valor) {
        this.valor = valor;
    }

    public Orcamento(int quantidadedeItens) {
        this.quantidadedeItens = quantidadedeItens;
    }

    public Orcamento(BigDecimal valor, int quantidadedeItens) {
        this.valor = valor;
        this.quantidadedeItens = quantidadedeItens;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public int getQuantidadedeItens() {
        return quantidadedeItens;
    }

    public void setQuantidadedeItens(int quantidadedeItens) {
        this.quantidadedeItens = quantidadedeItens;
    }
}
