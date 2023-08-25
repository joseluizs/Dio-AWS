package list.Ordenacao;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
	
	private List<Integer> numeros;

	public SomaNumeros() {
		this.numeros = new ArrayList<>();
	}
	
	public void adicionarNumero(int numero) {
        numeros.add(numero);
    }
	
	public int calcularSoma() {
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        return soma;
    }
	
	public int encontrarMaiorNumero() {
        if (numeros.isEmpty()) {
            throw new IllegalStateException("A lista está vazia. Não é possível encontrar o maior número.");
        }

        int maior = numeros.get(0);
        for (int numero : numeros) {
            if (numero > maior) {
                maior = numero;
            }
        }
        return maior;
    }
	
	public int encontrarMenorNumero() {
        if (numeros.isEmpty()) {
            throw new IllegalStateException("A lista está vazia. Não é possível encontrar o menor número.");
        }

        int menor = numeros.get(0);
        for (int numero : numeros) {
            if (numero < menor) {
                menor = numero;
            }
        }
        return menor;
    }
	
	public List<Integer> exibirNumeros() {
        return new ArrayList<>(numeros);
    }
	
	public static void main(String[] args) {
		SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(7);

        System.out.println("Números na lista: " + somaNumeros.exibirNumeros());
        System.out.println("Soma dos números: " + somaNumeros.calcularSoma());
        System.out.println("Maior número: " + somaNumeros.encontrarMaiorNumero());
        System.out.println("Menor número: " + somaNumeros.encontrarMenorNumero());

    }
	
}
