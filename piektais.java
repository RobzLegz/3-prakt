import java.util.Scanner;

public class piektais {
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

    public static void nod(double a, double b) {
        double bint, sint, c;

        bint = a;
        sint = b;

        if (b > a) {
            bint = b;
            sint = a;
        }

        c = bint % sint;

        if(c == 0){
            System.out.println("Result: " + sint);

            return ;
        }
        
        nod(b, c);
    }

    public static void main(String[] args) {
        System.out.print("Enter a: ");
        int a = getNumber();

        System.out.print("Enter b: ");
        int b = getNumber();

        nod(a, b);
    }
}
