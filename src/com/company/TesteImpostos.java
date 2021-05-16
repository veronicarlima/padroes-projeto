package com.company;

import com.company.imposto.CalculadoraDeImpostos;
import com.company.imposto.ICMS;
import com.company.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteImpostos {

    public static void main(String[] args){
        Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        System.out.println(calculadora.calcular(orcamento, new ICMS()));
    }
}
