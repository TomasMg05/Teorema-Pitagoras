/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.util.Scanner;

public class TrianguloVista {
    private Scanner scanner = new Scanner(System.in);

    public double obtenerLongitud(String lado) {
        System.out.println("Ingrese la longitud del " + lado + ":");
        return scanner.nextDouble();
    }

    public void mostrarResultado(boolean esValido) {
        if (esValido) {
            System.out.println("El triángulo cumple con el Teorema de Pitágoras.");
        } else {
            System.out.println("El triángulo NO cumple con el Teorema de Pitágoras.");
        }
    }
}

