
package br.carrinho.com;

import br.item.com.Item;
import br.produto.com.Produto;
import javax.swing.JOptionPane;

public class Carrinho 
{
    private int id_car;
    private Item[] item;
    private double total;
    
    
    public Carrinho()
    {
       item[0] = new Item();
       
       
    }
    
    public boolean isEmpty(Produto p)
           {
        boolean col = false;
                 
        for(int i = 0 ; i<item.length; i++)
        {
            if(item[i].getProduto()== p)
            {
              col = true ;
            }
            
            else 
              col = false ;
        
        }
        
        return col ;
    }   
    
    public void adicionar(Produto p)
    {    
        int quant;
 
        if(isEmpty(p))
        
             JOptionPane.showInputDialog("Digite uma quantidade de Itens", quant);
            
        item[0] = new Item(5, p ,quant);
            
        else{
     for(int i = 0 ; i<item.length; i++)
        {
            if(item[i].setProduto() == p)
            {
              
            }
        
                }
     
    }
    
    public int getQuantidadeDeItens()
    {
        return quantidadeDeItens;
    }
    
    public void remover(Produto produto)
    {
        quantidadeDeItens--;
    }
    
}
