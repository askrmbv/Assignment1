import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sum(sc, n);
        System.out.println((double) sum / n);
    }

    public static int sum(Scanner sc, int n) {
        if (n == 0) return 0;
        return sc.nextInt() + sum(sc, n - 1);
    }
}