package com.conteo;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ConteoHash {

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

    public Map<Integer, Integer> construirMapa(int[][] matriz) {
        Map<Integer, Integer> mapa = new HashMap<>();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                int val = matriz[i][j];
                mapa.put(val, mapa.getOrDefault(val, 0) + 1);
            }
        }

        return mapa;
    }

    public int contarOcurrencias(int objetivo, Map<Integer, Integer> mapa) {
        return mapa.getOrDefault(objetivo, 0);
    }
}
