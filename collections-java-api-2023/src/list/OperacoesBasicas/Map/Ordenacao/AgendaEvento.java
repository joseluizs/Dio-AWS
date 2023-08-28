package Map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEvento {
	
	private Map<LocalDate, Evento> eventosMap;

	public AgendaEvento() {
		this.eventosMap = new HashMap<>();
	}
	
	public void adicionarEvento(LocalDate data, String nome, String atracao) {
		//Evento evento = new Evento(nome, atracao);
		eventosMap.put(data, new Evento(nome, atracao));
	}
	
	public void exibirAgenda() {
		Map<LocalDate, Evento>eventosTreeMap = new TreeMap<>(eventosMap);
		System.out.println(eventosTreeMap);
	}
	
	public void obterProximoEvento() {
		LocalDate dataAtual = LocalDate.now();
		LocalDate proximaData = null;
		Evento proximoEvento = null;
		Map<LocalDate, Evento>eventosTreeMap = new TreeMap<>(eventosMap);
		for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
			if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
				proximaData = entry.getKey();
				proximoEvento =  entry.getValue();
				System.out.println("O próximo evento: " + proximaData + " acontecerá na data: " + proximoEvento);
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		AgendaEvento agendaEvento = new AgendaEvento();
		
		agendaEvento.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Evento 1", "Atraçaõ 1");
		agendaEvento.adicionarEvento(LocalDate.of(2022, 7, 9), "Evento 2", "Atraçaõ 2");
		agendaEvento.adicionarEvento(LocalDate.of(2000, Month.JANUARY, 10), "Evento 3", "Atraçaõ 3");
		agendaEvento.adicionarEvento(LocalDate.of(2023, Month.AUGUST, 29), "Evento 4", "Atraçaõ 4");
		agendaEvento.adicionarEvento(LocalDate.of(2023, Month.AUGUST, 30), "Evento 5", "Atraçaõ 5");
		agendaEvento.adicionarEvento(LocalDate.of(2024, Month.FEBRUARY, 22), "Evento 6", "Atraçaõ 6");
		
		agendaEvento.exibirAgenda();
		agendaEvento.obterProximoEvento();
	}

}
