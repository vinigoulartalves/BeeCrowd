package EX1005;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        double a = scn.nextDouble();
        double b = scn.nextDouble();

        double media = (a * 3.5 + b * 7.5) / 11;

        System.out.printf("MEDIA = %.5f\n", media);
    }
}
