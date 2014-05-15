
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
    
     public boolean carIsEmpty(Produto p)
           {
        boolean col = false;
        
       
          if (item.length == 0) 
                 
              col = true ;
           
            
            else 
              col = false ;
        
       
        return col ;
    }   
    
    
     public int verificar(Produto p)
           {
        int i;
        
        for(i = 0 ; i<item.length; i++)
        {
            if(item[i].getProduto()== p)
            {
             return i;

        }
        
        }
        return i;
        }
    
    public void adicionar(Produto p)
    {    
        int quant = 0;
 
        if(isEmpty(p)){
            int pop;
            pop = verificar(p);
           item [pop].addProd(); 
             
        }
        
        else {
         int pop;
            pop = verificar(p);
            JOptionPane.showInputDialog("Digite uma quantidade de Itens", quant);
            item [pop]= new Item(5, p ,quant);
        
           
        }
    }
 
    
}
