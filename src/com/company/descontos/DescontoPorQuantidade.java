package com.company.descontos;

import com.company.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoPorQuantidade {

   public BigDecimal calcular(Orcamento orcamento) {

       if (orcamento.getQuantidadedeItens() > 5) {
           return orcamento.getValor().multiply(new BigDecimal("0.1"));
       }
       return BigDecimal.ZERO;
   }

}
