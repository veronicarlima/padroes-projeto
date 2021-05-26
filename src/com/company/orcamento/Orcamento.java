package com.company.orcamento;

import com.company.orcamento.situacao.EmAnalise;
import com.company.orcamento.situacao.SituacaoOrcamento;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal valor;
    private int quantidadedeItens;
    private SituacaoOrcamento situacao;

    public Orcamento(BigDecimal valor) {
        this.valor = valor;
    }

    public Orcamento(int quantidadedeItens) {
        this.quantidadedeItens = quantidadedeItens;
    }

    public Orcamento(BigDecimal valor, int quantidadedeItens) {
        this.valor = valor;
        this.quantidadedeItens = quantidadedeItens;
        this.situacao = new EmAnalise();
    }

    public void aplicarDescontoExtra(){
        BigDecimal valorDoDescontoExtra = this.situacao.calcularValorDescontoExtra(this);
        this.valor = this.valor.subtract(valorDoDescontoExtra);
    }

    public void aprovar(){
        this.situacao.aprovar(this);
    }

    public void reprovar(){
        this.situacao.reprovar(this);
    }

    public void finalizar(){
        this.situacao.finalizar(this);
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

    public SituacaoOrcamento getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoOrcamento situacao) {
        this.situacao = situacao;
    }
}
