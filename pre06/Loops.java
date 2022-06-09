import java.util.Scanner;
class Loops {
  public static void squareRoot(double a){
    double x0 = a/2;
    double x1 =(x0 + (a/x0)) / 2;
    while (Math.abs(x1-x0)>=0.0001){
    x0 = x1;
    x1 =(x0 + (a/x0)) / 2;}
    System.out.println("The square root of "+ a + " is + " + x1);
   }

    public static void power(double x, int n){
    int i = 1;
    double y = x;
     while (i<=n-1){x=x*y;
     i++;}
    System.out.println(x);
      }
  
  public static void main(String args[]){
         System.out.print("Please enter a number you'd like to take the square root of. ");  
        Scanner keyBoard = new Scanner(System.in);
        double a = keyBoard.nextInt();
        squareRoot(a);
   

      System.out.print("Please enter the base of the exponential expression. ");          
       double x = keyBoard.nextDouble();
        System.out.print("Please enter the exponent "+x+ " is raised to. ");         
        int n = keyBoard.nextInt();
        power(x, n);
    
         }
}