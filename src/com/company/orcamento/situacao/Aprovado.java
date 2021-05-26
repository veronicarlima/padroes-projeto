package com.company.orcamento.situacao;

import com.company.orcamento.Orcamento;

import java.math.BigDecimal;

public class Aprovado extends SituacaoOrcamento {

    public BigDecimal calcularValorExtra(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.02"));

    }

    public void finalizar(Orcamento orcamento){
        orcamento.setSituacao(new Finalizado());
    }


}
