import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        int firstNumber = input("Podaj pierwszą liczbę: ");
        int secondNumber = input("Podaj drugą liczbę: ");
        int thirdNumber = input("Podaj trzecią liczbę: ");

        int maximumNumber;
        int minimumNumber;

        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            maximumNumber = firstNumber;
        } else if (secondNumber > thirdNumber && secondNumber > firstNumber) {
            maximumNumber = secondNumber;
        } else {
            maximumNumber = thirdNumber;
        }

        if (firstNumber < secondNumber && firstNumber < thirdNumber) {
            minimumNumber = firstNumber;
        } else if (secondNumber < thirdNumber && secondNumber < firstNumber) {
            minimumNumber = secondNumber;
        } else {
            minimumNumber = thirdNumber;
        }

        System.out.println("Największa liczba to: " + maximumNumber);
        System.out.println("Najmniejsza liczba to: " + minimumNumber);
    }

    static int input(String message) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.print(message);
            return input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Podano złą wartość");
            return input(message);
        }
    }
}
