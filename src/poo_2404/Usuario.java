/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_2404;

/**
 *
 * @author karolina.gkallajian
 */
public class Usuario {
    
    private CarrinhoCompras carrinho;

    public Usuario() {
        carrinho = new CarrinhoCompras();
    }
    
    public CarrinhoCompras getCarrinho(){
        return carrinho;
    }    
    
}
