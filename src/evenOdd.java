import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = sc.nextInt();

        if(a%2 == 0){
            System.out.print(a+" is Even Number ");
        }else{
            System.out.print(a+" is Odd Number");
        }
    }
}
