public class Objective3Lab3 {
  public static void main(String[] args) {

    int first = 1 + (int)(Math.random() * 6);
    int second = 1 + (int)(Math.random() * 6);
    int third = 1 + (int)(Math.random() * 6);

    System.out.println(
      "----------------"
    + "\nFirst roll  : " + first
    + "\nSecond roll : " + second
    + "\nThird roll  : " + third
    + "\n\nTotal       = " + (first + second + third)
    + "\n----------------"
    );

  }
}
