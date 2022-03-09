package com.company;

import java.util.Scanner;

public class Arrays {
    Scanner scan = new Scanner(System.in);

    // Ex. 1.a)
    public int min_Array(int[] array) {
        int min = array[0];

        for (int i = 0; i < array.length; i++)
            if (array[i] < min)
                min = array[i];

        return min;
    }

    // Ex. 1.b)
    public int[] array_entre (int[] array, int a, int b) {
        int tam = a - b;
        int[] novo = new int[tam];
        System.arraycopy(array, a, novo, 0, tam);

        return novo;
    }

    // Ex. 1.c)
    public int[] comuns (int a[], int b[]) {
        int[] novo = new int[Math.max(a.length, b.length)];
        java.util.Arrays.sort(a);
        java.util.Arrays.sort(b);

        int p = 0;

        for(int i = 0; i < a.length; i++) {
            boolean found = false;
            for(int j = 0; j < b.length; j++) {
                if (a[i] == b[i] && !found) {
                    novo[p++] = a[i];
                    found = true;
                }
            }
        }

        int[] r = new int[p];
        System.arraycopy(novo,0,r,0,p);

        return r;
    }
}
