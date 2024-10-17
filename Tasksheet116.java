import java.util.Scanner;

public class Tasksheet116{

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.print("Enter a string: ");
      String input = scanner.nextLine();

      StringBuilder reversedString = new StringBuilder(input);


       reversedString.reverse();

    
        if (input.equals(reversedString.toString())) {
       System.out.println("The input string is a palindrome.");
       } else {
    
       System.out.println("The input string is not a palindrome.");
 }

        scanner.close();
      }
 }
