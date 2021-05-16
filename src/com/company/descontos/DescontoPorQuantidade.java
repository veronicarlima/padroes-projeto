package com.company.descontos;

import com.company.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoPorQuantidade extends Desconto {

    public DescontoPorQuantidade(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orcamento) {

       if (orcamento.getQuantidadedeItens() > 5) {
           return orcamento.getValor().multiply(new BigDecimal("0.1"));
       }
       return proximo.calcular(orcamento);
   }

}
