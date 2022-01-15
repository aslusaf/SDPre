import java.util.Scanner;

public class Objective7Lab5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int selection;

    while (true) {
      System.out.println("\n_____Menu_____");
      System.out.println("1: Say Hello");
      System.out.println("2: List My favorite foods");
      System.out.println("3: Exit");
      System.out.println();

      selection = scanner.nextInt();
      System.out.println();

      if(selection == 1) {
        System.out.println("Hello World");
      }

      else if (selection == 2) {
        System.out.println("Apple, Banana, Coconut");
      }

      else if (selection == 3) {
        System.out.println("Goodbye\n");
        break;
      }

      else {
        System.out.println("That is not a valid menu option! Please try again.");
      }
    }

    scanner.close();

  }
}
