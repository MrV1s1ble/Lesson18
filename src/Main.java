public class Main {
    public static void main(String[] args) {
        Duck duck = new Duck(5, 3, "Plane");
        Dog dog = new Dog(3, 15, "Mount");
        duck.move();
        dog.move();
    }
}
