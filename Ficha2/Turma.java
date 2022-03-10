package com.company;

public class Turma {
    private int[][] notasTurma;
    private int numAlunos;
    private int ucs;

    public Turma(int numAlunos, int ucs){
        notasTurma = new int[numAlunos][ucs];
        this.numAlunos = numAlunos;
        this.ucs = ucs;
    }

    public void setNota(int aluno, int uc, int nota){
        this.notasTurma[aluno][uc] = nota;
    }

    public int getNota(int aluno, int uc){
        return this.notasTurma[aluno][uc];
    }

    // Ex. 2.a)
    public void atualizarPauta(int aluno, int uc, int nota) {
        setNota(aluno, uc, nota);
    }

    // Ex. 2.b)
    public int somaDasNotas(int ucInd) {
        int sum = 0;
        for(int i = 0; i < this.ucs; i++) {
            sum += getNota(i, ucInd);
        }
        return sum;
    }

    // Ex. 2.c)
    public double mediaAluno(int alunoInd) {
        double soma = 0;
        for(int i = 0; i < this.ucs; i++) {
            soma += getNota(alunoInd, i);
        }
        double media = (soma / this.ucs);
        return media;
    }

    // Ex. 2.d)
    public double mediaUC(int ucInd) {
        double soma = 0;
        for(int i = 0; i < this.ucs; i++) {
            soma += getNota(i, ucInd);
        }
        double media = (soma / this.ucs);
        return media;
    }

    // Ex. 2.e)
    public int[] notasMaisAltas() {
        int max;
        int[] maiorNota = new int[this.numAlunos*this.ucs];
        for(int i = 0; i < this.numAlunos; i++) {
            max = getNota(i,0);
            for(int j = 0; j < this.ucs; j++) {
                if(getNota(i,j) > max) {
                    max = getNota(i,j);
                }
            }
            maiorNota[i] = max;
        }
        return maiorNota;
    }

    // Ex. 2.f)
    public int[] notasMaisBaixas() {
        int min;
        int[] menorNota = new int[this.numAlunos*this.ucs];
        for(int i = 0; i < this.numAlunos; i++) {
            min = getNota(i,0);
            for(int j = 0; j < this.ucs; j++) {
                if(getNota(i,j) < min) {
                    min = getNota(i,j);
                }
            }
            menorNota[i] = min;
        }
        return menorNota;
    }

    // Ex. 2.g)
    public int[] notasAcimaDe(int valor) {
        int[] array = new int[this.numAlunos*this.ucs];
        int k = 0;
        for(int i = 0; i < this.numAlunos; i++) {
            for(int j = 0; j < this.ucs; j++) {
                if(getNota(i,j) > valor) {
                    array[k] = getNota(i,j);
                    k++;
                }
            }
        }
        return array;
    }

    // Ex. 2.h)
    public void notasDosAlunos() {
        String notas = "";
        for(int i = 0; i < this.numAlunos; i++){
            notas = notas + "Aluno " + i + ": ";
            for(int j = 0; j < this.ucs; j++){
                notas = notas + getNota(i, j) + " ";
            }
        }
    }

    // Ex. 2.i)
    public int mediaMaior() {
        int UCIndice = 0;
        double melhor = 0;
        for(int i = 0; i < this.ucs; i++) {
            if(mediaUC(i) > melhor) {
                melhor = mediaUC(i);
                UCIndice = i;
            }
        }
        return UCIndice;
    }

}
