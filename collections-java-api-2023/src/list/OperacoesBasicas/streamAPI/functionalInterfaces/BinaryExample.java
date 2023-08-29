package streamAPI.functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryExample {
    public static void main(String[] args) {
        // Criando uma lista de números
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        
        // Criando um BinaryOperator para somar dois números
        BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;
        
        // Usando a Stream API para reduzir (ou acumular) os números através da soma
        // O valor inicial para acumulação é 0
        int resultado = numeros.stream().reduce(0, somar);
        
        // Imprimindo o resultado da soma dos números
        System.out.println("A soma dos números é: " + resultado);
    }
}

