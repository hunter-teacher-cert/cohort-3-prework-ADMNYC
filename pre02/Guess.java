import java.util.Scanner;
import java.util.Random;
class Guess {
  public static void main(String[] args) {
    System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?");
    Scanner myScan = new Scanner(System.in);
      System.out.print ("Type a number: ");
int number_guess = myScan.nextInt();
System.out.println("Your guess is: " + number_guess);

Random random = new Random();
int number = random.nextInt(100) + 1;
System.out.println("The number I was thinking of is: " + number);
int n = Math.abs(number_guess - number);
System.out.println("You were off by:" + n);    
    
    }
}