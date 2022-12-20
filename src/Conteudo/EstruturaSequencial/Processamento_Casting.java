package Conteudo.EstruturaSequencial;

public class Processamento_Casting {

//	Casting
//	� a convers�o expl�cita de um tipo para outro.
//	� necess�rio quando o compilador n�o � capaz de �adivinhar� que o
//	resultado de uma express�o deve ser de outro tipo.

	public static void main(String[] args) {

		// Exemplo 1
		int a, b;
		double resultado;
		a = 5;
		b = 2;
		resultado = (double) a / b;
		System.out.println(resultado);

		// Exemplo 2
		double c;
		int d;
		c = 5.0;
		d = (int) c;
		System.out.println(d);

	}

}
