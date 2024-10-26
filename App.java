import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Nasza pierwsza aplikacja");

        int a = 5;
        int b = 10;

//        String text = a > b ? "5 jest większe niż 10" : "5 jest mniejsze niż 10";

        String text;

        if (a > b) {
            text = "5 jest większe niż 10";
        } else {
            text = "5 jest mniejsze niż 10";
        }

        System.out.println(text);

//        boolean done = false;
//
//        while (!done) {
//            try {
//                Scanner input = new Scanner(System.in);
//                System.out.print("Podaj liczbę: ");
//                int number = input.nextInt();
//                input.close();
//
//                for (int i = 0; i < number; i++) {
//                    for (int j = 1; j <= number; j++) {
//                        if (j < number) {
//                            System.out.print(j + ", ");
//                        } else {
//                            System.out.print(j);
//                        }
//                    }
//                    System.out.println();
//                }
//
//                done = true;
//            } catch (InputMismatchException exception) {
//                System.out.println("Proszę podać liczbę całkowitą");
//            }
//
//        }
    }
}

