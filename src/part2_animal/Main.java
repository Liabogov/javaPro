package part2_animal;
    public class Main {
        public static void main (String[] args) {
        Animal cat = new Cat("Jina");
        cat.run(300);
        cat.swim(300);

        Animal dog = new Dog("Abram");
        dog.run(199);
        dog.swim(9);
        }

    }
