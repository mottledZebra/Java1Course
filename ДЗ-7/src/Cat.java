public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eat(Plate p) {
        if (!satiety && p.getFood() >= appetite) {
            p.decreaseFood(appetite);
            satiety = true;
        }
    }

    public boolean getSatiety() {
        return satiety;
    }

    public String getName() {
        return name;
    }
}
