import java.util.Scanner;

public class otrais {

  public static Scanner in = new Scanner(System.in);

  public static int getNumber() {
    int n = 0;

    String nStr = in.next();

    boolean valid = false;

    while (!valid) {
      try {
        n = Integer.parseInt(nStr);

        if (n >= 0) {
          valid = true;
        } else {
          System.out.print("Invalid integer, try again: ");
          nStr = in.next();
        }
      } catch (NumberFormatException e) {
        System.out.print("Invalid integer, try again: ");
        nStr = in.next();
      }
    }

    return n;
  }

  public static void main(String[] args) {
    System.out.print("Enter a: ");
    int a = getNumber();

    System.out.print("Enter b: ");
    int b = getNumber();

    while (a > b) {
      System.out.println("a has to be < than b");
      System.out.print("Enter b: ");
      b = getNumber();
    }

    for (int counter = a; counter < b; counter++) {
      if (String.valueOf(counter).contains("0")) {
        System.out.println(counter);
      }
    }

    in.close();
  }
}
