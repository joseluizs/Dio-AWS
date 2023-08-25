package list.OperacoesBasica;

public class Item {

	private String nome;
	private double preco;
	private int qtde;
	
	public Item(String nome, double preco, int qtde) {
		this.nome = nome;
		this.preco = preco;
		this.qtde = qtde;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public int getQtde() {
		return qtde;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void setQtde(int qtde) {
		this.qtde = qtde;
	}

	@Override
	public String toString() {
		return "Item [nome=" + nome + ", preco=" + preco + ", qtde=" + qtde + "]";
	}
	
	
	
	
}
