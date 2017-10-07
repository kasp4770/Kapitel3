package kasp4770;

import java.util.Scanner;

/*
(Game: scissor, rock, paper) Write a program that plays the popular scissor-rockpaper
game. (A scissor can cut a paper, a rock can knock a scissor, and a paper can
wrap a rock.) The program randomly generates a number 0, 1, or 2 representing
scissor, rock, and paper. The program prompts the user to enter a number 0, 1, or
2 and displays a message indicating whether the user or the computer wins, loses,
or draws.
A Danish version.
*/
public class Opgave3_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //scanner for userinput in console

        int randomNumber = (int) (Math.random() * 3); //generating a random int number between 0-2

        //System.out.println("Computerens valg: " + randomNumber); //Cheatcode or for testing randomNumber

        //Prompt the user to enter value between 0-2
        System.out.println("Indast tal for Sten, saks, eller papir");
        System.out.println("Sten(0), saks(1), papir(2)");
        int yourNumber = input.nextInt();

        //Displaying result
        if (yourNumber == 0){
            System.out.print("Du valgte sten! ");
            if (randomNumber == 0){
                System.out.println("Computeren valgte sten!");
                System.out.println("Uafgjort!");
            }
            if (randomNumber == 1){
                System.out.println("Computeren valgte saks! ");
                System.out.println("Du vinder!");
            }
            if (randomNumber == 2){
                System.out.println("Computeren valgte papir!");
                System.out.println("Du taber!");
            }
        }
        if (yourNumber == 1) {
            System.out.print("Du valgte saks! ");
            if (randomNumber == 0) {
                System.out.println("Computeren valgte sten!");
                System.out.println("Du taber!");
            }
            if (randomNumber == 1) {
                System.out.println("Computeren valgte saks! ");
                System.out.println("Uafgjort!");
            }
            if (randomNumber == 2) {
                System.out.println("Computeren valgte papir!");
                System.out.println("Du vinder!");
            }
        }
        if (yourNumber == 2) {
            System.out.print("Du valgte papir! ");
            if (randomNumber == 0) {
                System.out.println("Computeren valgte sten!");
                System.out.println("Du vinder!");
            }
            if (randomNumber == 1) {
                System.out.println("Computeren valgte saks! ");
                System.out.println("Du taber!");
            }
            if (randomNumber == 2) {
                System.out.println("Computeren valgte papir!");
                System.out.println("Uafgjort!");
            }

        }
        //Active if the user enters a number <0 or >2
        else if (yourNumber < 0 || yourNumber > 2) {
            System.out.println("Du har ikke valgt nummer 0, 1 eller 2. Prøv igen!");
        }
    }
}
