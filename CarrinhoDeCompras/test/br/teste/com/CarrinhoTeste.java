package br.teste.com;

import org.junit.Test;
import org.junit.Assert;
import br.carrinho.com.Carrinho;
import br.produto.com.Produto;


public class CarrinhoTeste 
{    
    @Test
    public void criarCarrinhoVazioTest()
    {
        Carrinho car = new Carrinho();

        boolean vazio;
        vazio = car.carIsEmpty();

        Assert.assertTrue(vazio);
    }   
    
    @Test
    public void adicionarUmProdutoNoCarrinhoTest()
    {
        Carrinho car = new Carrinho();
        
        Produto produto = new Produto("Coca-cola", 10 , 15);
        
        car.adicionar(produto);
        
        int quantidade;
        
        quantidade = car.getQuantidadeDeItens();
        
        Assert.assertEquals(quantidade, 1);
    }
    
    public void removerProdutoCarrinhoFicaVazioTest()
    {
        Carrinho car = new Carrinho();
        
        Produto produto = new Produto("Coca-cola", 10 , 15);
        
        car.remover(produto);
        
        boolean vazio;
        
        vazio = car.isEmpty();
        
        Assert.assertTrue(vazio);
    }
}
