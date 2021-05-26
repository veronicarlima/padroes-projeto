package com.company.orcamento.situacao;

import com.company.orcamento.Orcamento;

import java.math.BigDecimal;

public class EmAnalise extends SituacaoOrcamento {

    public BigDecimal calcularValorDescontroExtra(Orcamento orcamento){
        return  orcamento.getValor().multiply(new BigDecimal("0.05"));
    }

    public void aprovar(Orcamento orcamento){
        orcamento.setSituacao(new Aprovado());
    }

    public void reaprovar(Orcamento orcamento){
        orcamento.setSituacao(new Reprovado());
    }
}
