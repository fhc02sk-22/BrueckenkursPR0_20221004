import java.util.Scanner;

public class LeafYearCalculationApp {

    /*
        Variante 1:
          - Es ist ein Schaltjahr, wenn durch 4 teilbar
            (year % 4 == 0)

        Es ist ein Schaltjahr, wenn
            durch 4 teilbar und 400 teilbar (achtung)
            durch 4 teilbar und nicht durch 100 teilbar

     */


    public static void main(String[] args) {
        System.out.println("Schaltjahrberechnung");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte geben Sie einen Jahreswert ein: ");
        int year = scanner.nextInt();

        System.out.println("Ihr Wert lautet: " + year);

        // Überprüft, ob das Jahr eine Schaltjahr ist ....
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " ist ein Schaltjahr");
        } else if (year % 4 == 0 && year % 400 == 0) { // 2000
            System.out.println(year + " ist ein Schaltjahr");
        } else // sonst
        {
            System.out.println(year + " ist KEIN Schaltjahr");
        }


        System.out.println(year + " is a leaf year: " + isLeafYear(year));
    }

    // void
    public static boolean isLeafYear(int year) {
        // true, wenn Schaltjahr
        // false, wenn kein Schaltjahr

        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        } else if (year % 4 == 0 && year % 400 == 0) { // 2000
            return true;
        } else // sonst
        {
            return false;
        }
    }
}

