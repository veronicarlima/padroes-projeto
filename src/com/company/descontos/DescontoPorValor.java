package com.company.descontos;

import com.company.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoPorValor extends Desconto{

    public DescontoPorValor(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orcamento){

        if(orcamento.getValor().compareTo(new BigDecimal("500")) > 0 ) {
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }
        return proximo.calcular(orcamento);
    }
}
