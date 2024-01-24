import java.util.Scanner;

class Main{
  public static void main(String args[]){
      double pi,r,a;
      Scanner scanner = new Scanner(System.in);
      pi=3.14;
      r = scanner.nextInt();
      a = pi * r * r;
      System.out.println(a);
    }
  }