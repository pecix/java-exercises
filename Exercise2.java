//        Zadanie 2. Wczytać od użytkownika 3 liczby całkowite i wypisać na
//        ekran największą oraz najmniejszą z nich.

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj pierwszą liczbę: ");
        int liczba1 = scanner.nextInt();

        System.out.print("Podaj drugą liczbę: ");
        int liczba2 = scanner.nextInt();

        System.out.print("Podaj trzecią liczbę: ");
        int liczba3 = scanner.nextInt();

        int najwieksza;
        int najmniejsza;

        if (liczba1 > liczba2) {
            if (liczba1 > liczba3) {
                najwieksza = liczba1;
            } else {
                najwieksza = liczba3;
            }
        } else if (liczba2 > liczba3) {
            najwieksza = liczba2;
        } else {
            najwieksza = liczba3;
        }

        System.out.println("Największa liczba to: " + najwieksza);
//        System.out.println("Najmniejsza liczba to: " + najmniejsza);
    }
}
