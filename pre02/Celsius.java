import java.io.*;
import java.time.Year;
import java.util.*;
import java.util.Scanner;

public class Celsius {
    public static void main(String[] args){
        System.out.println("Hello World!");

      
//Current Date Monday, April 5th, 2022
String day = "Monday";
String month = "April";
String date = "5th";
int year = 1972;
      System.out.println(day +"," + month + " " +date +", " + year);

//Current Time is 9:57 and 53 seconds
int hour = 9;
int minute = 57;
int second = 45;
int midnight_since = hour * 3600 + minute*60 + second;
      System.out.println(midnight_since + " seconds passed since midnight.");
      System.out.println(24 * 3600 - midnight_since + " seconds to go before midnight.");

/*Exercise 2   Write a program that converts a temperature from Celsius to Fahrenheit. It should (1) prompt the user for input, (2) read a double value from the keyboard, (3) calculate the result, and (4) format the output to one decimal place. For example, it should display "24.0 C = 75.2 F".*/

      
        double cel_temp;
        double fah_temp;
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the temperature in celsius.  ");
        cel_temp = in.nextDouble();
        fah_temp = cel_temp * 1.8 + 32;
        
        System.out.println(cel_temp + " C = " + fah_temp + " F.");
        

 
      
      }
}
