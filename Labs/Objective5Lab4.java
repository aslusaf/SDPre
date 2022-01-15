import java.util.Scanner;

public class Objective5Lab4 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("\nPlease enter a number: ");
    int num1 = scanner.nextInt();
    System.out.println();

    if (num1 % 2 == 0) {
      System.out.println(num1 + " is even!\n");
    }
    else {
      System.out.println(num1 + " is odd!\n");
    }
  }
}
