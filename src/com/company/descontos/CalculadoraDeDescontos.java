package com.company.descontos;

import com.company.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    public BigDecimal calcular(Orcamento orcamento){

     Desconto desconto = new DescontoPorQuantidade(
             new DescontoPorValor(
                     new SemDesconto()));

        return desconto.calcular(orcamento);
    }
}
