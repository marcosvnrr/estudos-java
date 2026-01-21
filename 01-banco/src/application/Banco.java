package application;
import entities.Conta;

import java.util.Locale;
import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("=========================");
        System.out.println("Enter account number: ");
        int numero = sc.nextInt();

        System.out.println("Enter account holder: ");
        sc.nextLine();
        String titular = sc.nextLine();

        System.out.println("Is there na inicial deposit (y/n)? ");
        char resposta = sc.next().charAt(0);

        Conta conta;
        if (resposta == 's' || resposta == 'S') {
            System.out.println("Enter initial deposit value: ");
            double depositoInicial = sc.nextDouble();
            conta = new Conta (numero, titular, depositoInicial);
        } else {
            conta = new Conta (numero, titular);
        }
        System.out.println();
        System.out.println("Account data: ");
        System.out.println(conta);
        System.out.println();

        System.out.println("Enter a deposite value: ");
        double deposito = sc.nextDouble();
        conta.depositar(deposito);
        System.out.println();
        System.out.println("Updated data: ");
        System.out.println(conta);
        System.out.println();

        System.out.println("Enter a withdraw value: ");
        double saque = sc.nextDouble();
        conta.sacar(saque);
        System.out.println();
        System.out.println("Updated data: ");
        System.out.println(conta);


        sc.close();
    }
}
