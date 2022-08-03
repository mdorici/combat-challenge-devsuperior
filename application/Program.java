package application;

import entities.Champion;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first champion data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Initial life: ");
        int life = sc.nextInt();
        System.out.print("Attack: ");
        int attack = sc.nextInt();
        System.out.print("Armor: ");
        int armor = sc.nextInt();

        Champion champion1 = new Champion(name, life, attack, armor);

        System.out.println();
        System.out.println("Enter second champion data: ");
        System.out.print("Name: ");
        sc.nextLine();
        name = sc.nextLine();
        System.out.print("Initial life: ");
        life = sc.nextInt();
        System.out.print("Attack: ");
        attack = sc.nextInt();
        System.out.print("Armor: ");
        armor = sc.nextInt();

        Champion champion2 = new Champion(name, life, attack, armor);

        System.out.println();
        System.out.print("How many rounds do you play? ");
        int rounds = sc.nextInt();

        for (int i = 1; i <= rounds; i++) {
            if(champion1.getLife() > 0 && champion2.getLife() > 0) {
                champion1.takeDamage(champion2);
                champion2.takeDamage(champion1);
                System.out.println();
                System.out.printf("Result round %d:%n", i);
                System.out.print(champion1.status());
                System.out.print(champion2.status());
            }
        }

        System.out.println();
        System.out.println("COMBAT OVER");

        sc.close();
    }
}
