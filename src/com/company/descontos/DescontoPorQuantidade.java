package com.company.descontos;

import com.company.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoPorQuantidade extends Desconto {

    public DescontoPorQuantidade(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento) {
       return orcamento.getValor().multiply(new BigDecimal("0.1"));
   }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getQuantidadedeItens() > 5;
    }

}
