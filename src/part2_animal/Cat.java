package part2_animal;

public class Cat extends Animal {
    private final int maxRunDistance = 200;

    public Cat(String name) {
        super(name);
    }

    @Override
    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(this.getName() + " run " + distance);
        } else {
            System.out.println(this.getName() + " cannot run " + distance);
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(this.getName() + " drowned");
    }
}
