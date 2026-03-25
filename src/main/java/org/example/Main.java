package org.example;
import java.util.Scanner;
import java.util.Random;

        class MatrizPersonalizada {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                Random rd = new Random();

                System.out.print("Introduce el número de filas (n): ");
                int n = sc.nextInt();
                System.out.print("Introduce el número de columnas (m): ");
                int m = sc.nextInt();
                int[][] matriz = new int[n][m];

                System.out.println("\nMatriz de" + n + "x" + m + "generada:");
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        matriz[i][j] = rd.nextInt(1000) + 1;
                        System.out.print(matriz[i][j] + "\t");
                    }
                    System.out.println();
                }


                System.out.print("\n¿Qué numero quieres buscar?");
                int buscar = sc.nextInt();
                boolean encontrado = false;

                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        if (matriz[i][j] == buscar) {
                            System.out.println("Encontrado en fila:" + i + "columna: " + j);
                            encontrado = true;
                        }
                    }
                }

                if (!encontrado) System.out.println("El numero no está en la matriz");
                sc.close();
            }
        }
