package edu.fatec.lp2.exercicio2;

public class Produto {
    private  String nome;
    private double preco;
    private double descontoMaximo;
    private Supermercado supermercado;

    public Produto(String nome, double preco, double descontoMaximo, Supermercado supermercado) {
        this.nome = nome;
        this.preco = preco;
        this.descontoMaximo = descontoMaximo;
        this.supermercado = supermercado;
    }

    public double getPreco(){
        return this.preco;
    }

    public double getDescontoMaximo() {
        return this.descontoMaximo;
    }
}
