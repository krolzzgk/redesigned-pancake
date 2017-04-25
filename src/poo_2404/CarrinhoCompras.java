/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_2404;

import java.util.ArrayList;

/**
 *
 * @author karolina.gkallajian
 */
public class CarrinhoCompras {

    private ArrayList<Produto> produtos;

    public CarrinhoCompras() {
        produtos = new ArrayList<>();
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }
    
    public void adicionar(Produto p){
        produtos.add(p);
    }

    public double getValorTotal() {
        double valor = 0.0;
        for (Produto produto : produtos) {
            valor += produto.getPreco();
        }
        return valor;
    }

}
