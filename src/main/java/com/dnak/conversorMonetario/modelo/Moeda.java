package com.dnak.conversorMonetario.modelo;


public class Moeda {
    private String nome;
    private double valorConvertido;

    public Moeda(String nome, double valorConvertido) {
        this.nome = nome;
        this.valorConvertido = valorConvertido;
    }

    public String getNome() {
        return nome;
    }

    public double getValorConvertido() {
        return valorConvertido;
    }

    @Override
    public String toString() {
        return "\nMoeda corrente " + nome + ", Valor Convertido: " + String.format("%.2f", valorConvertido);
    }
}
