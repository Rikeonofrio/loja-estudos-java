package br.com.rike.loja.imposto;

import br.com.rike.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class ISS  implements  Imposto{
    public BigDecimal calcular(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.6"));

    }
}