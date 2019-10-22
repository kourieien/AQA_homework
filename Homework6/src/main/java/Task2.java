public class Task2 {

    public static void main(String[] args) {

        try {
            System.out.println(divideByZero());
        }
        catch (ArithmeticException ex) {
            System.out.println("Arithmetic exception caught! Can't divide by zero!");
        }
    }

    public static int divideByZero() {
        int a = 5;
        int b = 0;
        return a / b;
    }
}
