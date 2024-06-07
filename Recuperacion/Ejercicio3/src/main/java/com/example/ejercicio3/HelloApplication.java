package com.example.ejercicio3;

import java.util.Scanner;

public class HelloApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] partidas = new String[3][2];
        int contadorPlayer1 = 0, contadorPlayer2 = 0, contadorEmpates = 0;

        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese su jugada Player 1 (R, P o S): ");
            partidas[i][0] = scanner.next().toUpperCase();

            System.out.print("Ingrese su jugada Player 2 (R, P o S): ");
            partidas[i][1] = scanner.next().toUpperCase();

            if (partidas[i][0].equals(partidas[i][1])) {
                contadorEmpates++;
            } else if ((partidas[i][0].equals("R") && partidas[i][1].equals("S")) ||
                    (partidas[i][0].equals("S") && partidas[i][1].equals("P")) ||
                    (partidas[i][0].equals("P") && partidas[i][1].equals("R"))) {
                contadorPlayer1++;
            } else {
                contadorPlayer2++;
            }
        }

        if (contadorPlayer1 > contadorPlayer2) {
            System.out.println("\nResultado final: Player 1 gana con " + contadorPlayer1 + " partidas de 3 (" + contadorEmpates + " empates)");
        } else if (contadorPlayer2 > contadorPlayer1) {
            System.out.println("\nResultado final: Player 2 gana con " + contadorPlayer2 + " partidas de 3 (" + contadorEmpates + " empates)");
        } else {
            System.out.println("\nResultado final: Empate: 3 partidas sin ganador (" + contadorEmpates + " empates)");
        }
    }
}




