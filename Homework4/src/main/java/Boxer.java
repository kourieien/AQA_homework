//task #2
public class Boxer {

    public int age;
    public int weight;
    public int strength;

    public Boxer(int age, int weight,int strength) {
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public boolean fight (Boxer anotherBoxer) {
        int res = 0;

        if (age<anotherBoxer.age) res += Math.abs(anotherBoxer.age-age);
        else res -= Math.abs(anotherBoxer.age-age);

        if (weight>anotherBoxer.weight) res += Math.abs(anotherBoxer.weight-weight);
        else res -= Math.abs(anotherBoxer.weight-weight);

        if (strength>anotherBoxer.strength) res += Math.abs(anotherBoxer.strength-strength)*5;
        else res -= Math.abs(anotherBoxer.strength-strength)*5;

        return res >= 0;
    }

    public static void main(String[] args) {
        Boxer james = new Boxer(20,65,15);
        Boxer tommy = new Boxer(27, 83, 20);

        System.out.println(james.fight(tommy));
        System.out.println(tommy.fight(james));
    }

}
