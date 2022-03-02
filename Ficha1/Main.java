package com.company;

import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.setOut;

public class Main {
    public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
        Ficha1 ficha1 = new Ficha1();

        out.print("Exercicio: ");
        int ex = scan.nextInt();

        switch (ex) {
            case 1:
                out.print("Introduz uma temperatura: ");
                double tempC = scan.nextDouble();
                double tempF = ficha1.celsiusParaFarenheit(tempC);
                out.println(tempC + " graus Celcius em Farenheit -> " + tempF);
                break;

            case 2:
                out.println("Introduz dois numeros inteiros: ");
                int a = scan.nextInt();
                int b = scan.nextInt();
                int max = ficha1.maior_entre_dois(a, b);
                out.print("O maior entre " + a + " e " + b + " e " + max);
                break;

            case 3:
                out.print("Nome: ");
                String nome = scan.next();
                out.print("Saldo: ");
                double saldo = scan.nextDouble();
                out.println("A conta do " + nome + " tem um saldo de " + saldo);
                break;

            case 4:
                out.print("Valor em euros: ");
                double euros = scan.nextDouble();

                out.print("Taxa de conversao: ");
                double taxaConversao = scan.nextDouble();

                double libras = ficha1.euros_para_libras(euros, taxaConversao);
                out.print("Valor em Libras: " + libras);

                break;

            case 5:
                out.println("Introduz dois valores: ");
                int a5 = scan.nextInt();
                int b5 = scan.nextInt();
                double media = ficha1.decrescente_e_media(a5,b5);
                out.print("Media: " + media);
                break;

            case 6:
                out.print("Introduz um numero: ");
                int num = scan.nextInt();
                long fac = ficha1.factorial(num);
                out.print("Factorial = " + fac);
                break;
        }
    }
}
