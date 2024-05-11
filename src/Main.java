public class Main {
    public static void main(String[] args) {
        Animal duck = new Duck(5, 3, "Plane");
        Dog dog = new Dog(3, 15, "Mount");
        duck.move();
        dog.move();
        dog.walk();
    }
}

//        Используя абстракцию, показанную в уроке, переделайте программу
//        с учетом новой информации: Все общности вынести в абстракцию,
//        частности, если они есть у всех классов наследников, реализовывать через контракт.
