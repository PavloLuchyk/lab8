package lab8;

import java.util.Comparator;

public class QuadraticEquationDiscriminant extends QuadraticEquation {

    public QuadraticEquationDiscriminant(double a, double b, double c){
        super(a, b, c);
    }

    @Override
    public double[] solveEquasion() {
        double discriminant;
        double[] results = new double [2];
        discriminant = Math.pow(b, 2)- 4*a*c;
        if (discriminant < 0){
            throw new IllegalArgumentException("This equation does not have any real roots");
        } else{
            results[0] = (-b+Math.sqrt(discriminant))/(2*a);
            results[1] = (-b-Math.sqrt(discriminant))/(2*a);
        }
        return results;
    }

    public static class ComparatorA implements Comparator<QuadraticEquationDiscriminant> {
        @Override
        public int compare(QuadraticEquationDiscriminant o1, QuadraticEquationDiscriminant o2) {
            if (o1.getA() > o2.getA()){
                return 1;
            } else if (o1.getA() == o2.getA()){
                return 0;
            } else  {
                return -1;
            }
        }
    }

    public static Comparator<QuadraticEquationDiscriminant> getComparatorB(){
        return new Comparator<QuadraticEquationDiscriminant>() {
            @Override
            public int compare(QuadraticEquationDiscriminant o1, QuadraticEquationDiscriminant o2) {
                if (o1.getB() > o2.getB()){
                    return 1;
                } else if (o1.getB() == o2.getB()){
                    return 0;
                } else  {
                    return -1;
                }
            }
        };
    }

    @Override
    public String toString(){
        return "a=" + this.getA() + " b= "+ this.getB() + " c=" + this.getC();
    }
}
