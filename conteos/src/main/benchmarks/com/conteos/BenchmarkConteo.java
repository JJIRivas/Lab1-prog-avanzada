package com.conteo;

import java.util.Arrays;
import java.util.Map;
import java.util.Random;

public class BenchmarkConteo {

    public static void main(String[] args) {
        ConteoLineal cl = new ConteoLineal();
        ConteoHash ch = new ConteoHash();
        Random rand = new Random();

        int[] tamanos = { 1000, 5000, 10000, 50000, 500000, 1000000 };
        int repeticiones = 20;

        for (int n : tamanos) {
            int fil = (int) Math.sqrt(n);
            int col = fil;

            int[][] matriz = cl.generarMatriz(fil, col);
            Map<Integer, Integer> mapa = ch.construirMapa(matriz);

            long[] tiemposLineal = new long[repeticiones];
            long[] tiemposHash = new long[repeticiones];

            for (int i = 0; i < repeticiones; i++) {
                int objetivo = matriz[rand.nextInt(fil)][rand.nextInt(col)];

                long inicio = System.nanoTime();
                cl.contarOcurrencias(objetivo, matriz);
                long fin = System.nanoTime();
                tiemposLineal[i] = fin - inicio;

                inicio = System.nanoTime();
                ch.contarOcurrencias(objetivo, mapa);
                fin = System.nanoTime();
                tiemposHash[i] = fin - inicio;
            }

            Arrays.sort(tiemposLineal);
            Arrays.sort(tiemposHash);

            long medianaLineal = tiemposLineal[repeticiones / 2];
            long medianaHash = tiemposHash[repeticiones / 2];

            System.out.println(
                "Tamaño: " +
                    n +
                    "  Lineal: " +
                    medianaLineal +
                    " ns" +
                    "  Hash: " +
                    medianaHash +
                    " ns"
            );
        }
    }
}
