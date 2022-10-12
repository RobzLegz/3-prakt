import java.util.Scanner;

class Pirmais {

  public static Scanner in = new Scanner(System.in);

  public static int getNumber() {
    int n = 0;

    String nStr = in.next();

    boolean valid = false;

    while (!valid) {
      try {
        n = Integer.parseInt(nStr);

        if (n > 0) {
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
    System.out.print("Enter x: ");
    int x = getNumber();

    System.out.print("Enter n: ");
    int n = getNumber();

    int xUp = 1;

    while (xUp * x < n) {
      xUp = xUp * x;

      System.out.println(xUp);
    }

    in.close();
  }
}
