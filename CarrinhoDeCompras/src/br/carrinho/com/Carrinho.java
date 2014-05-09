
package br.carrinho.com;

import br.item.com.Item;
import br.produto.com.Produto;

public class Carrinho 
{
    private int id_car;
    private int quantidadeDeItens;
    private Item[] item;
    private double total;
    public Carrinho()
    {
        quantidadeDeItens = 0;
    }
    
    public boolean isEmpty()
    {
        return quantidadeDeItens == 0;
    }   
    
    public void adicionar(Produto produto)
    {
       quantidadeDeItens++;         
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
