package edu.fatec.lp2.exercicio2;

public class ItemCompra implements Calculavel{
    private  Produto produto;
    private int quantidade;
    private  double desconto;

    public  ItemCompra(Produto produto, int quantidade, double desconto){
        this.produto = produto;
        this.quantidade = quantidade;
        if (desconto<0.00 || desconto>produto.getDescontoMaximo()){
        throw new IllegalArgumentException("Desconto fora do limite");
        } else
            this.desconto = desconto;
    }

    @Override
    public double calcularPreco(){
        double preco = produto.getPreco();
        return (preco*this.quantidade*(1-desconto));
    }
}
