package com.example.ejercicio2;

import java.util.Scanner;

public class HelloApplication {

    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        System.out.print("Ingresa el número de escalones: ");
        int steps = entry.nextInt();

        if (steps > 0) {
            for (int step = 0; step < steps; step++) {
                String spaces = "  ".repeat(steps - step - 1);
                String step_draw = " _|";
                System.out.println(spaces + step_draw);
            }
            System.out.println("_|");
        } else if (steps < 0) {
            for (int step = 0; step < -steps; step++) {
                String spaces = "  ".repeat(step);
                String step_draw = "|_";
                System.out.println(spaces + step_draw);
            }
            System.out.println("  ".repeat(-steps) + "|_");
        } else {
            System.out.println("__");
        }
    }
}

