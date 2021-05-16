package com.company.descontos;

import com.company.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    public BigDecimal calcular(Orcamento orcamento){

       BigDecimal desconto = new DescontoPorQuantidade().calcular(orcamento);

       if( desconto == BigDecimal.ZERO) {

           desconto = new DescontoPorValor().calcular(orcamento);
       }

        return BigDecimal.ZERO;
    }
}
