public class Dog extends Animal {
    public Dog(int age, int weight, String name) {
        super(age, weight, name);
    }

    public Dog() {
    }

    @Override
    public void move() {
        System.out.printf("Собака по кличке %s бежит по земле.\n", super.getName());
    }
}
