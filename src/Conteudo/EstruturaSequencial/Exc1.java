package Conteudo.EstruturaSequencial;

import java.util.Locale;

public class Exc1 {
	
	//Parte 1
//	Em um novo programa, inicie as
//	seguintes variáveis:
//	String product1 = "Computer";
//	String product2 = "Office desk";
//	int age = 30;
//	int code = 5290;
//	char gender = 'F';
//	double price1 = 2100.0;
//	double price2 = 650.50;
//	double measure = 53.234567;
	
	//Parte 2
//	Em seguida, usando os valores das variáveis, produza a
//	seguinte saída na tela do console:
//	Products:
//	Computer, which price is $ 2100,00
//	Office desk, which price is $ 650,50
//	Record: 30 years old, code 5290 and gender: F
//	Measue with eight decimal places: 53,23456700
//	Rouded (three decimal places): 53,235
//	US decimal point: 53.235
	
	
	
	public static void main(String[] args) {
		
		String product1 = "Computer";
		String product2 = "Office desk";

		int age = 30;
		int code = 5290;

		char gender = 'F';

		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;

		System.out.printf("Products:\n%s, witch price is $ %.2f", product1, price1);
		System.out.printf("\n%s, witch price is $ %.2f", product2, price2);
		System.out.printf("\n\nRecord: %d years old, code %d and gender: %s", age, code, gender);
		System.out.printf("\nMeasue with eight decimal places: %.8f", measure);
		System.out.printf("\nRouded (three decimal places): %.3f", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("\nUS decimal point: %.3f", measure);

	}

}
