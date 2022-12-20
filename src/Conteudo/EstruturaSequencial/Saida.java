package Conteudo.EstruturaSequencial;

import java.util.Locale;

public class Saida {
	
	public static void main(String[] args) {
		
		double x = 10.518556;
		
		String nome = "Victor";
		int idade = 23;
		double renda = 10000.0;
		
		System.out.print("Hello World!");
		System.out.println("Hi");
		
		// Para pular linha \n ou %n
		System.out.printf("%.2f%n", x);
		
		//printf para formatar, no caso formatando para quatro casas decimais
		System.out.printf("%.4f%n", x);
		
		//Para utilizar a formata��o US, em vez de pegar a formata��o do meu PC 
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
		
		System.out.printf("Resultado = %.2f metros%n", x);
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		
	}
	
}
