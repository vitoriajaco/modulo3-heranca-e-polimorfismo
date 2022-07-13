package FiguraGeometrica;

public abstract class Area {

    public double base;
    public double altura;
    public  double raioCirculo;
    public double ladoTriangulo;

    public double area;

    public Area(double base, double altura, double circunferencia, double ladoTriangulo) {
        this.base = base;
        this.altura = altura;
        this.raioCirculo = circunferencia;
        this.ladoTriangulo = ladoTriangulo;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getRaioCirculo() {
        return raioCirculo;
    }

    public void setCircunferencia(double circunferencia) {
        this.raioCirculo = circunferencia;
    }

    public double getLadoTriangulo() {
        return ladoTriangulo;
    }

    public void setLadoTriangulo(double ladoTriangulo) {
        this.ladoTriangulo = ladoTriangulo;
    }


}
