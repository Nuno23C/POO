package com.company;

import java.util.Scanner;
import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        out.print("Exercicio: ");
        int ex = scan.nextInt();

        switch (ex) {
            case 1 :
                Arrays array = new Arrays();
                out.print("Alinea: ");
                String alinea1 = scan.next();

                switch (alinea1) {
                    case "a" :
                        out.print("Introduz o tamanho do array: ");
                        int size_A = scan.nextInt();
                        int[] array_A = new int[size_A];

                        out.println("Intoduz os elementos do array: ");
                        for (int i = 0; i < size_A; i++) {
                            out.print("Insere um numero: ");
                            int numero = scan.nextInt();
                            array_A[i] = numero;
                        }

                        int min = array.min_Array(array_A);
                        out.print("Min = " + min);

                        break;

                    case "b" :
                        out.print("Introduz o tamanho do array: ");
                        int size_B = scan.nextInt();
                        int[] array_B = new int[size_B];

                        out.println("Intoduz os elementos do array: ");
                        for (int i = 0; i < size_B; i++) {
                            out.print("Insere um numero: ");
                            int numero = scan.nextInt();
                            array_B[i] = numero;
                        }

                        out.println("Novo array entre que indices do anterior? (Introduza dois valores)");
                        int a = scan.nextInt();
                        int b = scan.nextInt();
                        int[] novo = array.array_entre(array_B, a, b);

                        out.println("Novo array:");
                        for (int i = 0; i < novo.length; i++) {
                            out.print(novo[i]);
                        }

                        break;

                    case "c" :
                        out.print("Introduz o tamanho do primeiro array: ");
                        int size_C1 = scan.nextInt();
                        int[] array_C1 = new int[size_C1];

                        out.println("Intoduz os elementos do primeiro array: ");
                        for (int i = 0; i < size_C1; i++) {
                            out.print("Insere um numero: ");
                            int numero = scan.nextInt();
                            array_C1[i] = numero;
                        }

                        out.print("Introduz o tamanho do segundo array: ");
                        int size_C2 = scan.nextInt();
                        int[] array_C2 = new int[size_C2];

                        out.println("Intoduz os elementos do segundo array: ");
                        for (int i = 0; i < size_C2; i++) {
                            out.print("Insere um numero: ");
                            int numero = scan.nextInt();
                            array_C2[i] = numero;
                        }

                        out.println("Novo array com os elementos comuns:");
                        int[] novoC = array.comuns(array_C1, array_C2);
                        for (int i = 0; i < novoC.length; i++) {
                            out.println(novoC[i]);
                        }

                        break;
                }
            case 2 :
                Turma turma = new Turma(5,5);

                out.print("Alinea: ");
                String alinea2 = scan.next();

                // Ex. 2 a)
                out.print("Preencher a matriz das notas");
                for(int i = 0; i < 5; i += 1) {
                    for (int j = 0; j < 5; j += 1) {
                        out.println("Aluno " + i);
                        out.println("Uc " + j);
                        out.print("Nota: ");
                        int nota = scan.nextInt();
                        turma.atualizarPauta(i, j, nota);
                    }
                }

                switch (alinea2) {
                    case "b":
                    out.print("Indice");
                }
        }


    }
}