package com.company;

import java.math.BigDecimal;

public class TestesPedidos {

    public static void main(String [] args){
        String cliente = args[0];
        BigDecimal valorOrcamento = new BigDecimal(args[1]);
        int quantidadeItens = Integer.parseInt(args[2]);

        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
        GerarPedidoHandler handler = new GerarPedidoHandler(/*dependencias*/);
        gerador.executa(gerador);
    }
}
