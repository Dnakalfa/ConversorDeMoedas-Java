package com.dnak.conversorMonetario.calculo;

import com.dnak.conversorMonetario.modelo.Moeda;
import java.util.ArrayList;
import java.util.List;

public class Conversao {
    private List<String> historico = new ArrayList<>();

    // Conversão para moedas suportadas
    public Moeda converter(double valorEmReais, String moedaDestino) {
        double taxaConversao = switch (moedaDestino.toLowerCase()) {
            case "dolar" -> 0.20;
            case "euro" -> 0.18;
            case "peso" -> 25.0;
            case "libra" -> 0.15;
            case "iene" -> 14.0;
            case "bitcoin" -> 0.0000045; // Exemplo fictício
            default -> throw new IllegalArgumentException("Moeda não suportada.");
        };

        double valorConvertido = valorEmReais * taxaConversao;
        Moeda moeda = new Moeda(moedaDestino, valorConvertido);

        // Adiciona ao histórico
        adicionarAoHistorico(valorEmReais, moeda);

        return moeda;
    }

    private void adicionarAoHistorico(double valorOriginal, Moeda moedaConvertida) {
        String resultado = "Valor em Reais: " + valorOriginal + " -> " + moedaConvertida.toString();
        if (historico.size() == 10) { // Limita o histórico a 10 itens
            historico.remove(0);
        }
        historico.add(resultado);
    }

    public List<String> getHistorico() {
        return historico;
    }
}

