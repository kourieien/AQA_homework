// task #1

public class Main {

    public static class CustomException extends Exception {
         public CustomException(String errorMessage) {
            super(errorMessage);
        }
    }

    private static void task1(int num1) throws CustomException {
        if (num1 < 0) System.out.println("Number<0");
        else if (num1 > 0) System.out.println("Number>0");
        else if (num1 == 0) throw new CustomException("Custom exception for num equals to 0");
    }


    public static void main(String[] args) {
        try {
            task1(0);
        }
        catch (CustomException ex){
            System.out.println("Custom exception caught!");

        }


    }

}
