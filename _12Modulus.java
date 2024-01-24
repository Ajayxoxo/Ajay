import java.util.Scanner;
class Main{
  public static void main(String args[]){
      Scanner scanner = new Scanner(System.in);
      int x = scanner.nextInt();
      double y = scanner.nextDouble();
      System.out.println("x mod 10 = " + x % 10);
      System.out.println("y mod 10 = " + y % 10);
    }
  }