import java.lang.Math;
import java.util.Scanner;

class Main{
  public static void main(String args[]){
      Scanner scanner = new Scanner(System.in);
      double a = scanner.nextInt();
      double b;
      b = Math.sqrt(a);
      System.out.print("SquareRoot of a is : " +b);
      }
  }