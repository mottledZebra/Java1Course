public class Dog extends Animal {
    protected static int dogsCount;

    public Dog(String name) {
        super(name);
        runLimit = 500;
        swimLimit = 10;
        dogsCount++;
    }

    @Override
    public void run(int distance) {
        if (distance > runLimit) System.out.println("Собака не может пробежать больше " + runLimit + " метров");
        else super.run(distance);
    }

    @Override
    public void swim(int distance) {
        if (distance > swimLimit) System.out.println("Собака не может проплыть больше " + swimLimit + " метров");
        else super.swim(distance);
    }
}
