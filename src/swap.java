import java.util.Scanner;
public class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();

        System.out.println("Before swapping the numbers:");
        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);

        // Temporary value is assigned with the value of the First variable
        int temp = a;

        // The First variable is assigned to the value of the Second variable
        a = b;

        // The Second variable is assigned to the value of the Temporary variable
        // i.e, the First variable
        b = temp;

        System.out.println("After swapping the numbers: ");
        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);
    }
}
