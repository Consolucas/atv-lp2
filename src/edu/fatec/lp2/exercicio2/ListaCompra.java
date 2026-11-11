package edu.fatec.lp2.exercicio2;

public class ListaCompra implements Calculavel {
    private ItemCompra[] itensCompras;

    public ListaCompra(int qtdeMax){
        this.itensCompras = new ItemCompra[qtdeMax];
    }

    public void incluir(ItemCompra item){
        for (int i =0; i<itensCompras.length;i++){
            if (itensCompras[i] == null){
                itensCompras[i] = item;
                return;
            }
        }
    }

    @Override
    public double calcularPreco(){
        double preco = 0.00;
        for (ItemCompra itemCompra : itensCompras){
            if (itemCompra!=null){
                preco+=itemCompra.calcularPreco();
            }
        }
        return preco;
    }
}
