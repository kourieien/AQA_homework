public class Task5 {

    public static void main(String[] args) {
        try {
            iCanThrowException();
            System.out.println("ok");
        }
        catch ( NullPointerException ex) {
            ex.printStackTrace();
        }
//        iCanThrowException();
    }

    public static void iCanThrowException() throws NullPointerException {
        if (3>2) throw new NullPointerException();


    }

}