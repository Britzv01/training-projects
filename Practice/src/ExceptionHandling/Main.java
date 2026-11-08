package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // For checking risky code blocks
        /*try {
            System.out.print("Enter number: ");
            int input = scan.nextInt();
        }
        // Catch mismatch input
        catch(InputMismatchException e) {
            System.out.println("Not an integer!");
        }
        // Catch mathematical errors
        catch(ArithmeticException e) {
            System.out.println("Indivisible!");
        }
        // All exception or a safety net
        catch(Exception e) {
            System.out.println("Something went wrong!");
        }
        // Mostly for clean up of resources like scanner
        finally {
            scan.close();
            System.out.println("This always executes");
        }
        */


    }
}
