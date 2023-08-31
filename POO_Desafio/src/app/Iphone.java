package app;

public class Iphone implements AparelhoTelefônico, NavegadorNaInternet, ReprodutorMusical {
	
	private String modelo;

	public Iphone(String modelo) {
		this.modelo = modelo;
	}

	public void tocar() {
		System.out.println("Tocando música");
	}

	public void pausar() {
		System.out.println("Pausando música");
	}

	public void selecionarMusica() {
		System.out.println("Selecionando música");
	}

	public void ligar() {
		System.out.println("Ligando para");
	}

	public void atender() {
		System.out.println("Atendendo chamada");
	}

	public void iniciarCorreiroVoz() {
		System.out.println("Iniciando correio de voz");
	}

	public void exibirPagina() {
		System.out.println("Exibindo página");
	}

	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba");
	}

	public void atualizarPagina() {
		System.out.println("Atualizando página");
	}
	
	public static void main(String[] args) {
		Iphone iphone = new Iphone("iPhone 2G");
		
		System.out.println("Modelo do telefone: " + iphone.modelo);
		iphone.adicionarNovaAba();
		iphone.tocar();
		iphone.pausar();
		iphone.selecionarMusica();
		iphone.ligar();
		iphone.atender();
		iphone.iniciarCorreiroVoz();
		iphone.exibirPagina();
		iphone.adicionarNovaAba();
		iphone.atualizarPagina();
		
		
	}
}
