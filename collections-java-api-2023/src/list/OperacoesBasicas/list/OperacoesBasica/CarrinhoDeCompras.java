package list.OperacoesBasica;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

	private List<Item> itensList;

	public CarrinhoDeCompras() {
		this.itensList = new ArrayList<>();
	}

	public void adicionarItem(String nome, double preco, int qtde) {
		itensList.add(new Item(nome, preco, qtde));
	}

	public void removerItem(String nome) {
		List<Item> itemParaRemover = new ArrayList<>();
		for (Item i : itensList) {
			if (i.getNome().equalsIgnoreCase(nome)) {
				itemParaRemover.add(i);
			}
		}
		itensList.removeAll(itemParaRemover);
	}

	public int calcularValorTotal() {
		double valorTotalCarrinho = 0.0;
		for (Item i : itensList) {
			valorTotalCarrinho += i.getPreco() * i.getQtde();
		}
		return (int) valorTotalCarrinho;
	}

	public void exibirItens() {
		for (Item i : itensList) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Item 1", 10.0, 2);
        carrinho.adicionarItem("Item 2", 20.0, 3);
        
        System.out.println("EXIBIR ITENS DO CARRINHO");
        carrinho.exibirItens();

        System.out.println("REMOVER INTNS DO CARRINHO");
        carrinho.removerItem("Item 1");
        
        System.out.println("EXIBIR ITENS DO CARRINHO DEPOIS DE REMOVER");
        carrinho.exibirItens();

        System.out.println("EXIBIR VALOR TOTAL DO CARRINHO");
        double valorTotal = carrinho.calcularValorTotal();
        System.out.println("Valor total do carrinho: " + valorTotal);

	}

}
