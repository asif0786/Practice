import java.util.Scanner;
public class powerOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("2^"+i+" = "+Math.pow(2, i));
        }
    }
}
