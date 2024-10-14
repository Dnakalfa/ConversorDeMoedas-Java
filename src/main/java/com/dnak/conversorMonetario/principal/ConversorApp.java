package com.dnak.conversorMonetario.principal;

import com.dnak.conversorMonetario.calculo.Conversao;
import com.dnak.conversorMonetario.modelo.Moeda;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ConversorApp extends Application {
	private Conversao conversao = new Conversao();

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		// Configurando a interface gráfica
		primaryStage.setTitle("**Conversor Monetário**");

		Label labelValor = new Label("Digite o valor em Reais:");
		TextField inputValor = new TextField();

		Label labelMoeda = new Label("Moeda para conversão:");
		ComboBox<String> comboMoedas = new ComboBox<>();
		comboMoedas.getItems().addAll("Dolar", "Euro", "Peso", "Libra", "Iene", "Bitcoin");

		Button btnConverter = new Button("Converter");
		TextArea areaResultado = new TextArea();
		areaResultado.setEditable(false);

		ListView<String> listViewHistorico = new ListView<>();

		btnConverter.setOnAction(e -> {
			try {
				double valorEmReais = Double.parseDouble(inputValor.getText());
				String moedaDestino = comboMoedas.getValue();
				if (moedaDestino != null) {
					Moeda resultado = conversao.converter(valorEmReais, moedaDestino);
					areaResultado.setText("Resultado: " + resultado.toString());
					listViewHistorico.getItems().setAll(conversao.getHistorico());
				} else {
					areaResultado.setText("Por favor, escolha uma moeda.");
				}
			} catch (NumberFormatException ex) {
				areaResultado.setText("Erro: valor inválido.");
			}
		});

		VBox layout = new VBox(10);
		layout.getChildren().addAll(labelValor, inputValor, labelMoeda, comboMoedas, btnConverter, areaResultado, listViewHistorico);

		Scene scene = new Scene(layout, 400, 400);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}

