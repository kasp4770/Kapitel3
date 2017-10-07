package kasp4770;

import java.util.Scanner;

/*
Exercise 3.6 - (Health application: BMI) Revise Listing 3.4, ComputeAndInterpretBMI.java, to
let the user enter weight, feet, and inches. For example, if a person is 5 feet and 10
inches, you will enter 5 for feet and 10 for inches.
A Danish version: Kilo, meter and centimeter
*/
public class Opgave3_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //scanner for userinput in console

        //Prompt the user to enter weight in kilos
        System.out.println("Indtast din vægt i Kilo: ");
        double weight = input.nextDouble();

        //Height. First the user enters meters of height and the remaining centimeters of height afterwards:
        //Prompt the user to enter height in whole meters
        System.out.println("Indtast din højde. Først hele meter og derefter tilbageværende centimeter.");
        System.out.println("Indtast meter: ");
        double meter = input.nextDouble();

        //prompt the user to enter remaining centimeters
        System.out.println("Indtast centimeter: ");
        double centimeter = input.nextDouble();

        double height = meter + (centimeter/100);

        //The equation for Bodymass Index
        double bmi = weight/(height*height);

        //Displaying result
        System.out.println("Din BMI er " + bmi);
        if (bmi < 18.5){
            System.out.println("Undervægtig");
        }
        else if (bmi < 25){
            System.out.println("Normal");
        }
        else if (bmi < 30){
            System.out.println("Overvægtig");
        }
        else {
            System.out.println("Fed");
        }

    }
}
