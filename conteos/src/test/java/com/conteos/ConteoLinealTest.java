package com.conteo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ConteoLinealTest {

    ConteoLineal cl = new ConteoLineal();

    @Test
    void testEncontradoUnaVez() {
        int[][] matriz = { { 1, 2, 3 }, { 4, 5, 6 } };

        assertEquals(1, cl.contarOcurrencias(3, matriz));
    }

    @Test
    void testNoExiste() {
        int[][] matriz = { { 1, 2 }, { 3, 4 } };

        assertEquals(0, cl.contarOcurrencias(99, matriz));
    }

    @Test
    void testMatrizVacia() {
        int[][] matriz = new int[0][0];

        assertEquals(0, cl.contarOcurrencias(1, matriz));
    }

    @Test
    void testRepetidos() {
        int[][] matriz = { { 2, 2 }, { 2, 2 } };

        assertEquals(4, cl.contarOcurrencias(2, matriz));
    }

    @Test
    void testUnElemento() {
        int[][] matriz = { { 7 } };

        assertEquals(1, cl.contarOcurrencias(7, matriz));
        assertEquals(0, cl.contarOcurrencias(3, matriz));
    }
}
