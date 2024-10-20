/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia;

import java.util.Scanner;

public class Herencia {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la figura:");
        String nombre = scan.nextLine();

        System.out.println("Ingrese el color de la figura:");
        String color = scan.nextLine();

        System.out.println("Seleccione el tipo de figura:");
        System.out.println("1. Circulo");
        System.out.println("2. Rectangulo");
        System.out.println("3. Triangulo");
        int opcion = scan.nextInt();

        FiguraGeometrica figura = null;

        switch (opcion) {
            case 1: // Círculo
                System.out.println("Ingrese el radio del circulo:");
                double radio = scan.nextDouble();
                figura = new Circulo(nombre, color, radio);
                break;

            case 2: // Rectángulo
                System.out.println("Ingrese el largo del rectangulo:");
                double largo = scan.nextDouble();
                System.out.println("Ingrese el ancho del rectangulo:");
                double ancho = scan.nextDouble();
                figura = new Rectangulo(nombre, color, largo, ancho);
                break;

            case 3: // Triángulo
                System.out.println("Ingrese la base del triangulo:");
                double base = scan.nextDouble();
                System.out.println("Ingrese la altura del triangulo:");
                double altura = scan.nextDouble();
                figura = new Triangulo(nombre, color, base, altura);
                break;

            default:
                System.out.println("Opción no válida.");
                return;
        }

        // Imprimir área y perímetro
        if (figura != null) {
            System.out.println("Area de la figura: " + figura.calcularArea());
            System.out.println("Perimetro de la figura: " + figura.calcularPerimetro());
        }
    }
}
