public class HomeWorkApp {

    public static void main(String[] args) {
        Cat catMurzik = new Cat("Мурзик");
        Cat catBarsik = new Cat("Барсик");
        Dog dogPolkan = new Dog("Полкан");
        Dog dogBarbos = new Dog("Барбос");
        Dog dogPalma = new Dog("Пальма");

        catMurzik.run(150);
        catMurzik.swim(100);
        catBarsik.run(250);

        dogPolkan.run(200);
        dogBarbos.run(600);
        dogPalma.run(500);
        dogPolkan.swim(10);
        dogBarbos.swim(5);
        dogPalma.swim(15);

        System.out.println("Всего животных создано: " + Animal.animalsCount);
        System.out.println("В том числе: котов " + Cat.catsCount + ", собак " + Dog.dogsCount);
    }
}
