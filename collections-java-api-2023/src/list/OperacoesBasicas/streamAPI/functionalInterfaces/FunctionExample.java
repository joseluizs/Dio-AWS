package streamAPI.functionalInterfaces;

//Importando classes necessárias
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

//Criando a classe de exemplo
public class FunctionExample {

 public static void main(String[] args) {
     // Criando uma lista de números
     List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
     
     // Criando uma função que dobra um número usando uma expressão lambda
     Function<Integer, Integer> dobrar = numero -> numero * 2;
     
     // Usando a Stream API para aplicar a função em cada número da lista
     // E transformando os números dobrados em uma nova lista
     List<Integer> numerosDobrados = numeros.stream()
                                             .map(dobrar)
                                             .collect(Collectors.toList());
     
     // Percorrendo a lista de números dobrados e imprimindo cada um
     numerosDobrados.forEach(n -> System.out.println(n));
 }
}

