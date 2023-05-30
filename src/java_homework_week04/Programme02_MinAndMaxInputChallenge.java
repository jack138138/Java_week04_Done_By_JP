package java_homework_week04;

import java.util.Scanner;

/**
 * Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum
 * number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge.
 */
public class Programme02_MinAndMaxInputChallenge {

    public static void findMinAndMaxInputChallange() {
        //Scanner declaration for reading input form console
        Scanner J1 = new Scanner(System.in);
        int min = 0;
        int max = 0;
        boolean first = true;
        //while loop
        while (true) {
            System.out.println("Enter number:");
            boolean isAnInt = J1.hasNextInt();
            if (isAnInt) {
                int number = J1.nextInt();
                if (first) {
                    first = false;
                    min = number;
                    max = number;
                }
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
            } else {
                break;
            }
            J1.nextLine(); //handle input
        }
        System.out.println("Min = " + min + " ,  Max = " + max);
        J1.close();


    }

    public static void main(String[] args) {
        { findMinAndMaxInputChallange();

        }
    }

}


