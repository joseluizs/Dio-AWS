package streamAPI.functionalInterfaces;

import java.util.List;
//import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExample {
	
	public static void main(String[] args) {
		//Supplier<String> saudacao = () -> "Olá, Seja bem-vindo(a)!";
		
		//List<String> listaSaudacoes = Stream.generate(saudacao).limit(5).toList();
		List<String> listaSaudacoes = Stream.generate(() -> "Olá, Seja bem-vindo(a)!")
										.limit(5)
										.toList();
		
		
		listaSaudacoes.forEach(System.out::println);
	}

}
