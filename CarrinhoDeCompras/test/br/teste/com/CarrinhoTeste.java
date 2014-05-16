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

        Assert.assertEquals(quantidade, 1);
    }

    @Test
    public void removerProdutoCarrinhoFicaVazioTest() {
        Carrinho car = new Carrinho(1);

        Produto produto = new Produto("Coca-cola", 10, 15, "Bebida");

        car.remover(produto);

        boolean vazio;

        vazio = car.carIsEmpty();

        Assert.assertTrue(vazio);
    }
}
