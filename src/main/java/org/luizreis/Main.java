package org.luizreis;

import org.luizreis.contratos.IServicoDeEntrega;
import org.luizreis.entidades.Produto;
import org.luizreis.implementacoes.CorreiosServico;
import org.luizreis.implementacoes.SedexServico;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        IServicoDeEntrega servicoDeEntrega1 = new CorreiosServico();
        Produto produto1 = new Produto("computador", 2000, servicoDeEntrega1);
        System.out.println("Preco produto no correios " + produto1.getPrecoFinal());

        IServicoDeEntrega servicoDeEntrega2 = new SedexServico();
        produto1.setServicoDeEntrega(servicoDeEntrega2);
        System.out.println("Preco produto no sedex " + produto1.getPrecoFinal());


    }
}