import java.lang.annotation.*;

public class Task1 {

    @Target(value = ElementType.METHOD)
    @Retention(value = RetentionPolicy.RUNTIME)
    @interface Test {
        int a();
        int b();
    }

    @Test(a=2,b=5)
    public void test(int a , int b){

        Test anno1 = getClass().getMethod("test",). //investigate and complete

        System.out.println(a+b);
    }

    public static void main(String[] args) {

        Class<?> class1 = Task1.class;
//        Method[] class1 = test.method;
        Test test1 = class1.getAnnotation(Test.class);

        test(test1.a(), test1.b());


    }

}
