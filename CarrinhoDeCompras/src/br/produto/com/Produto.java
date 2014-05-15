package br.produto.com;

public class Produto 
{
    private String nome;
    private int id_prod;
    private double preco;
    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId_prod() {
        return id_prod;
    }

    public void setId_prod(int id_prod) {
        this.id_prod = id_prod;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Produto(String nome, int id_prod, double preco) {
        this.nome = nome;
        this.id_prod = id_prod;
        this.preco = preco;
    }
    
    
    
    
    
    
}
   