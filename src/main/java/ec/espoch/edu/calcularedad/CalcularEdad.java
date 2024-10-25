/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.espoch.edu.calcularedad;

import java.util.Scanner;

/**
 *
 * @author SO-LAB1-PC4
 */
import java.util.Scanner;

public class CalcularEdad {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in); // Inicializa el escáner
        System.out.println("Ingrese su edad:");
        int edad = e.nextInt();

        if (edad >= 0 && edad < 120) {
            if (edad <= 12) {
                System.out.println("Eres un niño");
            } else if (edad <= 35) {
                System.out.println("Eres joven");
            } else {
                System.out.println("Eres adulto");
            }
        } else {
            System.out.println("Error: Edad no válida");
        }

        e.close(); // Cierra el escáner
    }
}
