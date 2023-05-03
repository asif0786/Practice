import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        double a = sc.nextDouble();
        System.out.println("Enter the second number");
        double b = sc.nextDouble();

        double quotient = a / b;
        System.out.println("Quotient is : "+quotient);
        double remainder = a% b;
        System.out.println("Remainder is : "+remainder);
    }
}
