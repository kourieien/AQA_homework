import javafx.scene.input.InputMethodTextRun;

import java.util.*;

public class Main {

    // task #2 part #1
    enum testEnum1 {
        ONE,
        TWO,
        THREE
    }

    enum WeekDays {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }

    public static void main(String[] args) {

        // task #1
        ArrayList<String> arr1 = new ArrayList<String>();
        System.out.println(arr1);
        System.out.println();

        // task #2 part #2
        for (testEnum1 entEnum : testEnum1.values()) {
            System.out.println(entEnum);
        }
        System.out.println();

        // task #3 map
        HashMap<String,Integer> vehicles = new HashMap<String, Integer>();
        vehicles.put("BMW",5);
        System.out.println(vehicles.get("BMW"));
        System.out.println();

        // task #4
        Random random = new Random();

        int[] randInt = new int[15];
        for (int i=0;i< randInt.length;i++) {
            randInt[i] = random.nextInt(10);
        }

        System.out.println(Arrays.toString(randInt));

        int res = 0;
        for (int i=1;i<randInt.length;i++) {
            if (randInt[i]%2==0) res++;
        }

        System.out.println("Number of even numbers is " + res);
        System.out.println();


        // task #5
        ArrayList<String> arr2 = new ArrayList<String>();
        arr2.add("First");
        arr2.add("Second");
        arr2.add("Third");
        arr2.add("Forth");
        arr2.add("Fifth");
        for (String a : arr2) {
            System.out.println(a);
        }
        System.out.println();

        // task #6
        ArrayList<String> arr3 = new ArrayList<String>();
        arr3.add("a");
        arr3.add("bbb");
        arr3.add("cc");
        arr3.add("d");
        arr3.add("e");
        arr3.add("ff");
        arr3.add("ggg");
        arr3.add("hh");
        arr3.add("g");
        arr3.add("k");

        int maxLen = 0;
        ArrayList<String> result = new ArrayList<String>();

        for (String st : arr3) {
            int len = st.length();
            if (maxLen<len) {
                maxLen=len;
                result.clear();
                result.add(st);
            }
            else if (maxLen==len) {
                result.add(st);
            }
        }

        System.out.println(result.toString());
        System.out.println();

        // task #7
        HashMap<String,String> basket = new HashMap<String, String>();
        basket.put("watermelon","berry");
        basket.put("banana","fruit");
        basket.put("cherry","berry");
        basket.put("pineapple","fruit");
        basket.put("melon","vegetable");
        basket.put("cranberry","berry");
        basket.put("apple","fruit");
        basket.put("iris","flower");
        basket.put("potato","vegetable");
        basket.put("carrot","vegetable");

        for (String i : basket.keySet()) {
            System.out.println(i +" - "+ basket.get(i));
        }
        System.out.println();

        // task #8
        for (Map.Entry<String,String> entry : basket.entrySet()) {
            if (entry.getValue()=="vegetable") {
               System.out.println(entry.getKey() +" is a "+ entry.getValue());
            }
        }
        System.out.println();

        // task #9
        ArrayList<Integer> arr4 = new ArrayList<Integer>();
        for (int i=0; i<100; i++) {
            arr4.add((int)(Math.random()));
        }
        HashSet<Integer> set1 = new HashSet<Integer>();
        for (Integer n : arr4) {
            set1.add(n);
        }

        // task #10

        WeekDays day = WeekDays.FRIDAY;

        switch (day) {
            case MONDAY:
                System.out.println("1");
                break;
            case TUESDAY:
                System.out.println("2");
                break;
            case WEDNESDAY:
                System.out.println("3");
                break;
            case THURSDAY:
                System.out.println("4");
                break;
            case FRIDAY:
                System.out.println("5");
                break;
            case SATURDAY:
                System.out.println("6");
                break;
            case SUNDAY:
                System.out.println("7");
                break;


        }
    }
}
