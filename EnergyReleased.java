import java.util.Scanner;
/**
 * This program calculates the energy released from an object.
 *
 * @author  Marlon Poddalgoda
 * @version 1.0
 * @since 2021-04-23
 */

public final class EnergyReleased {
    private EnergyReleased() {

        // Throw an exception if this ever *is* called
        throw new AssertionError("Instantiating utility class.");
    }
    /**
    * This method calculates the amount of energy released from an object.
    * @param args
    */
    public static void main(final String[] args) {

        // Create new Scanner-type variable
        Scanner input = new Scanner(System.in);

        // Constants
        final float speedOfLight = 299792458f;
        final float energyOf4TJ = 4000000000000f;

        // Variables
        float massOfObj = 0;
        float energyRel = 0;
        float kiloTon = 0;

        System.out.println("This program calculates the amount of energy"
            + " released from an object of a certain mass.");
        System.out.println();

        // Asks user to enter one of several choices
        System.out.print("Please enter the mass of an object (kg): ");

        while (true) {
            // input
            while (!input.hasNextFloat()) {
                System.out.println("That's not a number!");
                System.out.print("Please enter the mass of an object (kg): ");
                input.next(); // advances scanner until it gets correct value
            }
            massOfObj = input.nextFloat();

            if (massOfObj > 0) {
                // process
                energyRel = massOfObj * (speedOfLight * speedOfLight);

                kiloTon = energyRel / energyOf4TJ;

                // output
                System.out.println();
                System.out.println("An object with a mass of " + massOfObj
                    + "kg would release "  + energyRel + "J of energy.");
                System.out.println("This would be equivalent to a " + kiloTon
                    + " kiloton bomb.");

                // End of program
                break;

            } else {
                System.out.println("That's not an positive number!");
                System.out.print("Please enter the mass of an object (kg): ");
            }
        }
    }
}
