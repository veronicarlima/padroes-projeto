package com.company.orcamento.situacao;

import com.company.DomainException;
import com.company.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class SituacaoOrcamento {

    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento){
        return BigDecimal.ZERO;
    }

    public void aprovar(Orcamento orcamento){
        throw new DomainException("Orcamento nao pode ser aprovado");
    }

    public void reprovar(Orcamento orcamento){
        throw new DomainException("Orcamento nao pode ser reaprovado");
    }

    public void finalizar(Orcamento orcamento){
        throw new DomainException("Orcamento nao pode ser finalizado");
    }
}
