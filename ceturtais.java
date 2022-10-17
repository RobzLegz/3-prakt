import java.util.Scanner;

class ceturtais {
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

    public static double h(int a, int b) {
        double h = a / (1 + b * b) + b / (1 + a * a) - Math.pow((a - b), 3);

        return h;
    }

    public static void main(String[] args) {
        System.out.print("Enter s: ");
        int s = getNumber();

        System.out.print("Enter t: ");
        int t = getNumber();

        while (s == t) {
            System.out.println("Numbers can't be equal");
            System.out.print("Enter t: ");
            t = getNumber();
        }

        double result = h(s, t) + h(s - t, s * t) + h(1, 1);

        System.out.print("Result: " + result);
    }
}
