import java.util.*;
  
class Methods {
    public static void isDivisible(int n, int m){
          if (n % m == 0) {      
            System.out.println((n % m == 0) + ".");
            System.out.println (n + " is divible by "+ m);}
          else {
            System.out.println((n % m == 0) + ".");   
            System.out.println (n + " is not divible by "+ m);}  
    }
    public static void isTriangle(int a, int b, int c){
          if (a <=0 || b<=0 ||c<0) {System.out.println("Invalid entries. Please enter postive numbers only.");}
          else if ((a + b > c) && ((Math.abs(a - b) < c))) {      
            System.out.println(((a + b > c) && ((Math.abs(a - b) < c))) + ".");
            System.out.print (a+", "+b+", " +c+ " are sides of a triangle.");
            }
          else{
            System.out.println(((a + b > c) && ((Math.abs(a - b) < c))) + ".");   
            System.out.print (a+", "+b+", " +c+ " are NOT sides of a triangle.");
            }    
  
    }
   
    public static void main (String[] args) {
      Scanner keyBoard = new Scanner(System.in);
      System.out.print ("\n\nExercise 2: isDivisible Method \n\n");
      System.out.print ("Please enter a number (dividend): ");
      int n = keyBoard.nextInt();           
      System.out.print ("Please enter another number (divisor): ");
      int m = keyBoard.nextInt();         
      isDivisible(n, m);

      System.out.print ("\n\nExercise 3: isTriangle Method \n\n");
      System.out.print ("Please enter a number (side 1): ");
      int a = keyBoard.nextInt();          
      System.out.print ("Please enter another number (side 2): ");
      int b = keyBoard.nextInt();
      System.out.print ("Please enter another number (side 3): ");
      int c = keyBoard.nextInt();         
      isTriangle(a, b, c);
 
    }
}
    
  
    
    
