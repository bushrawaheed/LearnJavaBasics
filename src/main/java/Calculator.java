public class Calculator {
    // Addition
     static void add(int x, int y) {
        System.out.println(x + y);
    }

    // Subtraction
     static void subtract(int x, int y) {
        System.out.println(x - y);
    }
    // Division
     static void division(int x, int y) {
        System.out.println(x / y);
    }

    // Multiplication
     static void multiply(int x, int y) {
        System.out.println(x * y);
    }

    public static void calculate(int x, int y) {
        Calculator.add(x,y);
        Calculator.subtract(x,y);
        Calculator.division(x,y);
        Calculator.multiply(x,y);
    }

    public static void main (String args[]) {
        Calculator.calculate(9, 3);
    }

}
