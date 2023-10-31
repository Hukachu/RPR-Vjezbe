import java.util.Scanner;

public class Main {

    public static long Faktorijel(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Faktorijel se ne može izračunati za negativne brojeve.");
        }

        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesite broj: ");
        double number = scanner.nextDouble();

        // Računanje sinusa
        double sinValue = Math.sin(Math.toRadians(number));

        // Računanje faktorijela
        long factorial = Faktorijel((int) number);

        System.out.println("Sinus broja " + number + " je: " + sinValue);
        System.out.println("Faktorijel broja " + (int) number + " je: " + factorial);

        scanner.close();
    }
}

