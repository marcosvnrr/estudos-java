package application;

import entities.Aluguel;
import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Aluguel[] vect = new Aluguel[10];

        System.out.println("How many rooms will be rented? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("\nCadastro #" + (i + 1));
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.println("Room:");
            int indice = sc.nextInt();

            vect[indice] = new Aluguel(name, email);

        }
        System.out.println("\nBusy rooms");

        for (int i = 0; i < vect.length; i++) {
            if (vect[i] != null) {
                System.out.println(i + ":" + vect[i].getName() + "," + vect[i].getEmail());
            }
        }
        sc.close();
    }
}
