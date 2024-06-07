package com.example.ejercicio4;

import java.util.Random;

public class HelloApplication {

    public static void main(String[] args) {
        int[] pasos = {10, 5, -2}; // Ejemplo de array de pasos
        int[] coordenadasFinales = calcularCoordenadas(pasos);
        System.out.println("Coordenadas finales: (x: " + coordenadasFinales[0] + ", y: " + coordenadasFinales[1] + ")");
    }

    public static int[] calcularCoordenadas(int[] pasos) {
        double x = 0;
        double y = 0;

        // Dirección inicial en radianes (mirando hacia arriba, eje y positivo)
        double direccion = Math.PI / 2; // Dirección inicial  (90 grados)

        // Cambiar la dirección inicial aleatoriamente
        direccion += Math.random() * Math.PI * 2; // Entre 0 y 2π (360 grados)

        for (int paso : pasos) {
            // Actualizar las coordenadas según la dirección y el número de pasos
            x += Math.cos(direccion) * paso;
            y += Math.sin(direccion) * paso;

            // Girar la dirección 90 grados en sentido antihorario
            direccion -= Math.PI / 2;
        }

        // Redondear las coordenadas a enteros
        int[] coordenadasFinales = {(int) Math.round(x), (int) Math.round(y)};
        return coordenadasFinales;
    }
}

