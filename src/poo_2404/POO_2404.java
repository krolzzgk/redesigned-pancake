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
public class POO_2404 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Produto p1 = new Produto(10);
        Produto p2 = new Produto(30);
        Produto p3 = new Produto(50);
        
        Usuario u1 = new Usuario();
        u1.getCarrinho().adicionar(p1);
        u1.getCarrinho().adicionar(p2);
        u1.getCarrinho().adicionar(p3);
        
        System.out.println("Valor total: " + u1.getCarrinho().getValorTotal());
        
    }
    
}
