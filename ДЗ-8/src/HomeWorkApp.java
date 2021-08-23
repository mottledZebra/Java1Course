import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isFine = false;

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Random random = new Random();
        String word = words[random.nextInt(words.length - 1)];

        do {
            System.out.println("Какое слово я задумал?");
            String str = scanner.nextLine();
            System.out.println("Вы ввели слово " + str);

            if (word.equals(str)) {
                System.out.println("Это верное слово!");
                isFine = true;
            } else {
                System.out.println("Вы угадали буквы: ");
                for (int i = 0; i < 15; i++) {
                    if (i < word.length() && i < str.length() && word.charAt(i) == str.charAt(i))
                        System.out.print(word.charAt(i));
                    else
                        System.out.print("#");
                }
                System.out.println();
            }
        } while (!isFine);

        new MyWindow();
    }
}
