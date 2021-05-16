package com.company;

import com.company.descontos.CalculadoraDeDescontos;
import com.company.imposto.CalculadoraDeImpostos;
import com.company.imposto.ICMS;
import com.company.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteDescontos {

    public static void main(String[] args){

        Orcamento orcamentoPrimeiro = new Orcamento(new BigDecimal("100"), 4);
        Orcamento orcamentoSegundo = new Orcamento(new BigDecimal("1000"),1);

        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();

        System.out.println(calculadora.calcular(orcamentoPrimeiro));
        System.out.println(calculadora.calcular(orcamentoSegundo));
    }
}
