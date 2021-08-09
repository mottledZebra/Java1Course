import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp {
    public static final int SIZE = 5;
    public static final int DOTS_FOR_WIN = 4;
    public static final char EMPTY_BIT = '.';
    public static final char HUMAN_BIT = 'X';
    public static final char AI_BIT = 'O';

    public static void main(String[] args) {
        int steps;
        char[][] map = new char[SIZE][SIZE];

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = EMPTY_BIT;
            }
        }
        printMap(map);

        steps = 0;
        while (true) {
            humanStep(map);
            printMap(map);
            if (isWin(map, DOTS_FOR_WIN, HUMAN_BIT)) {
                System.out.println("ПОБЕДИЛ ЧЕЛОВЕК!");
                break;
            }
            if(++steps >= SIZE * SIZE) {
                System.out.println("НИЧЬЯ");
                break;
            }

            aiStep(map);
            printMap(map);
            if (isWin(map, DOTS_FOR_WIN, AI_BIT)) {
                System.out.println("ПОБЕДИЛ ИИ!");
                break;
            }
            if(++steps >= SIZE * SIZE) {
                System.out.println("НИЧЬЯ");
                break;
            }
        }
    }

    public static void printMap(char[][] arr) {
        System.out.println();
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 1; i <= SIZE; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(arr[i - 1][j] + " ");
            }
            System.out.println();
        }
    }

    public static void humanStep(char[][] arr) {
        int x, y;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Введите шаг координатами X и Y");
            x = scanner.nextInt();
            y = scanner.nextInt();
        } while (x < 1 || x > SIZE || y < 1 || y > SIZE || arr[y - 1][x - 1] != EMPTY_BIT);
        arr[y - 1][x - 1] = HUMAN_BIT;
    }

    public static void aiStep(char[][] arr) {
        int x, y;
        Random random = new Random();
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (arr[y][x] != EMPTY_BIT);
        arr[y][x] = AI_BIT;
    }

    public static boolean isWin(char[][] arr, int n, char bit) {
        for (int row = 0; row < arr.length - n + 1; row++) {
            for (int col = 0; col < arr[row].length - n + 1; col++) {
                if (isBitsInLine(arr, row, col, n, bit)) return true;
            }
        }
        return false;
    }

    public static boolean isBitsInLine(char[][] arr, int row, int col, int length, char bit) {
        int i;

        // проверка главной диагонали
        for (i = 0; i < length; i++) {
            if (arr[i + row][i + col] != bit) break;
        }
        if (i == length) return true;

        // проверка второй диагонали
        for (i = 0; i < length; i++) {
            if (arr[i + row][length - i + col - 1] != bit) break;
        }
        if (i == length) return true;

        // проверка горизонталей
        for (int j = 0; j < length; j++) {
            for (i = 0; i < length; i++) {
                if (arr[j + row][i + col] != bit) break;
            }
            if (i == length) return true;
        }

        // проверка вертикалей
        for (int j = 0; j < length; j++) {
            for (i = 0; i < length; i++) {
                if (arr[i + row][j + col] != bit) break;
            }
            if (i == length) return true;
        }

        return false;
    }
}
