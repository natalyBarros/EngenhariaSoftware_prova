package br.item.com;

import br.produto.com.Produto;
import javax.swing.JOptionPane;

public class Item {

    private int id_Item;
    private Produto produto;
    private double total;
    private int quantidade;

    public Item(int id_Item, Produto produto, int quantidade) {
        this.id_Item = id_Item;
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Item() {

    }

    public int getId_Item() {
        return id_Item;
    }

    public void setId_Item(int id_Item) {
        this.id_Item = id_Item;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void addProd() {
        int quant = 1;

        JOptionPane.showInputDialog("Digite uma quantidade de Produtos", quant);

        quantidade += quant;
        total = quantidade * produto.getPreco();

    }

    public void removeProd() {
        

     
        
        quantidade -= 1;

    }

}
