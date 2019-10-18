//task #7
public class Task7 {

    public static class Vehicle {
        private String name;
        private String size;
        private int currentVelocity;
        private int currentDirection;
        private String gear;
        private int wheels;


        public Vehicle(String name, String size) {
            this.name = name;
            this.size = size;
            this.currentVelocity = 0;
            this.currentDirection = 0;
            this.gear = "N";
            this.wheels = 0;
        }

        public void steer(int direction) {
            this.currentDirection += direction;
            System.out.println("Vehicle.steer(): Steering at " + currentDirection + "degrees.");
        }

        public void move(int velocity, int direction) {
            currentVelocity = velocity;
            currentDirection = direction;
            System.out.println("Vehicle.move(): Moving at " + currentVelocity + " in direction " + currentDirection);
        }

        public void stop() {
            this.currentVelocity = 0;
        }

        public String getName() {
            return name;
        }

        public String getSize() {
            return size;
        }

        public int getCurrentVelocity() {
            return currentVelocity;
        }

        public int getCurrentDirection() {
            return currentDirection;
        }

        public void setGear(String gear) {
            this.gear = gear;
        }

        public String getGear() {
            return gear;
        }

        public void setWheels(int wheels) {
            this.wheels = wheels;
        }

        public int getWheels() {
            return wheels;
        }
    }

    public static class Car extends Vehicle {

        Car(String name, String size) {
            super(name, size);
        }
    }

    public static class Truck extends Car {

        Truck(String name, String size) {
            super(name, size);
            this.setWheels(18);
        }

        public void displayInfo() {
            System.out.println("Name: " +this.getName());
            System.out.println("Size: " +this.getSize());
            System.out.println("Direction: " +this.getCurrentDirection());
            System.out.println("Velocity: " +this.getCurrentVelocity());
            System.out.println("Gear: " +this.getGear());
            System.out.println("Wheels: " +this.getWheels());
        }
    }



    public static void main(String[] args) {

        Truck Mercedes = new Truck("Mercedes", "XL");

        Mercedes.displayInfo();
        System.out.println();

        Mercedes.setGear("1");
        Mercedes.move(7,25);

        System.out.println();
        Mercedes.displayInfo();
    }
}
