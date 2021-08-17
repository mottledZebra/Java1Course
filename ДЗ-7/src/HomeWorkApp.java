public class HomeWorkApp {
    public static void main(String[] args) {
        Plate plate = new Plate(50);

        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Барсик", 15);
        cats[1] = new Cat("Мурка", 8);
        cats[2] = new Cat("Котик", 10);
        cats[3] = new Cat("Рыжик", 12);
        cats[4] = new Cat("Буся", 10);

        plate.info();

        System.out.println();
        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.print(cat.getName() + ": ");
            if (cat.getSatiety()) System.out.println("поел");
            else System.out.println("голоден");
        }
        System.out.println();

        plate.info();
        System.out.println("Добавляем еду в тарелку");
        plate.addFood(10);
        plate.info();
    }
}
