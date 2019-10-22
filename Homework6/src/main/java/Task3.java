public class Task3 {

    public static void main(String[] args) {

        // not sure if any exceptions can be caught in this block
        int a = args.length;
        System.out.println(a);

        try {
            int b = 10 / a;
        }
        catch (ArithmeticException ex) {
            System.out.println("Can't divide by zero!");
        }

        int[] c = {1};
        try {
            System.out.println(c[1]);
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Wrong array index!");
        }

    }

}
