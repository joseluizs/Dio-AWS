package streamAPI.functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryExample {
    public static void main(String[] args) {
        // Criando uma lista de números
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        
        // Criando um BinaryOperator para somar dois números (usando expressão lambda)
        BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;
        
        // Criando um BinaryOperator para somar dois números (usando referência de método)
        BinaryOperator<Integer> somar2 = Integer::sum;
        
        // Usando a Stream API para reduzir (ou acumular) os números através da soma
        // O valor inicial para acumulação é 0
        int resultado = numeros.stream().reduce(0, somar2);
        
        // Imprimindo o resultado da soma dos números
        System.out.println("A soma dos números é: " + resultado);
        
        // Usando o método sum da classe Integer para realizar a soma
        int novoResultado = numeros.stream().reduce(0, Integer::sum);
        
        // Imprimindo o novo resultado da soma dos números
        System.out.println("A soma do novo resultado dos números é: " + novoResultado);
    }
}

