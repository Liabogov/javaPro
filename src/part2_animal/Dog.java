package part2_animal;

public class Dog extends Animal {
    private final int maxRunDistance = 500;
    private final int maxSwimDistance = 10;

    public Dog(String name) {
        super(name);
        //this.maxRunDistance = maxRunDistance;
    }

    @Override
    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(this.getName() + " run "+distance);
        } else {
            System.out.println(this.getName() + " cannot run " + distance);
        }}
    @Override
    public void swim(int distance) {
        if (distance <= maxSwimDistance) {
        System.out.println(this.getName() + " swim " + distance);
    } else {
            System.out.println(this.getName() + " cannot swim " + distance);
        }
}
}
