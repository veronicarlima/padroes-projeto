package com.company.imposto;

import com.company.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {

   BigDecimal calcular(Orcamento orcamento);
}
