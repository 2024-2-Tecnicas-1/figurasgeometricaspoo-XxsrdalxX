/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author Dylan
 */
public  class Triangulo extends FiguraGeometrica {
    
    private double base;
    private double altura;
    
    public Triangulo(String nombre, String color, double base, double altura) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;         
    }
    
    public double ObtenerArea(double base, double altura){
    
    double Area = base*altura/2;
    
    return Area;
    }
    public double ObtenerPerimetro(double base ){
    double perimetro = base+ base + base;
    return perimetro;
            }
}
