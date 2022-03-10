package com.company;

import java.util.Scanner;

public class Matrizes {
    Scanner scan = new Scanner(System.in);

    // Ex. 6.a)
    public void lerMatriz(int m[][], int nLinhas, int nColunas){

        for(int i = 0; i < nLinhas; i++) {
            for(int j = 0; j < nColunas; j++) {
                m[i][j] = scan.nextInt();
            }
        }
        scan.close();
    }

    // Ex. 6.b)
    public int[][] somaDeMatrizes(int m1[][], int m2[][], int nLinhas, int nColunas) {
        int[][] nova_m = new int[nLinhas][nColunas];

        for(int i = 0; i < nLinhas; i++) {
            for(int j = 0; j < nColunas; j++) {
                nova_m[i][j] = m1[i][j] + m2[i][j];
            }
        }

        return nova_m;
    }

    // Ex. 6.c)
    public boolean matrizesIguais(int m1[][], int nLinhas1, int nColunas1, int m2[][], int nLinhas2, int nColunas2) {
        if(nLinhas1 == nLinhas2 && nColunas1 == nColunas2) {
            for(int i = 0; i < nLinhas1; i++) {
                for(int j = 0; j < nColunas1; j++) {
                    if(m1[i][j] != m2[i][j]) {
                        return false;
                    }
                }
            }
        }
    return true;
    }

}
