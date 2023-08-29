package streamAPI.functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
	
	public static void main(String[] args) {
		// Criando uma lista de palavras
		List<String> palavras = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby", "abacaxi");
		
		// Definindo um predicado para verificar se a palavra tem mais de cinco caracteres
		Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;
		
		// Usando a Stream API para filtrar as palavras com mais de cinco caracteres
		// e imprimir cada palavra filtrada
		palavras.stream()
				//.filter(maisDeCincoCaracteres) // Filtra as palavras com mais de cinco caracteres
				.filter(p -> p.length() < 5)
				.forEach(System.out::println);  // Imprime cada palavra filtrada
		
		// Outro exemplo de predicado: verifica se a palavra começa com "j"
		Predicate<String> comecaComJ = palavra -> palavra.startsWith("j");
		
		// Filtra as palavras que começam com "j" e imprime
		palavras.stream()
				.filter(comecaComJ)
				.forEach(System.out::println);
		
		// Outro exemplo de predicado: verifica se a palavra contém a letra "a"
		Predicate<String> contemLetraA = palavra -> palavra.contains("a");
		
		// Filtra as palavras que contêm a letra "a" e imprime
		palavras.stream()
				.filter(contemLetraA)
				.forEach(System.out::println);
	}
}

