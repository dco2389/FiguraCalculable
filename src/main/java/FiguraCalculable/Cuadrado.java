package FiguraCalculable;

/**
 * Created with IntelliJ IDEA.
 * User: Daniel
 * Date: 5/08/13
 * Time: 12:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class Cuadrado extends Figura {

    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return lado * lado;
    }

    @Override
    public double perimetro() {
        return 4 * lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}



