package com.company;

import java.util.Scanner;
import static java.lang.System.out;

public class Ficha1 {

    // Ex. 2.1
    public double celsiusParaFarenheit(double graus) {
        double r1 = (graus * 9 / 5) + 32;

        return r1;
    }

    // Ex. 2.2
    public int maior_entre_dois(int a, int b) {
        int r2 = Math.max(a,b);

        return r2;
    }

    // Ex. 2.3
    // No main

    // Ex. 2.4
    public double euros_para_libras(double valor, double taxaConversao) {
        double r4 = valor * taxaConversao;

        return r4;
    }

    // Ex. 2.5
    public double decrescente_e_media(int a, int b) {
        if (a < b) {
            out.println(a);
            out.println(b);
        } else {
            out.println(b);
            out.println(a);
        }

        double media = (a+b)/2;

        return media;
    }

    // Ex. 2.6
    public long factorial(int num) {
        if (num == 1)
            return 1;
        else
            return (num * factorial(num - 1));
    }

    // Ex. 2.7
    public long tempoGasto() {
        long before = System.nanoTime();
        out.println(factorial(500));
        long after = System.nanoTime();

        return (after - before) / 1000000;
    }
}
