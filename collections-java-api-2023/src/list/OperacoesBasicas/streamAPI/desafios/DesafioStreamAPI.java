package streamAPI.desafios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DesafioStreamAPI {

	public static void main(String[] args) {

		// Criando a lista de números inteiros
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

		// Ordenando a lista de números em ordem crescente
		numeros.sort(Comparator.naturalOrder()); // Utiliza o comparador natural

		// Exibindo a lista ordenada no console
		numeros.forEach(System.out::println);
		
	}

}
