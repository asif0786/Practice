import java.util.Scanner;

public class compareNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = sc.nextInt(); //3
        System.out.print("Enter the second number : ");
        int b = sc.nextInt(); //4
        System.out.print("Enter the third number : ");
        int c = sc.nextInt(); //5

        if(a>b && a>c){
            System.out.println(a+" is greater than "+b+" & "+c);
        } else if (b>a && b>c) {
            System.out.println(b+" is greater than "+a+" & "+c);
        }else {
            System.out.println(c+" is greater than "+a+" & "+b);

        }
    }
}
