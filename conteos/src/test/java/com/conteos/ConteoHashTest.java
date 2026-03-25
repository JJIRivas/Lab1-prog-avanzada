package com.conteo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

import org.junit.jupiter.api.Test;

public class ConteoHashTest {

    ConteoHash ch = new ConteoHash();

    @Test
    void testEncontradoUnaVez() {
        int[][] matriz = { { 1, 2, 3 }, { 4, 5, 6 } };
        Map<Integer, Integer> mapa = ch.construirMapa(matriz);

        assertEquals(1, ch.contarOcurrencias(3, mapa));
    }

    @Test
    void testNoExiste() {
        int[][] matriz = { { 1, 2 }, { 3, 4 } };
        Map<Integer, Integer> mapa = ch.construirMapa(matriz);

        assertEquals(0, ch.contarOcurrencias(99, mapa));
    }

    @Test
    void testRepetidos() {
        int[][] matriz = { { 2, 2 }, { 2, 2 } };
        Map<Integer, Integer> mapa = ch.construirMapa(matriz);

        assertEquals(4, ch.contarOcurrencias(2, mapa));
    }

    @Test
    void testUnElemento() {
        int[][] matriz = { { 7 } };
        Map<Integer, Integer> mapa = ch.construirMapa(matriz);

        assertEquals(1, ch.contarOcurrencias(7, mapa));
        assertEquals(0, ch.contarOcurrencias(3, mapa));
    }

    @Test
    void testMapaContieneVariosValores() {
        int[][] matriz = { { 1, 2, 1 }, { 3, 2, 1 } };
        Map<Integer, Integer> mapa = ch.construirMapa(matriz);

        assertEquals(3, ch.contarOcurrencias(1, mapa));
        assertEquals(2, ch.contarOcurrencias(2, mapa));
        assertEquals(1, ch.contarOcurrencias(3, mapa));
    }
}
