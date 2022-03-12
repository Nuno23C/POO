package com.company;

import java.util.Scanner;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        out.print("Exercicio: ");
        int ex = scan.nextInt();

        out.print("Alinea: ");
        String alinea = scan.next();

        switch (ex) {
            case 1:
                Circulo circulo = new Circulo();

                switch (alinea) {
                    case "a":
                        double x = circulo.getX();
                        out.println("Valor em x: " + x);
                        break;

                    case "b":
                        double y = circulo.getY();
                        out.println("Valor em y: " + y);
                        break;

                    case "c":
                        double raio = circulo.getRaio();
                        out.println("Valor do raio: " + raio);
                        break;

                    case "d":
                        circulo.setX(2);
                        circulo.setY(2);
                        circulo.setRaio(16);

                        out.println("X: " + circulo.getX());
                        out.println("Y: " + circulo.getY());
                        out.println("Raio: " + circulo.getRaio());

                        break;

                    case "e":
                        circulo.alteraCentro(10, 10);
                        out.println("X: " + circulo.getX());
                        out.println("Y: " + circulo.getY());

                        break;

                    case "f":
                        out.println("Area: " + circulo.calculaArea());

                        break;

                    case "g":
                        out.println("Perimetro: " + circulo.calculaPerimetro());

                        break;

                }
        }
    }
}
