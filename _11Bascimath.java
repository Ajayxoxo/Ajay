import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Integer Arithmetic");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
                
        int a = x + y;
        int b = x *y;
        int c= x/y;
        int d=x-y;
        int e=-x;
        System.out.println("a=" +a);
        System.out.println("b=" +b);
        System.out.println("c=" +c);
        System.out.println("d=" +d);
        System.out.println("e=" +e);
        System.out.println("Floating Point Arithmetic");
        double da = x + y;
        double db = x *y;
        double dc= x/y;
        double dd=x-y;
        double de=-x;
        System.out.println("da=" +da);
        System.out.println("db=" +db);
        System.out.println("dc=" +dc);
        System.out.println("dd=" +dd);
        System.out.println("de=" +de);
        
      }
  }
  