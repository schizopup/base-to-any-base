import java.util.Scanner;

public static void main(String[] arg) {

  Scanner sc = new Scanner(System.in);
  System.out.println("Please enter the original base");
  int oB = sc.nextInt();
  System.out.println("Please enter the number to change");
  String n = sc.next();
  System.out.println("Please enter the new base");
  int nB = sc.nextInt();
  String s = Integer.toString(Integer.parseInt(n, oB), nB);
  System.out.println(s);
  sc.close();
}
