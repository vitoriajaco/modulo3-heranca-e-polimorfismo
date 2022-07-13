package FiguraGeometrica;

public class Triangulo extends Area{

    public Triangulo(double base, double altura, double circunferencia, double ladoTriangulo) {
        super(base, altura, circunferencia, ladoTriangulo);
    }

    {

    }
    double areaTriangulo; {
    area = (base * altura)/2;
    }

    public double getAreaTriangulo() {
        return areaTriangulo;
    }

    public void setAreaTriangulo(double areaTriangulo) {
        this.areaTriangulo = areaTriangulo;
    }
}
