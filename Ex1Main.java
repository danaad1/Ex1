import java.util.Scanner;

/**
 * Intro2CS, Ex1 - very basic "main template"
 * Make sure your implementation of this main performs as the Ex1Sol.jar solution implement all needed functions.
 *
 */
public class Ex1Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = "", num2="", quit = "quit";
        while (!num1.equals(quit) && !num2.equals(quit)) {
            System.out.println();
            System.out.println("Ex1 class solution:");
            System.out.println("Enter a string as number#1 (or \"quit\" to end the program): ");
            num1 = sc.next();

                if (!num1.equals("quit")) {
                    System.out.println("num1 = " + num1 + " is number: " + Ex1.isNumber(num1) + " , value: " + Ex1.number2Int(num1));
                }
            System.out.println("Enter a string as number#2 (or \"quit\" to end the program): ");
            num2 = sc.next();
                if (!num2.equals("quit")) {
                    System.out.println("num2 = " + num2 + " is number: " + Ex1.isNumber(num2) + " , value: " + Ex1.number2Int(num2));
                }
            System.out.println("Enter a base for output (a number [2,16] (or \"quit\" to end the program): ");
            int base = sc.nextInt();
            System.out.println( num1 + " + " + num2 + " = " + Ex1.int2Number( (Ex1.number2Int(num1) + Ex1.number2Int(num2)) , base ) ) ;
            System.out.println( num1 + " * " + num2 + " = " + Ex1.int2Number( (Ex1.number2Int(num1) * Ex1.number2Int(num2)) , base ) ) ;
            String[] a =  { num1 , num2 , Ex1.int2Number( (Ex1.number2Int(num1) + Ex1.number2Int(num2)) , base ) , Ex1.int2Number( (Ex1.number2Int(num1) * Ex1.number2Int(num2)) , base ) };
            System.out.println( "Max number over " + a.toString() + " is: ");
        }
        // add your code here

        /////////////////////
        System.out.println("quiting now...");
    }
}
