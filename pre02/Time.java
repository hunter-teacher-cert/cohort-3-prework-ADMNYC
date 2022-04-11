import java.io.*;
import java.time.Year;
import java.util.*;

public class Time {
    public static void main(String[] args){
        System.out.println("Hello World!");

      
//Current Date Monday, April 5th, 2022
String day = "Monday";
String month = "April";
String date = "5th";
int year = 1972;
      System.out.println(day +", " + month + " " +date +", " + year);

//Current Time is 9:57 and 53 seconds
int hour = 9;
int minute = 57;
int second = 45;
int midnight_since = hour * 3600 + minute*60 + second;
      System.out.println(midnight_since + " seconds passed since midnight.");
      System.out.println(24 * 3600 - midnight_since + " seconds to go before midnight.");





      
      }
}
