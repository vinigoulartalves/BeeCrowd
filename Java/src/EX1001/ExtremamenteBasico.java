package EX1001;

import java.util.Scanner;

public class ExtremamenteBasico {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        scanner.nextLine();
        int b = scanner.nextInt();
        scanner.nextLine();

        int x = a + b;

        System.out.println("X = " + x);

        scanner.close();
    }
}