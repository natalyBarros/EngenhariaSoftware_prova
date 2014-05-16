
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
         
       
    }
    
    public boolean verifica(Produto p)
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
    
     public boolean carIsEmpty()
           {
        boolean col ;
        
       
          if (item.length == 0) 
                 
              col = true ;           
            else 
              col = false ;
               
        return col ;
    }   
    
    
     public int localizar(Produto p)
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
        
        if(carIsEmpty()){
            
            item [0]= new Item(1, p ,1);
                    }
        else    
        if(verifica(p)){
            int pop;
            pop = localizar(p);
           item [pop].addProd(); 
             
        }
        else {
            int pop;
            pop = localizar(p);
           
            item [pop]= new Item(pop, p ,1);
              
        }
    }
 
  public int getQuantidadeDeItens(){
      int i ,x=0;
  
      for(i = 0 ; i<item.length; i++)
        {
            x+=item[i].getQuantidade();
        }
        return x;
  }
  
  public int getTotal(){
      int i ,x=0;
  
      for(i = 0 ; i<item.length; i++)
        {
            x+=item[i].getTotal();
        }
        return x;
  }
    public void remover(Produto p)
    {    
        
        
        if(carIsEmpty())
           JOptionPane.showInputDialog("O carrinho esta Vazio");
        else    
        if(verifica(p)){
            int pop;
            pop = localizar(p);
           item [pop].removeProd(); 
             
        }
        else {
            JOptionPane.showInputDialog("O carrinho não possui este produto");
              
        }
    }
}
