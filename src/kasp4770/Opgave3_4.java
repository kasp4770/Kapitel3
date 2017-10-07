package kasp4770;

public class Opgave3_4 {
    public static void main(String[] args) {

        int number = ((int) (Math.random() * 12))+1;
        System.out.print("måned nr. " + number + " er ");

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
