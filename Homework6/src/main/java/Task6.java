import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task6 {

    public static ArrayList<Integer> readData() {

        Scanner Obj = new Scanner(System.in);

        ArrayList<Integer> numList = new ArrayList<Integer>();

        System.out.println("Enter numbers\nIf you want to stop, enter anything but num");

        while (true) {
            try {
                int num = Obj.nextInt();
                numList.add(num);
            }
            catch (InputMismatchException ex) {
                break;
            }
        }

        return numList;

    }

    public static void main(String[] args) {

        System.out.println(readData().toString());
    }
}
