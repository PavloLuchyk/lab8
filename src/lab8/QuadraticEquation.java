package lab8;

public abstract class QuadraticEquation {
    protected double a;
    protected double b;
    protected double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    abstract public double[] solveEquasion();
}
