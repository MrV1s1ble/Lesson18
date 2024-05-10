public class Dog extends Animal {
    public Dog(int age, int weight, String name) {
        super(age, weight, name);
    }

    public Dog() {
    }

    @Override
    void move() {
        System.out.printf("Собака по кличке %s бежит по земле.\n", getName());
    }
}
