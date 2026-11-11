package edu.fatec.lp2.exercicio2;

public class Main {
    public static void main(String[] args) {
        //ItemCompra itemCompra = new ItemCompra();
        //System.out.println(itemCompra.calcularPreco());
        Supermercado carrefour = new Supermercado();
        Produto leite = new Produto("leite", 6.0, 0.25, carrefour);
        System.out.println(leite.getPreco());

        Produto chocolate = new Produto("chocolate", 5.0, 0.0, carrefour);

        ItemCompra itemCompra = new ItemCompra(leite, 2, 0.25);
        ItemCompra itemCompra1 = new ItemCompra(chocolate, 1, 0.00);
        System.out.println(itemCompra.calcularPreco());

        ListaCompra listaCompra = new ListaCompra(2);

        listaCompra.incluir(itemCompra);
        listaCompra.incluir(itemCompra1);
        System.out.println(listaCompra.calcularPreco());



    }
}
