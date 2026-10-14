
import java.util.Scanner;

class Nestedif{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int a = sc.nextInt();

        if (a > 0) {
            System.out.println("Positive number");

            if (a % 2 == 0) {
                System.out.println("Even number");
            } else {
                System.out.println("Odd number");
            }
        } else {
            System.out.println("Not a positive number");
        }
    }
}
