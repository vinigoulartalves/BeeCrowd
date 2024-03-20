package EX1003;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt();
        scn.nextLine();
        int b = scn.nextInt();
        scn.nextLine();

        int soma = a + b;

        System.out.println("SOMA = " + soma);
    }
}
