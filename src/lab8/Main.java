package lab8;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        QuadraticEquationDiscriminant[] array = testFill();
        Arrays.sort(array, new QuadraticEquationDiscriminant.ComparatorA());
        printArray(array);
        System.out.println();
        Arrays.sort(array, QuadraticEquationDiscriminant.getComparatorB());
        printArray(array);
    }

    public static QuadraticEquationDiscriminant[] testFill(){
        return new QuadraticEquationDiscriminant[]{
                new QuadraticEquationDiscriminant(4,4,5),
                new QuadraticEquationDiscriminant(7, 6, 9),
                new QuadraticEquationDiscriminant(1, 9, 2),
                new QuadraticEquationDiscriminant(6, 2, 3)
        };
    }

    public static void printArray(QuadraticEquationDiscriminant[] quadraticEquationDiscriminants){
        for(QuadraticEquationDiscriminant i: quadraticEquationDiscriminants){
            System.out.println(i);
        }
    }
}
