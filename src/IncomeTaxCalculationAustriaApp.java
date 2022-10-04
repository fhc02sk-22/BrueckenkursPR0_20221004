/* beginn von kommentar

Ein Jahreseinkommen unter 11.000 € ist steuerfrei.
Das Einkommen von 11.000 bis 18.000 € wird mit 20% versteuert.
Von 18.000 bis 31.000 € sind es 32,5%.
Zwischen 31.000 bis 60.000 € sind es 42% und
von 60.000 bis 90.000 € 48% Steuern.
Bis 1.000.000 € sind es 50%
und darüber 55%.

SV 18,12 %

Monatlich: 2.900
Jahreseinkommen: Monat * 14: 40.600
- SV (18,12 %): -7356,72
Jahreseinkommen - SV: 33.243,28

bis 11.000       >  0%:
11.000 - 18.000  >  20%:  7.000 * 0.2    > 1.400 EUR
18.000 - 31.000  > 32,5%: 13.000 * 0,325 > 4.225 EUR
31.000 - 33.243  > 42%:   2.243 * 0.42 > 942,06 EUR

GESAMT: 6.567,06 EUR
 ende von kommentar */

import java.util.Scanner;

public class IncomeTaxCalculationAustriaApp {
    // main psvm
    public static void main(String[] args) {
        // zeile 0
        System.out.println("Jahrsteuerberechnung Pro 7.0");
        System.out.println("Bitte monatliches Gehalt eingeben: ");
        Scanner scanner = new Scanner(System.in);// fix, um auf Konsole zuzugreifen

        // typ name
        // ganzzahltypen: byte (1), x int (4), long (8)
        // gleitkommatypen: float, x double
        // zeichen: char = 'X', String = "ABC"
        double monthlyIncome = 0;
        monthlyIncome = scanner.nextDouble(); // validierung, wartet bis user eingabe macht
        // warten bis wert kommt
        double yearlyIncome = monthlyIncome * 14; // +, -, *, /, % (modulo/rest)
        double yearlyIncomeWithoutSocialSystem = 0;

        //soutv
        //System.out.println("yearlyIncome = " + yearlyIncome);
        System.out.println("Das Jahresgehalt lautet: " + yearlyIncome);

        // yearlyIncome = yearlyIncome * (1 - 0.1812);
        double sv = yearlyIncome * 0.1812;
        yearlyIncomeWithoutSocialSystem = yearlyIncome - sv;

        System.out.println("Das Jahresgehalt abzüglich SV lautet: " + yearlyIncomeWithoutSocialSystem);

        double tax = 0; // ~6500
        /*
        bis 11.000       >  0%: 0 EUR
        11.000 - 18.000  >  20%:  7.000 * 0.2    > 1.400 EUR
        18.000 - 31.000  > 32,5%: 13.000 * 0,325 > 4.225 EUR
        31.000 - 33.243  > 42%:   2.243 * 0.42 > 942,06 EUR
         */
        if (yearlyIncomeWithoutSocialSystem <= 11000) {
           tax = 0;
        }
        else if (yearlyIncomeWithoutSocialSystem >= 11000 && yearlyIncomeWithoutSocialSystem < 18000) {
            // 15000 => 15000 - 11000 = 4000 * 20 % (0.2)
            tax = (yearlyIncomeWithoutSocialSystem - 11000) * 0.2;
        }
        else if (yearlyIncomeWithoutSocialSystem >= 18000 && yearlyIncomeWithoutSocialSystem < 31000) {
            // 20000 => 20000 - 18000 = 2000 * 32,5 % (0.325) = 650
            tax = (18000 - 11000) * 0.2
                    + (yearlyIncomeWithoutSocialSystem - 18000) * 0.325;
        }
        else if (yearlyIncomeWithoutSocialSystem >= 31000 && yearlyIncomeWithoutSocialSystem < 60000) {
            tax = (18000 - 11000) * 0.2
                    + (31000 - 18000) * 0.325
                    + (yearlyIncomeWithoutSocialSystem - 31000) * 0.42;
        }
        else if (yearlyIncomeWithoutSocialSystem >= 60000 && yearlyIncomeWithoutSocialSystem < 90000) {
            tax = (18000 - 11000) * 0.2
                    + (31000 - 18000) * 0.325
                    + (60000 - 31000) * 0.42
                    + (yearlyIncomeWithoutSocialSystem - 31000) * 0.48;
        }

        System.out.println("Jährliche Steuer: " + tax);
    }
}
