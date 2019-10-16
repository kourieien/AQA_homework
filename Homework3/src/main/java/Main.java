import java.util.ArrayList;
import java.util.List;

public class Main {


    //task #1
//    public static void main(String[] args) {
//
//        //while cycle
//        System.out.println("while");
//        int i = 1;
//
//        while (i<=20) {
//            System.out.println(i);
//            i++;
//        }
//
//        //do-while
//        System.out.println();
//        System.out.println("do-while");
//        int i1 = 1;
//
//        do {
//            System.out.println(i1);
//            i1++;
//        } while (i1<=20);
//
//        //for cycle
//        System.out.println();
//        System.out.println("for");
//        for (int i2=1; i2<=20; i2++) {
//            System.out.println(i2);
//        }
//
//        //for-each
//        System.out.println();
//        System.out.println("for-each");
//        String[] nums = new String[] {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20"};
//
//        for (String i4:nums) {
//            System.out.println(i4);
//        }
//
//    }

    //task #2
//    public static void main(String[] args) {
//
//        System.out.println("Print only %3 w/o remainder");
//        for (int i=1; i<=100; i++) {
//            if (i%3 == 0) {
//                System.out.println(i);
//            }
//        }
//
//    }

//    //task #3
//    public static void main(String[] args) {
//
//        System.out.println("fill the array with numbers from 100 to 0 and print it out");
//        List<Integer> lst1 = new ArrayList<Integer>();
//
//        for (int i=100; i>0; i-=1) {
//            lst1.add(i);
//        }
//
//        System.out.println(lst1.toString());
//    }

//    //task #4
//    public static void main(String[] args) {
//        System.out.println("display a sum of all but border elements for an array of 10 elements");
//        List<Integer> lst2 = new ArrayList<Integer>() {{
//            add(0);
//            add(11);
//            add(22);
//            add(33);
//            add(44);
//            add(55);
//            add(66);
//            add(77);
//            add(88);
//            add(99);
//                }};
//
//        int i=1;
//        int res = 0;
//
//        for (int num:lst2) {
//            if (i!=1 && i!=10) {
//                res += num;
//            }
//            i++;
//        }
//
//        System.out.println("Sum is equal to "+res);
//    }

//    //task #5
//    public static void main(String[] args) {
//
//        System.out.println("Minimum of 4,-3, 99, 16 is "+ min(4,-3,99,16));
//
//    }
//
//    public static int min(int a, int b, int c, int d) {
//      int min_pair1 = min(a,b);
//      int min_pair2 = min(c,d);
//      return min(min_pair1,min_pair2);
//    }
//
//    public static int min(int a, int b) {
//        if (a<b) return a;
//        else return b;
//    }

//    //task #6
//    public static void main(String[] args) {
//        System.out.println("Result for 123456789 is "+ getEvenDigitSum(123456789));
//    }
//
//    public static int getEvenDigitSum (int a) {
//        if (a<0) return -1;
//
//        int i = 0;
//        int res = 0;
//
//        while (a!=0) {
//            i = a%10;
//
//            if (i%2==0) res+=i;
//
//            a/=10;
//        }
//
//        return res;
//    }

//    //task #7
//    public static void main(String[] args) {
//        System.out.println("Greatest divisor for 25 and 150 is "+ getGreatestCommonDivisor(25,150));
//    }
//
//    public static int getGreatestCommonDivisor (int first, int second) {
//        if (first<10 || second<10) return -1;
//
//        int res = 0;
//        int i = 1;
//        int endpoint = 0;
//
//        if (first<second) endpoint=first;
//        else endpoint=second;
//
//        while (i<=endpoint) {
//            if (first%i==0 && second%i==0) res=i;
//            i++;
//        }
//
//        return res;
//    }

//    //task #8
//    public static void main(String[] args) {
//        for (int i=1; i<5; i++) {
//            System.out.println("**********");
//        }
//    }

//    //task #9
//    public static void main(String[] args) {
//
//        String str1 = "";
//        for (int i=1; i<8; i++) {
//            str1+="*";
//            System.out.println(str1);
//        }
//    }

//    //task #10
//    public static void main(String[] args) {
//        for (int i=1; i<6; i++) {
//            if (i==1 || i==5) System.out.println("*********");
//            else System.out.println("*       *");
//        }
//    }

    //task #11
    public static void main(String[] args) {
        String str1 = "";

        for (int i=1; i<9; i++) {
            str1 += "*";
            if (str1.length()%2==1) {
                System.out.println(centerString(7, str1));
            }
        }
    }

    public static String centerString (int len, String text) {
        return String.format("%-"+len+"s", String.format("%" + (text.length() + (len-text.length())/2) +"s",text));
    }

}