package Map.Pesquisa;

public class Produto {

	private String nome;
	private Double preco;
	private Integer qtde;
	
	public Produto(String nome, Double preco, Integer qtde) {
		this.nome = nome;
		this.preco = preco;
		this.qtde = qtde;
	}

	public String getNome() {
		return nome;
	}

	public Double getPreco() {
		return preco;
	}

	public Integer getQtde() {
		return qtde;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preco=" + preco + ", qtde=" + qtde + "]";
	} 
}
