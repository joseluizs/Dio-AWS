package streamAPI.functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        // Criando uma lista de números
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        // Criando um Consumer para imprimir números pares
        Consumer<Integer> imprimirNumeroPar = numero -> {
            if (numero % 2 == 0) { // Verificando se o número é par
                System.out.println(numero); // Imprimindo o número par
            }
        };

        // Usando a Stream API para aplicar o Consumer em cada número da lista
        numeros.stream().forEach(imprimirNumeroPar);

        // Usando forEach diretamente na lista para imprimir números pares
        numeros.forEach(n -> {
            if (n % 2 == 0) { // Verificando se o número é par
                System.out.print(n + " "); // Imprimindo o número par seguido de espaço
            }
        });

        // Usando a Stream API para filtrar e imprimir números pares
        numeros.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
    }
}

