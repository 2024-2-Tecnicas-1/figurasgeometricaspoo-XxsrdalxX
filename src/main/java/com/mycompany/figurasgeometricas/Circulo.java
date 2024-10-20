package herencia;

/**
 *
 * @author Dylan
 */
public class Circulo extends FiguraGeometrica {
    private double radio;

    public Circulo(String nombre, String color, double radio) {
         super(nombre, color); // Llamada al constructor de la clase padre
        this.radio = radio;
    }

  public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}
