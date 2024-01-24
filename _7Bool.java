import java.util.Scanner;

class Main{
  public static void main(String args[]){
      Scanner scanner = new Scanner(System.in);
      boolean a;
      a = scanner.nextBoolean();
      System.out.print(a);
      a = scanner.nextBoolean();
      System.out.print(a);
      if(a) System.out.println("This line is executed");
      System.out.print((10 > 9));
      
    }
  }