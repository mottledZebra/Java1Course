import java.util.Arrays;
import java.util.Random;

public class HomeWorkApp {
    public static void main(String[] args) {
        // 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        // С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int[] arr1 = {0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0};
        System.out.println(Arrays.toString(arr1));
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 1) arr1[i] = 0;
            else arr1[i] = 1;
        }
        System.out.println(Arrays.toString(arr1));

        // 2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
        int[] arr2 = new int[100];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i;
            System.out.print(arr2[i] + " ");
            if ((i + 1) % 10 == 0) System.out.println();
        }

        // 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        int[] arr3 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.println(Arrays.toString(arr3));
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) arr3[i] *= 2;
        }
        System.out.println(Arrays.toString(arr3));

        // 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами.
        int[][] arr4 = new int[5][5];
        for (int rows = 0; rows < arr4.length; rows++) {
            for (int col = 0; col < arr4[rows].length; col++) {
                if (rows == col || col == (arr4.length - rows - 1)) arr4[rows][col] = 1;
                System.out.print(arr4[rows][col] + " ");
            }
            System.out.println();
        }

        // 5. Написать метод, принимающий на вход два аргумента: len и initialValue,
        // и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
        int[] arr5 = new int[10];
        arr5 = makeArray(arr5.length, 4);
        System.out.println(Arrays.toString(arr5));

        // 6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
        Random rand6 = new Random();
        int[] arr6 = new int[10];
        int min, max;

        for (int i = 0; i < arr6.length; i++) {
            arr6[i] = rand6.nextInt(100);
        }
        System.out.println(Arrays.toString(arr6));

        min = max = arr6[0];
        for (int i = 1; i < arr6.length; i++) {
            if (arr6[i] < min) min = arr6[i];
            else if (arr6[i] > max) max = arr6[i];
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);

        // 7. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
        // метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
        int[] arr7 = {7, 3, 3, 1, 4, 1, 6, 9, 7, 9};
        System.out.println(Arrays.toString(arr7));
        System.out.println(isEqualParts(arr7));

        // 8. *** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным,
        // или отрицательным), при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично.
        Random rand8 = new Random();
        int[] arr8 = new int[10];

        for (int i = 0; i < arr8.length; i++) {
            arr8[i] = rand8.nextInt(10);
        }
        System.out.println(Arrays.toString(arr8));

        shiftArray(arr8, -3);
        System.out.println(Arrays.toString(arr8));
        shiftArray(arr8, 4);
        System.out.println(Arrays.toString(arr8));
    }

    public static int[] makeArray(int len, int initialValue) {
        int[] arr = new int[len];
        Arrays.fill(arr, initialValue);
        return arr;
    }

    public static boolean isEqualParts(int[] arr) {
        int[] sumL = new int[arr.length - 1];
        int[] sumR = new int[arr.length - 1];

        sumL[0] = arr[0];
        sumR[sumR.length - 1] = arr[arr.length - 1];
        for (int i = 1; i < arr.length - 1; i++) {
            sumL[i] = sumL[i - 1] + arr[i];
            sumR[sumR.length - 1 - i] = sumR[sumR.length - i] + arr[arr.length - 1 - i];
        }
        System.out.println(Arrays.toString(sumL));
        System.out.println(Arrays.toString(sumR));

        for (int i = 0; i < sumL.length; i++) {
            if (sumL[i] == sumR[i]) return true;
        }
        return false;
    }

    public static void shiftArray(int[] arr, int n) {
        int tmp;
        for (int i = 0; i < Math.abs(n); i++) {
            if (n > 0) {
                tmp = arr[arr.length - 1];
                for (int j = arr.length - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = tmp;
            } else {
                tmp = arr[0];
                for (int j = 0; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = tmp;
            }
        }
    }
}
