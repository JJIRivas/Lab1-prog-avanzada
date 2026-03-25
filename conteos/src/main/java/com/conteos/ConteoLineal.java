package com.conteo;

import java.util.Random;

public class ConteoLineal {

    public int[][] generarMatriz(int fil, int col) {
        Random rand = new Random();
        int[][] matriz = new int[fil][col];

        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                matriz[i][j] = rand.nextInt(1000001);
            }
        }

        return matriz;
    }

    public int contarOcurrencias(int objetivo, int[][] matriz) {
        if (matriz == null || matriz.length == 0 || matriz[0].length == 0) {
            return 0;
        }

        int ocurrencias = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] == objetivo) {
                    ocurrencias++;
                }
            }
        }

        return ocurrencias;
    }
}
