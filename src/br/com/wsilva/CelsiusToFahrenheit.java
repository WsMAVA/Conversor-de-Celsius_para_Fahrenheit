package br.com.wsilva;

import java.util.Scanner;

/**
 * @author wallace
 * O código abaixo cria um conversor de Celsius para Fahrenheit que pede uma temperatura em graus Celsius e, em seguida, converte-a para Fahrenheit.
 */

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // Cria um objeto da classe Scanner para ler a entrada do usuário.
        System.out.println("Digite a temperatura em Celsius: ");// Exibe uma mensagem ao usuário pedindo para inserir a temperatura em Celsius.
        double celsius = s.nextDouble(); // Lê o próximo número inserido pelo usuário (um valor do tipo double) e o armazena na variável 'celsius'.
        s.close();// Fecha o Scanner após a leitura dos dados para evitar o consumo de recursos desnecessários.
        double fahrenheit = (celsius*9/5) + 32;// Converte a temperatura de Celsius para Fahrenheit utilizando a fórmula: F = (C * 9/5) + 32.
        System.out.println(celsius+" graus Celsius é igual a "+fahrenheit+" graus Fahrenheit.");
    }
}
