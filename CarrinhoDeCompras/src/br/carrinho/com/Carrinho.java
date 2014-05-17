package br.carrinho.com;

import br.item.com.Item;
import br.produto.com.Produto;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Carrinho {

    private int id_car;
    private ArrayList<Item> item;
    private double total;

    public Carrinho(int i) {
        id_car = i;
        item = new ArrayList();
        total = 0;

    }

    public boolean verifica(Produto p) {
        boolean col = false;

        for (int i = 0; i < item.size(); i++) {
            if (item.get(i).getProduto() == p) {
                col = true;
            } else {
                col = false;
            }

        }

        return col;
    }

    public boolean carIsEmpty() {
        return item.isEmpty();
    }

    public int localizar(Produto p) {
        int i;

        for (i = 0; i < item.size(); i++) {
            if (item.get(i).getProduto() == p) {
                return i;

            }

        }
        return i;
    }

    public void adicionar(Produto p) {

        if (carIsEmpty()) {

            item.add(new Item(1, p, 1));
        } else if (verifica(p)) {
            int pop;
            pop = localizar(p);
            
            item.set(pop, new Item(pop, p, 1));
            
        } else {
            int pop;
            pop = localizar(p);
            item.add(new Item(pop+1, p, 1));
            

        }
    }

    public int getQuantidadeDeItens() {
        int i, x = 0;

        for (i = 0; i < item.size(); i++) {
            x += item.get(i).getQuantidade();
        }
        return x;
    }

    public int getTotal() {
        int i, x = 0;

        for (i = 0; i < item.size(); i++) {
            x += item.get(i).getTotal();
        }
        return x;
    }

    public void remover(Produto p) {

        if (carIsEmpty()) {
            JOptionPane.showMessageDialog(null, "O carrinho esta Vazio");
        } else if (verifica(p)) {
            int pop;
            pop = localizar(p);
            item.get(pop).removeProd();
            if(item.get(pop).getQuantidade()==0)
                item.remove(pop);

        } else {
            JOptionPane.showMessageDialog(null, "O carrinho não possui este produto");

        }
    }

    public int getId_car() {
        return id_car;
    }

    public void setId_car(int id_car) {
        this.id_car = id_car;
    }

    public ArrayList<Item> getItem() {
        return item;
    }

    public void setItem(ArrayList<Item> item) {
        this.item = item;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    public String listar()
    {
        String x="";
         for (int i = 0; i < item.size(); i++) {
            x += item.get(i).getProduto().getNome()+"\n"; 
        }
        
         return x;
    }
    public String listarPrecoDeCadaItem()
    {
        String x="";
         for (int i = 0; i < item.size(); i++) {
            x += item.get(i).getProduto().getNome()+" "+item.get(i).getTotal()+"\n"; 
        }
        
         return x;
    }

}
