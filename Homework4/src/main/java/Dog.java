//task #3
public class Dog {

    private String name;
    private int age;

    public Dog (String name,int age) {
        this.name = name;
        this.age = age;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Dog frankie = new Dog("Frankie", 2);
        System.out.println(frankie.name);
        System.out.println(frankie.age);

        frankie.setName("Maureen");
        frankie.setAge(5);
        System.out.println(frankie.getName());
        System.out.println(frankie.getAge());
    }
}
