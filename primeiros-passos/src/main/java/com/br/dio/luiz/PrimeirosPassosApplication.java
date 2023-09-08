package com.br.dio.luiz;

import com.br.dio.luiz.app.ConversorJson;
import com.br.dio.luiz.app.ViaCepResponse;

import com.google.gson.Gson;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PrimeirosPassosApplication {

	public static void main(String[] args) { SpringApplication.run(PrimeirosPassosApplication.class, args);	}
	@Bean
	public CommandLineRunner run(ConversorJson conversor) {
		return args -> {
			// Corrigindo a definição do JSON e adicionando valor para "localidade"
			String json = "{\"cep\": \"01001-000\", \"logradouro\": \"Praça da Sé\", \"localidade\": \"São Paulo\"}";
			ViaCepResponse response = conversor.converter(json);
			System.out.println("Dados do CEP: " + response);
		};
	}
}