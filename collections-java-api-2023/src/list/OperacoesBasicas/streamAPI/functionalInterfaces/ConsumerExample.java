package streamAPI.functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1,2,3,4,56,7,8);
		
		Consumer<Integer> imprimirNumeroPar = numero ->{
			if (numero % 2 == 0) {
				System.out.println(numero);
			}
		};
		numeros.stream().forEach(imprimirNumeroPar);
		
		numeros.forEach(n ->{
			if (n % 2 == 0) {
				System.out.print(n + " ");
			}
		});
	}

}
