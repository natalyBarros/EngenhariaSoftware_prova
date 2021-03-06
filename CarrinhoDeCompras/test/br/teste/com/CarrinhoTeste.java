package br.teste.com;

import org.junit.Test;
import org.junit.Assert;
import br.carrinho.com.Carrinho;
import br.produto.com.Produto;

public class CarrinhoTeste {

    @Test
    public void criarCarrinhoVazioTest() {
        Carrinho car = new Carrinho(1);

        boolean vazio;
        vazio = car.carIsEmpty();

        Assert.assertTrue(vazio);
    }

    @Test
    public void adicionarUmProdutoNoCarrinhoTest() {
        Carrinho car = new Carrinho(1);

        Produto produto = new Produto("Coca-cola", 10, 15, "Bebida");

        car.adicionar(produto);

        int quantidade;

        quantidade = car.getQuantidadeDeItens();

        Assert.assertEquals(1, quantidade);
    }

    @Test
    public void removerProdutoCarrinhoFicaVazioTest() {
        Carrinho car = new Carrinho(1);

        Produto produto = new Produto("Coca-cola", 10, 15, "Bebida");
        
        car.adicionar(produto);
        car.remover(produto);

        boolean vazio;

        vazio = car.carIsEmpty();

        Assert.assertTrue(vazio);
    }
    @Test
    public void listarTest(){
        
         String x;
        Carrinho car = new Carrinho(1);

        Produto produto1 = new Produto("Coca-cola", 10, 3, "Bebida");
        Produto produto2 = new Produto("Panetone", 20, 10, "Comida");
        Produto produto3 = new Produto("50 tons de Cinza", 30, 35, "Livro");
        
        car.adicionar(produto1);
        car.adicionar(produto2);
        car.adicionar(produto3);
        
        x = car.listar();
       Assert.assertEquals("Coca-cola\nPanetone\n50 tons de Cinza\n", x);
    }
    public void adicionarDoisProdutosIguaisNoCarrinhoTest() {
        Carrinho car = new Carrinho(1);

        Produto produto = new Produto("Coca-cola", 10, 15, "Bebida");

        car.adicionar(produto);
        car.adicionar(produto);

        int quantidade;

        quantidade = car.getQuantidadeDeItens();

        Assert.assertEquals(2, quantidade);
    }
    public void TotalCarrinhoTest() {
        Carrinho car = new Carrinho(1);

        Produto produto = new Produto("Coca-cola", 10, 15, "Bebida");

        car.adicionar(produto);
        car.adicionar(produto);

        int total;

        total = car.getTotal();

        Assert.assertEquals(30, total);
    }
    public void QuantItensCarrinhoTest() {
        Carrinho car = new Carrinho(1);

        Produto produto1 = new Produto("Coca-cola", 10, 3, "Bebida");
        Produto produto2 = new Produto("Panetone", 20, 10, "Comida");
        Produto produto3 = new Produto("50 tons de Cinza", 30, 35, "Livro");
        
        car.adicionar(produto1);
        car.adicionar(produto2);
        car.adicionar(produto3);

        int total;

        total = car.getQuantidadeDeItens();

        Assert.assertEquals(3, total);
    }
    public void ListaPrecoDeCadaItemCarrinhoTest() {
        Carrinho car = new Carrinho(1);
        String x;
        
        Produto produto1 = new Produto("Coca-cola", 10, 3, "Bebida");
        Produto produto2 = new Produto("Panetone", 20, 10, "Comida");
        Produto produto3 = new Produto("50 tons de Cinza", 30, 35, "Livro");
        
        car.adicionar(produto1);
        car.adicionar(produto2);
        car.adicionar(produto2);
        car.adicionar(produto3);

        x = car.listarPrecoDeCadaItem();
       Assert.assertEquals("Coca-cola 3\nPanetone 20\n50 tons de Cinza 35\n", x);
    }
}
