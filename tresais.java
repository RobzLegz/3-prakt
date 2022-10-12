import java.util.Scanner;

public class tresais {

  public static Scanner in = new Scanner(System.in);

  public static int getNumber() {
    int n = 0;

    String nStr = in.next();

    boolean valid = false;

    while (!valid) {
      try {
        n = Integer.parseInt(nStr);

        if (n > 1) {
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

  public static int[] itt(int num) {
    int[] val = new int[3];

    for (int i = 2; i < num; i++) {
      if (num % i == 0) {
        val[0] = num / i;
        val[1] = i;
        val[2] = 1;
      }
    }

    if(val[2] != 1){
      val[0] = num;
      val[1] = 1;
      val[2] = -1;
    }

    System.out.print(val[0] + " ");

    return val;
  }

  public static void main(String[] args) {
    System.out.print("Enter n: ");
    int n = getNumber();

    int[] itt_val = itt(n);

    while (itt_val[2] > 0) {
      itt_val = itt(itt_val[1]);
    }

    in.close();
  }
}
