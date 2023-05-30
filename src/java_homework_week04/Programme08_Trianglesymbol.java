package java_homework_week04;

import java.util.Scanner;

/**
 * Display right angle triangle of @ using nested for loops
 *  @
 *  @@
 *  @@@
 *  @@@@
 *  @@@@@
 */
public class Programme08_Trianglesymbol {
    public static void symbolTriangle(int n) {
        for (int i = 0; i <= n; i++) {
            for (int p = 0; p < i; p++) {
                System.out.print("@");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of rows: ");
        symbolTriangle(scanner.nextInt());
        // closing the scanner object
        scanner.close();
    }

}
