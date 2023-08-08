package com.calculos.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class AppApplication {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
		Scanner scanner = new Scanner(System.in);

		List<Integer> numerosInseridos = new ArrayList<>();
		int somaNumeros = 0;

		System.out.println("Digite vários números (pressione Enter sem digitar nada para encerrar):");

		while (true) {
			String entrada = scanner.nextLine();

			if (entrada.isEmpty()) {
				break;
			}

			try {
				int numero = Integer.parseInt(entrada);
				numerosInseridos.add(numero);
				somaNumeros += numero;
			} catch (NumberFormatException e) {
				System.out.println("Entrada inválida. Insira um número válido ou pressione Enter para encerrar.");
			}
		}

		scanner.close();

		int totalNumeros = numerosInseridos.size();

		if (totalNumeros > 0) {
			double media = (double) somaNumeros / totalNumeros;
			double desvioPadrao = calcularDesvioPadrao(numerosInseridos, media);
			double mediana = calcularMediana(numerosInseridos);

			System.out.println("Números inseridos: " + numerosInseridos);
			System.out.println("Número de dados inseridos: " + totalNumeros);
			System.out.println("Média dos números inseridos: " + media);
			System.out.println("Desvio Padrão: " + desvioPadrao);
			System.out.println("Mediana: " + mediana);
		} else {
			System.out.println("Nenhum número inserido.");
		}
	}

	public static double calcularDesvioPadrao(List<Integer> numeros, double media) {
		double somaDiferencasQuadrado = 0;

		for (int numero : numeros) {
			double diferenca = numero - media;
			somaDiferencasQuadrado += diferenca * diferenca;
		}

		double variancia = somaDiferencasQuadrado / numeros.size();
		return Math.sqrt(variancia);
	}

	public static double calcularMediana(List<Integer> numeros) {
		Collections.sort(numeros);
		int tamanho = numeros.size();

		if (tamanho % 2 == 0) {
			int indice1 = tamanho / 2 - 1;
			int indice2 = tamanho / 2;
			return (numeros.get(indice1) + numeros.get(indice2)) / 2.0;
		} else {
			int indice = tamanho / 2;
			return numeros.get(indice);
		}
	}
}
