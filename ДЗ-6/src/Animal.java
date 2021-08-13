public class Animal {
    protected static int animalsCount;

    protected String name;
    protected int runLimit;
    protected int swimLimit;

    public Animal(String name) {
        this.name = name;
        animalsCount++;
    }

    public void run(int distance) {
        System.out.println(name + " пробежал " + distance + " м");
    }

    public void swim(int distance) {
        System.out.println(name + " проплыл " + distance + " м");
    }
}
