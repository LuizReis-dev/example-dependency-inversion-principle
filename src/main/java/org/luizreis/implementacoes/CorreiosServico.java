package org.luizreis.implementacoes;

import org.luizreis.contratos.IServicoDeEntrega;

import java.util.Date;

public class CorreiosServico implements IServicoDeEntrega {
    @Override
    public double calcularFrete(double preco) {
        return preco * 1.05;
    }
}
