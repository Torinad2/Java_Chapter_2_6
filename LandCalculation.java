/**************************************************************************************************
 * Assignment: Land Calculation                                                                   *
 *                                                                                                *
 * One acre of land is equivalent to 43,560 square feet. Write a program that calculates the      *
 * number of acres in a tract of land with 389,767 square feet. Hint: Divide the size of the      *
 * tract of land by the size of an acre to get the number of acres.                               *
 **************************************************************************************************/

public class LandCalculation {
    public static void main(String[] args) {

        /* ********************************************
         * Declare land sizes in square feet          *
         **********************************************/
        double squareFeetPerAcre = 43560.0;
        double tractSizeInSqFt = 389767.0;

        /* ********************************************
         * Calculate number of acres                  *
         **********************************************/
        double numberOfAcres = tractSizeInSqFt / squareFeetPerAcre;

        /* ********************************************
         * Display the number of acres                *
         **********************************************/
        System.out.printf("%-30s %.3f\n", "Tract size in square fit:", tractSizeInSqFt);
        System.out.printf("%-30s %.3f\n", "Square fit in one acre:", squareFeetPerAcre);
        System.out.printf("%-30s %.3f\n", "Number of acres in our tract:", numberOfAcres);

        /* ********************************************
         * Display developer credit                   *
         **********************************************/
        System.out.println("\nDeveloped by: Nikita Baiborodov");

        /* ********************************************
         * Exit the program                           *
         **********************************************/
        System.exit(0);
    }
}
