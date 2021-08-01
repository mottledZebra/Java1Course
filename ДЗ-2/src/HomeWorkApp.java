public class HomeWorkApp {
    public static void main(String[] args) {
        System.out.println(compareSum(5, 7));
        printSign(-10);
        System.out.println(returnSign(25));
        printString("Java is Cool!", 4);
        System.out.println(leapYear(1600));
    }

    public static boolean compareSum(int a, int b) {
        return 10 <= a + b && a + b <= 20;
    }

    public static void printSign(int a) {
        if (a >= 0)
            System.out.println("Положительное число");
        else
            System.out.println("Отрицательное число");
    }

    public static boolean returnSign(int a) {
        if (a < 0)
            return true;
        else
            return false;
    }

    public static void printString(String str, int n) {
        for (int i = 0; i < n; i++) System.out.println(str);
    }

    public static boolean leapYear(int year) {
        if (year % 4 == 0)
            if (year % 100 == 0) {
                if (year % 400 == 0) return true;
                else return false;
            } else {
                return true;
            }
        else return false;
    }
}
