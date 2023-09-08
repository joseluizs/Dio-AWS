package com.br.dio.luiz.app;

public class ViaCepResponse {
    private String cep;
    private String logradouro;
    private String localidade;

    // Construtores, getters e setters (métodos de acesso) aqui

    // Construtor vazio
    public ViaCepResponse() {
    }

    // Construtor com parâmetros
    public ViaCepResponse(String cep, String logradouro, String localidade) {
        this.cep = cep;
        this.logradouro = logradouro;
        this.localidade = localidade;
    }

    // Getters e Setters para as propriedades
    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    // Método toString para representação em string dos objetos ViaCepResponse
    @Override
    public String toString() {
        return "ViaCepResponse{" +
                "cep='" + cep + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", localidade='" + localidade + '\'' +
                '}';
    }
}
