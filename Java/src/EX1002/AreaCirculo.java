package EX1002;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaCirculo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double raio = scanner.nextDouble();

        double n = 3.14159;

        double area = n * raio * raio;

        DecimalFormat formato = new DecimalFormat("#.00");

        String numeroFormatado = formato.format(area);

        System.out.println("A=" + numeroFormatado);

        scanner.close();
    }

}
