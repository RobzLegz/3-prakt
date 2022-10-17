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

    public static void nod(int a, int b){
        int bint, sint;

        if(a > b){
            bint = a;
            sint = b;
        }else{
            bint = b;
            sint = a;
        }

        
    }

    public static void main(String[] args) {
        System.out.println("Enter a: ");
        int a = getNumber();

        System.out.println("Enter b: ");
        int b = getNumber();

        nod(a, b);
    }
}
