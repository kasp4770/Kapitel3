package kasp4770;

/*
Exercise 3.4 - (Random month) Write a program that randomly generates an integer between 1 and 12 and displays the
English month name January, February, …, December for the number 1, 2, …, 12, accordingly.
*/
public class Opgave3_4 {
    public static void main(String[] args) {

        //Random number between 0-12 +1. (Math.random = random number between 0.0 - 0.9. Multiplied by 12 it is between
        //0.0 - 10.8. By making it an int value, we get a whole number between 0 - 11, and by adding 1 we avoid 0 and
        //11.8 is rounded up to 12. I think... András am I right or nah?
        int number = ((int) (Math.random() * 12))+1;
        System.out.print("måned nr. " + number + " er ");

        //Switch statement to print out text for the given value
        switch (number) {
            case 1:
                System.out.print("januar");break;
            case 2:
                System.out.print("februar");break;
            case 3:
                System.out.print("marts");break;
            case 4:
                System.out.print("april");break;
            case 5:
                System.out.print("maj");break;
            case 6:
                System.out.print("juni");break;
            case 7:
                System.out.print("juli");break;
            case 8:
                System.out.print("august");break;
            case 9:
                System.out.println("september");break;
            case 10:
                System.out.println("oktober");break;
            case 11:
                System.out.println("november");break;
            case 12:
                System.out.println("december");break;
        }
    }
}
