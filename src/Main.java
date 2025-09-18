public class Main {
    public static void main(String[] args) {
        int intOperandA = 1;
        int intOperandB = 5;
        int intSum = 23;
        int intProduct = 17;
        int intDifference = 11;
        int intQuotient = 54;
        int intModulo = 4;
        double doubleOperandA = 1.5;
        double doubleOperandB = 5.2;
        double doubleSum = 23.3;
        double doubleProduct = 17.2;
        double doubleDifference = 11.3;
        double doubleQuotient = 54.3;
        double doubleModulo = 4.4; //added in double doubleModulo even though it was not specifically requested

        intSum = intOperandA + intOperandB;
        System.out.println("The sum of " + intOperandA + " and " + intOperandB + " is " + intSum + ".");
        intProduct = intOperandA * intOperandB;
        System.out.println("The product of " + intOperandA + " and " + intOperandB + " is " + intProduct + ".");
        intDifference = intOperandA - intOperandB;
        System.out.println("The difference between " + intOperandA + " and " + intOperandB + " is " + intDifference + ".");
        intQuotient = intOperandA / intOperandB;
        System.out.println("The quotient of " + intOperandA + " and " + intOperandB + " is " + intQuotient + ".");
        intModulo = intOperandA % intOperandB;
        System.out.println("The modulo of " + intOperandA + " and " + intOperandB + " is " + intModulo + ".");

        doubleSum = doubleOperandA + doubleOperandB;
        System.out.println("The sum of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum + "." );
        doubleProduct = doubleOperandA * doubleOperandB;
        System.out.println("The product of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct + "." );
        doubleDifference = doubleOperandA - doubleOperandB;
        System.out.println("The difference between " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference + "." );
        doubleQuotient = doubleOperandA / doubleOperandB;
        System.out.println("The quotient of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient + "." );
        doubleModulo = doubleOperandA % doubleOperandB;
        System.out.println("The modulo of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleModulo + "." );

        int numPeopleInFamily = 5;
        double shoeSize = 12.5;
        String fullName = "Ty Jayson Schaub";
        String favColor = "Black";

    }
}