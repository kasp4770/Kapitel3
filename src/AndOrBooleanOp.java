public class AndOrBooleanOp {
    /*
    Et program til forståelse af forskellen mellem 'and (&&)' og 'or(||)' Boolean operatørerne, eftersom jeg selv skulle
    skrive det ned for at forstå forskellen 100%. Nu tænker jeg selvfølgelig at det er logik for burhøns! xD

    Også et eksempel fra 3.28 (side 119) som viser 'endten eller(^)' operatoren.

                P1:        P2:
    && eks.:    x < y  &&  y < z     - Hvis P1 er 'true' evaluerer Java P2. Ikke hvis P1 er
                                           'false'. Så hvis P1 er 'false' er hele statement 'false'.

                P1:        P2:
    || eks.:    x < y  ||  y < z     - Java evaluerer P1, og hvis P1 er 'false' evaluerer Java P2. Hvis P1 er
                                           'true' evaluerer Java ikke P2. Så hvis en af dem er 'true' er hele statement
                                           'true'

    ^ eks.:     P1:        P2:
                x < y  ^   y < z     - Hvis P1 er 'true' og P2 er 'true', er statement 'false'. En af dem skal
                                           afvige fra den anden, 'true/false' eller 'false/true'
    */


    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

    /*
    Indsæt x, y og z i konsollen, f.eks.
    2, 3 og 6, herefter (læg her mærke til !(x < y). '!' = 'ikke')
    3, 3 og 6, herefter
    3, 3 og 2, og til sidst
    2, 3 og 2.
    */
        System.out.println("Indsæt x, y og z: (3.24 side 118)");
        double x = input.nextDouble();
        double y = input.nextDouble();
        double z = input.nextDouble();

        System.out.println("(x < y && y < z) is " + (x < y && y < z));
        System.out.println("(x < y || y < z) is " + (x < y || y < z));
        System.out.println("!(x < y) is " + !(x < y));
        System.out.println("(x + y < z) is " + (x + y < z));
        System.out.println("(x + y > z) is " + (x + y > z));

        System.out.println("\n3.25, 3.26 og 3.28:\n"); //

        //3.25 side 118: Write a Boolean expression that evaluates to 'true' if 'age' is greater than 13
        //and less than 18
        int age = 15; //variabel med en værdi der giver 'true' som resultat
        System.out.println("True if age > 13 && age < 18:");
        System.out.println(age > 13 && age < 18);

        //3.26 side 119:  Write a Boolean expression that evaluates to 'true' if 'weight' is greater than 50 pounds and
        //or height is greater than 60 inches
        int weight = 35;
        int height = 61;

        System.out.println("True if weight > 50 || height > 60: ");
        System.out.println(weight > 50 || height > 60);

        //3.28 side 119: Write a Boolean expression that evaluates to 'true' if either weight is greater than 50 pounds
        //or height is greater than 50 pounds but not both.
        int weight2 = 55;
        int height2 = 55;
        System.out.println("True if weight2 > 50 ^ height2 > 60: ");
        System.out.println(weight2 > 50 ^ height2 > 60);
    }
}
