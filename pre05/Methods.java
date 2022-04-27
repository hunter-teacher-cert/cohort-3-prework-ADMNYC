/*Exercise 2  
Write a method named isDivisible that takes two integers, n and m, and that returns true if n is divisible by m, and false otherwise.*/

import java.util.Scanner;
  
public class Methods {
    public static void isDivisible(int n, int m){
          if (n % m == 0) {      
            System.out.println((n % m == 0) + ".");
            System.out.print (n + " is divible by "+ m);}
          else {
            System.out.println((n % m == 0) + ".");   
            System.out.print (n + " is not divible by "+ m);}
          
    }
   
    public static void main (String[] args) {
      Scanner keyBoard = new Scanner(System.in);
      
      System.out.print ("Please enter a number: ");
      int n = keyBoard.nextInt();
           
      System.out.print ("Please enter another number: ");
      int m = keyBoard.nextInt();
         
      isDivisible(n, m);
    }
}