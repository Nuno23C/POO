package com.company;

import javax.swing.*;
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
                Turma turma = new Turma(3,3);

                out.print("Alinea: ");
                String alinea2 = scan.next();

                // Ex. 2 a)
                out.print("Numero de alunos: ");
                int numeroDeAlunos = scan.nextInt();
                out.print("Numero de UC's: ");
                int numeroDeUCs = scan.nextInt();

                out.println("Preencher a matriz das notas");
                for(int i = 0; i < numeroDeAlunos; i++) {
                    for(int j = 0; j < numeroDeUCs; j++) {
                        out.println("Aluno " + i);
                        out.println("Uc " + j);
                        out.print("Nota: ");
                        int nota = scan.nextInt();
                        turma.atualizarPauta(i, j, nota);
                    }
                }

                switch (alinea2) {
                    case "b":
                        out.print("Indice da UC");
                        int ucInd_b = scan.nextInt();
                        int soma = turma.somaDasNotas(ucInd_b);
                        out.print("Soma = " + soma);
                        break;

                    case "c":
                        out.print("Indice do Aluno");
                        int alunoInd_c = scan.nextInt();
                        double media_c = turma.mediaAluno(alunoInd_c);
                        out.print("Media do aluno = " + media_c);
                        break;

                    case "d":
                        out.print("Indice da UC");
                        int ucInd_d = scan.nextInt();
                        double media_d = turma.mediaUC(ucInd_d);
                        out.print("Media da UC = " + media_d);
                        break;

                    case "e":
                        out.print("Nota mais alta a todas as UC's de todos os alunos");
                        int[] maior = turma.notasMaisAltas();
                        for(int i = 0; i < numeroDeAlunos; i++){
                            out.println("Aluno " + i + " = " + maior[i]);
                        }
                        break;

                    case "f":
                        out.print("Nota mais baixa a todas as UC's de todos os alunos");
                        int[] menor = turma.notasMaisBaixas();
                        for(int i = 0; i < numeroDeAlunos; i++){
                            out.println("Aluno " + i + " = " + menor[i]);
                        }
                        break;

                    case "g":
                        out.print("Notas a cima de: ");
                        int valor_g = scan.nextInt();
                        int[] array_2g = turma.notasAcimaDe(valor_g);
                        for(int i = 0; i < array_2g.length && array_2g[i] != 0; i++) {
                            out.println(" " + array_2g[i]);
                        }
                        break;

                    case "h":
                        out.println("Nota de todos os alunos:");
                        turma.notasDosAlunos();
                        break;

                    case "i":
                        int melhorUC = turma.mediaMaior();
                        out.print("A UC com melhor media " + melhorUC);
                        break;
                }
        }
    }
}