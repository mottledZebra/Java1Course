public class Cat extends Animal {
    protected static int catsCount;

    public Cat(String name) {
        super(name);
        runLimit = 200;
        swimLimit = 0;
        catsCount++;
    }

    @Override
    public void run(int distance) {
        if (distance > runLimit) System.out.println("Кот не может пробежать больше " + runLimit + " метров");
        else super.run(distance);
    }

    @Override
    public void swim(int distance) {
        System.out.println("Коты не умеют плавать");
    }
}
