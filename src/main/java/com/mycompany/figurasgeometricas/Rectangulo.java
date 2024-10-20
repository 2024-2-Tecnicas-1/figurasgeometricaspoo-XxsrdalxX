/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author Dylan
 */
public class Rectangulo extends FiguraGeometrica {
    
    private double lado1;
    private double lado2;
    // Lado1 = largo
    // Lado2 = Ancho
    public Rectangulo(String nombre, String color, double lado2, double lado1) {
        super(nombre, color);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    public double ObtenerArea(double lado1, double lado2){
        
        double area = lado1*lado2;
        return  area;   
    }
    public double ObtenerPerimetro(double lado1, double lado2){
    
        double perimetro = lado1+lado2*2;
        return perimetro;
    
    }
    
    
}
