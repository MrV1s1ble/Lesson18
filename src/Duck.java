public class Duck extends Animal {
    public Duck(int age, int weight, String name) {
        super(age, weight, name);
    }

    public Duck() {
    }

    @Override
    public void move() {
        System.out.printf("Утка по кличке %s летит в облаках.\n", super.getName());
    }
}
