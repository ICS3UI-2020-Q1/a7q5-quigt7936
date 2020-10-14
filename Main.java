import java.util.Scanner;
/**
 * This program finds the first digit of a number
 * @author Thomas Quigley
 */
public class Main {

  // finds and tells the user the first digit of their number
  public static void firstDigit(int userNumber) {
    // create the first digit variable
    int beginningDigit = userNumber;

    // a loop that stops when the beginning digit is a single digit
    while (beginningDigit >= 10) {
      // divide the beginning digit by 10 to remove the right most digit
      beginningDigit = beginningDigit / 10;
    } 
    // tell the user the first digit
    System.out.println("The first digit of " + userNumber + " is " + beginningDigit);
  }
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // get the users number
    System.out.println("What number would you like the first digit of?");
    int userNumber = input.nextInt();

    // call upon firstDigit
    firstDigit(userNumber);
  }
}
