import java.util.Scanner;

public class Main {
    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int m = 0, n, l;
        if (sc.hasNextInt())
            m = sc.nextInt();
        n = sc.nextInt();
        l = sc.nextInt();
        System.out.println(m * m == n * n + l * l);
    }
}