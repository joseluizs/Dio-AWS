package Map.OperacoesBasica;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
	
	private Map<String, Integer> agendaContatosMap;

	public AgendaContatos() {
		this.agendaContatosMap = new HashMap<>();
	}
	
	public void adicionarContato(String nome, Integer telefone) {
		agendaContatosMap.put(nome, telefone);
	}
	
	public void removerContato(String nome) {
		if (!agendaContatosMap.isEmpty()) {
			agendaContatosMap.remove(nome);
		}
	}
	
	public void exibirContatos() {
		System.out.println(agendaContatosMap);
	}
	
	public Integer pesquisarPorNome(String nome) {
		Integer numeroPorNome = null;
		if (!agendaContatosMap.isEmpty()) {
			numeroPorNome = agendaContatosMap.get(nome);
		}
		return numeroPorNome;
	}
	
	public static void main(String[] args) {
		AgendaContatos agendaContatos = new AgendaContatos();
		agendaContatos.adicionarContato("Luiz", 123456);
		agendaContatos.adicionarContato("Luiz", 654321);
		agendaContatos.adicionarContato("Cris", 111111);
		agendaContatos.adicionarContato("Esther", 123456);
		agendaContatos.adicionarContato("Esther Esther", 111111);
		agendaContatos.adicionarContato("Esther", 444444);
		
		agendaContatos.exibirContatos();
		
		agendaContatos.removerContato("Esther Esther");
		agendaContatos.exibirContatos();
		
		System.out.println("O numero é: " + agendaContatos.pesquisarPorNome("Cris"));
		
	}

}
