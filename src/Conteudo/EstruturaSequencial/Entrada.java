package Conteudo.EstruturaSequencial;

import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {

////      01 Teste entrada
//        String x;
//        int y;
//        double v;
//        char u;
//
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//
//        x = sc.next();
//        y = sc.nextInt();
//        v = sc.nextDouble();
//        u = sc.next().charAt(0);
//        System.out.println("\nString: " + x);
//        System.out.println("int: " + y);
//        System.out.println("double: " + v);
//        System.out.println("char: " + u);
//        sc.close();
//
////      02 Teste entrada
//        Scanner sc2 = new Scanner(System.in);
//
//        String s1, s2, s3;
//        s1 = sc2.nextLine();
//        s2 = sc2.nextLine();
//        s3 = sc2.nextLine();
//        System.out.println("DADOS DIGITADOS:");
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);
//        sc2.close();

//      03 Teste entrada Buffer
        int x;
        String s1, s2, s3, s0;
        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();

//        Quando você usa um comando de leitura diferente do nextLine() e dá alguma quebra de linha, essa
//        quebra de linha fica "pendente" na entrada padrão. Se você então fizer um nextLine(),
//        aquela quebra de linha pendente será absorvida pelo nextLine().
//        Solução: Faça um nextLine() extra antes de fazer o nextLine() de seu interesse.
        sc.nextLine(); // -> Basicamente limpando o buffer(Local onde é armazenado os dados) de leitura


        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("\nDADOS DIGITADOS:");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

    }
}
