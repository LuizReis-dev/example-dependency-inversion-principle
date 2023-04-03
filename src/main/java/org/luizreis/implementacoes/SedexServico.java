package org.luizreis.implementacoes;

import org.luizreis.contratos.IServicoDeEntrega;

public class SedexServico implements IServicoDeEntrega {
    @Override
    public double calcularFrete(double preco) {
        return preco * 1.08;
    }
}
