package Map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
	
	private Map<Long, Produto> estoqueProdutosMap;

	public EstoqueProdutos() {
		this.estoqueProdutosMap = new HashMap<>();
	}
	
	public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
		estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
	}
	
	public void exibirProdutos() {
		System.out.println(estoqueProdutosMap);
	}
	
	public double calcularValorTotalEstoque() {
		double valorTotalEstoque = 0d;
		if (!estoqueProdutosMap.isEmpty()) {
			for (Produto p : estoqueProdutosMap.values()) {
				valorTotalEstoque += p.getPreco() * p.getQtde();
				
			}
		}
		return valorTotalEstoque;
	}
	
	public Produto obterProdutoMaisCaro() {
		Produto produtoMaisCaro = null;
		double maiorPreco = Double.MIN_VALUE;
		if (!estoqueProdutosMap.isEmpty()) {
			for (Produto p : estoqueProdutosMap.values()) {
				if (p.getPreco() > maiorPreco) {
					produtoMaisCaro = p;
				}
			}
		}
		return produtoMaisCaro;		
	}
	
	public Produto obterProdutoMaisBarato(){
		Produto produtoMaisBarato = null;
		double menorPreco = Double.MAX_VALUE;
		if (!estoqueProdutosMap.isEmpty()) {
			for (Produto p : estoqueProdutosMap.values()) {
				if (p.getPreco() < menorPreco ) {
					produtoMaisBarato = p;
					menorPreco = p.getPreco();
				}
			}
		}
		return produtoMaisBarato;
		
	}
	
	// Método que retorna o produto com maior quantidade multiplicada pelo valor total no estoque
	public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
	    // Variável para armazenar o produto com maior quantidade * valor total
	    Produto produtoMaiorQuantidadeValorNoEstoque = null;
	    // Variável para armazenar o maior valor total encontrado
	    double maiorValorTotalProdutoEstoque = 0d;

	    // Verifica se o estoque não está vazio
	    if (!estoqueProdutosMap.isEmpty()) {
	        // Loop pelos itens do estoque
	        for (Map.Entry<Long, Produto> entry : estoqueProdutosMap.entrySet()) {
	            // Calcula o valor total do produto em estoque
	            double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQtde();

	            // Verifica se o valor total é maior que o maior valor total encontrado até agora
	            if (valorProdutoEmEstoque > maiorValorTotalProdutoEstoque) {
	                // Atualiza o maior valor total e o produto correspondente
	                maiorValorTotalProdutoEstoque = valorProdutoEmEstoque;
	                produtoMaiorQuantidadeValorNoEstoque = entry.getValue();
	            }
	        }
	    }
	    // Retorna o produto com maior quantidade * valor total
	    return produtoMaiorQuantidadeValorNoEstoque;
	}
	/*
	 * 
	 * public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() { Produto
	 * maiorQtdeValorTotal = null; double maiorQtde = Double.MAX_VALUE; double
	 * maiorPreco = Double.MAX_VALUE; if (!estoqueProdutosMap.isEmpty()) { for
	 * (Produto p : estoqueProdutosMap.values()) { if (p.getPreco() > maiorPreco &&
	 * p.getQtde() > maiorQtde) { maiorQtdeValorTotal = p; } } } return
	 * maiorQtdeValorTotal;
	 * 
	 * }
	 */
	
	public static void main(String[] args) {
		EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
		
		estoqueProdutos.adicionarProduto(1L, "PRODUTO A", 10, 5.0);
		estoqueProdutos.adicionarProduto(2L, "PRODUTO B", 5, 10.0);
		estoqueProdutos.adicionarProduto(3L, "PRODUTO C", 2, 15.0);
		
		estoqueProdutos.exibirProdutos();


		System.out.println("VALOR TOTAL EM ESTOQUE: R$" +estoqueProdutos.calcularValorTotalEstoque() );
		System.out.println("PRODUTO MAIS CARO: R$" + estoqueProdutos.obterProdutoMaisCaro());
		System.out.println("PRODUTO MAIS BARATO: R$" + estoqueProdutos.obterProdutoMaisBarato());
		System.out.println("PRODUTO MAIS QTDE E MAIOR VALOR: " + estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
	}

}
