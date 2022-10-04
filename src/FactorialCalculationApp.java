import java.util.Scanner;

public class FactorialCalculationApp {

    /*

        5! = 1 * 2 * 3 * 4 * 5

     */

    public static void main(String[] args) {
        System.out.println("Berechnung der Fakultät");
        System.out.println("Bitte Zahl eingeben: ");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println(number + "! = " + calculateFactorialNumber(number));
    }

    public static long calculateFactorialNumber(int value) {

        if (value < 2){
            return 1;
        }

        return 0;
    }
}
