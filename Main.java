import java.lang.Math;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.print("Please enter a number from 0-20: ");
    Scanner in = new Scanner(System.in);
    int range = in.nextInt();
    if (range > 20) {
      System.out.print("The range is too big!\nGoodbye");
    } else if (range < 0) {
      System.out.print("The range is less than 0!\nGoodbye!");
    }
    int i = 0;  
    int y = 2;
    while (i <= range) {
      System.out.println("2^" + i + " = " + Math.pow(y , i));
      i++;
    }
    System.out.print("Goodbye!");
  }
}