/*Exercise 5  The purpose of this exercise is to take a problem and break it into smaller problems, and to solve the smaller problems by writing simple methods. Consider the first verse of the song “99 Bottles of Beer”:*/

class Beer {
  public static void main(String[] args) {
  for (int i = 99; i>0; i--) { 
    System.out.println(i +" bottles of beer on the wall,\n"+ i +" bottles of beer,\nya’ take one down, ya’ pass it around,");
    System.out.println (i-1 +" bottles of beer on the wall.\n");
    }
    {
  System.out.println ("No bottles of beer on the wall,\nno bottles of beer,\nya’ can’t take one down, ya’ can’t pass it around,\n’cause there are no more bottles of beer on the wall!");
 
    }
  }
}