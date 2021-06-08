package com.company;

import com.company.orcamento.Orcamento;

import java.time.LocalDateTime;

public class GerarPedidoHandler {
    //com injecao de dependencias repository service
    public  void execute(GeraPedido dados){

        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(),dados.getQuantidadeItens());

        Pedido pedido = new Pedido(dados.getCliente(),
                LocalDateTime.now(), orcamento);

        System.out.println("Salvar no banco de dados");
        System.out.println("Enviar o email com dados do novo orcamento");

    }
}
