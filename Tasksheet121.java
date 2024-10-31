import static java.lang.Math.*;

public class Tasksheet121 {

    public static int add(int a, int b) {
        return addExact(a, b);
    }

    public static int subtract(int a, int b) {
        return subtractExact(a, b);
    }

    public static int multiply(int a, int b) {
        return multiplyExact(a, b);
    }

    public static int divide(int a, int b) {
        return floorDiv(a, b);
    }

    public static void main(String[] args) {
        int additionResult = add(15, 10);
        int subtractionResult = subtract(20, 5);
        int multiplicationResult = multiply(6, 7);
        int divisionResult = divide(42, 6);

        System.out.println("Addition (15 + 10): " + additionResult);
        System.out.println("Subtraction (20 - 5): " + subtractionResult);
        System.out.println("Multiplication (6 * 7): " + multiplicationResult);
        System.out.println("Division (42 / 6): " + divisionResult);
    }
}
