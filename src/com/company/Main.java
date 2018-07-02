package com.company;

import java.util.Scanner;

/**
 * Programa que muestra en pantalla LCD un número ingresado por teclado teniendo en cuenta el tamaño
 *
 * @version 1.0
 * @autor:Angela María Urrea
 * @since 1/07/2018
 */
public class Main {

    public static void main(String[] args) {
        //Declaración de variables
        String numero = "";
        String[] partes;
        int size = 0;
        String cadena;
        int filas;
        int columnas;

        do {
            System.out.println("Ingrese el numero que desea mostrar en pantalla, tenga en cuenta que el primer número" +
                    " es el tamaño y el siguiente numero es el numero a mostrar");
            //variable para almacenar el String
            Scanner entradaEscaner = new Scanner(System.in);
            numero = entradaEscaner.nextLine();
            //separo la cadena
            partes = numero.split("\\,");
            try {
                size = Integer.parseInt(partes[0]);
            } catch (Exception e) {
                System.out.println("caracter no válido, se cerrará el programa");
                System.exit(0);
            }
            columnas = size + 2;
            filas = (size * 2) + 3;
            cadena = partes[1];
            String salida[][][] = new String[cadena.length()][filas][columnas];

            // recorro la matriz de partes
            for (int i = 0; i < cadena.length(); i++) {

                switch (cadena.charAt(i)) {
                    case '0':
                        construirPinSuperior(salida[i], size);
                        construirPinSuperiorIzquierdo(salida[i], size);
                        construirPinSuperiorDerecho(salida[i], size);
                        construirPinInferiorIzquierdo(salida[i], size);
                        construirPinInferiorDerecho(salida[i], size);
                        construirPinInferior(salida[i], size);
                        break;
                    case '1':
                        construirPinSuperiorDerecho(salida[i], size);
                        construirPinInferiorDerecho(salida[i], size);
                        break;
                    case '2':
                        construirPinSuperior(salida[i], size);
                        construirPinSuperiorDerecho(salida[i], size);
                        construirPinIntermedio(salida[i], size);
                        construirPinInferiorIzquierdo(salida[i], size);
                        construirPinInferior(salida[i], size);
                        break;
                    case '3':
                        construirPinSuperior(salida[i], size);
                        construirPinInferiorDerecho(salida[i], size);
                        construirPinSuperiorDerecho(salida[i], size);
                        construirPinInferior(salida[i], size);
                        construirPinIntermedio(salida[i], size);
                        break;
                    case '4':
                        construirPinSuperiorIzquierdo(salida[i], size);
                        construirPinSuperiorDerecho(salida[i], size);
                        construirPinIntermedio(salida[i], size);
                        construirPinInferiorDerecho(salida[i], size);
                        break;
                    case '5':
                        construirPinSuperior(salida[i], size);
                        construirPinSuperiorIzquierdo(salida[i], size);
                        construirPinIntermedio(salida[i], size);
                        construirPinInferiorDerecho(salida[i], size);
                        construirPinInferior(salida[i], size);
                        break;
                    case '6':
                        construirPinSuperior(salida[i], size);
                        construirPinSuperiorIzquierdo(salida[i], size);
                        construirPinIntermedio(salida[i], size);
                        construirPinInferiorIzquierdo(salida[i], size);
                        construirPinInferior(salida[i], size);
                        construirPinInferiorDerecho(salida[i], size);
                        break;
                    case '7':
                        construirPinSuperior(salida[i], size);
                        construirPinInferiorDerecho(salida[i], size);
                        construirPinSuperiorDerecho(salida[i], size);
                        break;
                    case '8':
                        construirPinSuperior(salida[i], size);
                        construirPinSuperiorIzquierdo(salida[i], size);
                        construirPinSuperiorDerecho(salida[i], size);
                        construirPinInferiorIzquierdo(salida[i], size);
                        construirPinInferiorDerecho(salida[i], size);
                        construirPinInferior(salida[i], size);
                        construirPinIntermedio(salida[i], size);
                        break;
                    case '9':
                        construirPinSuperior(salida[i], size);
                        construirPinSuperiorIzquierdo(salida[i], size);
                        construirPinInferiorDerecho(salida[i], size);
                        construirPinIntermedio(salida[i], size);
                        construirPinSuperiorDerecho(salida[i], size);
                        break;
                    default:
                        System.out.println("caracter incorrecto, se cerrará el programa");
                        System.exit(0);
                }
            }
            for (int j = 0; j < filas; j++) {
                for (int i = 0; i < cadena.length(); i++) {
                    for (int k = 0; k < columnas; k++) {
                        if (salida[i][j][k] == null) {
                            System.out.print(" ");
                        } else {
                            System.out.print(salida[i][j][k]);
                        }
                    }
                    System.out.print(" ");
                }
                System.out.println("");
            }

        } while (!numero.equals("0,0"));
    }

    /**
     * metodo que construye el elemento superior horizontal
     *
     * @param tablero matríz que almacena en LCD
     * @param size    tamaño del LCD
     * @return
     */
    public static String[][] construirPinSuperior(String[][] tablero, int size) {
        for (int i = 1; i <= size; i++) {
            tablero[0][i] = "-";
        }
        return tablero;
    }

    /**
     * metodo que construye el elemento inferior horizontal
     *
     * @param tablero matríz que almacena en LCD
     * @param size    tamaño del LCD
     * @return
     */
    public static String[][] construirPinInferior(String[][] tablero, int size) {
        for (int i = 1; i <= size; i++) {
            tablero[(2 * size) + 2][i] = "-";
        }
        return tablero;
    }

    /**
     * metodo que construye el elemento intermedio horizontal
     *
     * @param tablero matríz que almacena en LCD
     * @param size    tamaño del LCD
     * @return
     */
    public static String[][] construirPinIntermedio(String[][] tablero, int size) {
        for (int i = 1; i <= size; i++) {
            tablero[size + 1][i] = "-";
        }
        return tablero;
    }

    /**
     * metodo  que construye el elmento superior izquierdo vertical
     *
     * @param tablero matríz que almacena en LCD
     * @param size    tamaño del LCD
     * @return
     */
    public static String[][] construirPinSuperiorIzquierdo(String[][] tablero, int size) {
        for (int i = 1; i <= size; i++) {
            tablero[i][0] = "|";
        }
        return tablero;
    }

    /**
     * metodo que construye el elemento inferior izquierdo
     *
     * @param tablero matríz que almacena en LCD
     * @param size    tamaño del LCD
     * @return
     */
    public static String[][] construirPinInferiorIzquierdo(String[][] tablero, int size) {
        for (int i = 1; i <= size; i++) {
            tablero[size + 1 + i][0] = "|";
        }
        return tablero;
    }

    /**
     * metodo que construye el elemento superior derecho vertical
     *
     * @param tablero matríz que almacena en LCD
     * @param size    tamaño del LCD
     * @return
     */
    public static String[][] construirPinSuperiorDerecho(String[][] tablero, int size) {
        for (int i = 1; i <= size; i++) {
            tablero[i][size + 1] = "|";
        }
        return tablero;
    }

    /**
     * metodo que construye el elemento inferior derecho vertical
     *
     * @param tablero matríz que almacena en LCD
     * @param size    tamaño del LCD
     * @return
     */
    public static String[][] construirPinInferiorDerecho(String[][] tablero, int size) {
        for (int i = 1; i <= size; i++) {
            tablero[size + 1 + i][size + 1] = "|";
        }
        return tablero;
    }
}
