//public class Main {
//
//    public static void main(String[] args) {
//
//        //task #1
//        System.out.println("Hello World!");
//        System.out.println("Hello World!");
//        System.out.println("Hello World!");
//        System.out.println("Hello World!");
//        System.out.println("Hello World!");
//
//        //task #2
//        byte a = 1;
//        short b = 2;
//        int c = 3;
//        long d = 4L;
//        float e = 5.0f;
//        double f = 6.0;
//        char g = 'g';
//        boolean h = true;
//
//        //task #3
//        int width = 5;
//        int length = 7;
//
//        int result = width*length;
//
//        System.out.println("Result for square is "+result);
//
//
//
//    }
//}

////task #4 Education
//public class Main {
//
//    public static int a = 5;
//    public static int b = 10;
//
//    public static void main(String[] args) {
//
//        float result = (float) a/b;
//
//        System.out.println(result);
//    }
//}

////task #5
//public class Main {
//
//    public static int a = 1;
//    public static int b = 3;
//    public static int c = 9;
//    public static int d = 27;
//
//    public static void main(String[] args) {
//
//        int result = (b+d)-(a+c);
//
//        System.out.println(result);
//
//    }
//
//}

////task #6
//public class Main {
//    public static void main(String[] args) {
////        Strings = "Java";
////        System.out.println("Happy");
////        System.out.println("Java Learning");
////        System.out.println("programming");
//        System.out.print("Happy Java");
///*        System.out.println("weekend");
//        System.out.println(s);
//        System.out.print("Python");
//*/        System.out.print(" ");
//        System.out.println("Learning");
//
//    }
//}

////task #7 Education
//public class Main {
//    public static void main(String[] args) {
//
//        int a = 10;
//        int b = 15;
//        double c = b + 38;
//        //int d = a + 12;
//        //double e = 12.3;
//        String s = "s" + a;
//        String s1 = a + "b";
//        //String s2 = "a";
//        String s3 = s1 + "a";
//        String s4 = s3 + "b";
//
//        System.out.println(c + s4 + s);
//
//    }
//}

//task #8
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        printList(transformIntToChar(72,101,108,108,111,32,119,111,114,108,100));
    }

    private static ArrayList<Character> transformIntToChar(int... values) {
        ArrayList<Character> buffer = new ArrayList<>();
        for (int i: values) {
            buffer.add(((char) i));
        }
        return buffer;
    }

    private static void printList(ArrayList<Character> characters) {
        for (char c: characters) {
            System.out.print(c);
        }
    }

}

