package org.luizreis.entidades;

import org.luizreis.contratos.IServicoDeEntrega;

import java.util.Date;

public class Produto {
    
    private String nome;
    private double preco;
    private double precoFinal;
    private IServicoDeEntrega servicoDeEntrega;

    public Produto(String nome, double preco, IServicoDeEntrega servicoDeEntrega) {
        this.nome = nome;
        this.preco = preco;
        this.servicoDeEntrega = servicoDeEntrega;
        this.precoFinal = this.servicoDeEntrega.calcularFrete(this.preco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    public IServicoDeEntrega getServicoDeEntrega() {
        return servicoDeEntrega;
    }

    public void setServicoDeEntrega(IServicoDeEntrega servicoDeEntrega) {
        this.servicoDeEntrega = servicoDeEntrega;
    }

    public double getPrecoFinal() {
        return this.servicoDeEntrega.calcularFrete(preco);
    }

    public void setPrecoFinal(double precoFinal) {
        this.precoFinal = precoFinal;
    }
}
