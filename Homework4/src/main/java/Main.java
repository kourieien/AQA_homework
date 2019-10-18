//task #1
public class Main {

    public static void main(String[] args) {

        Human mark = new Human("Mark", "Ruffalo", 40, 175, 79);
        mark.displayInfo();

    }
}

class Human {
    String firstName;
    String lastName;
    int age;
    int height;
    int weight;
    Human(String firstName,String lastName,int age,int height,int weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
    void displayInfo(){
        System.out.printf("Name: %s \nSurname: %s\nAge %s\nHeight %s\nWeight %s\n",firstName,lastName,age,height,weight);
    }

}


