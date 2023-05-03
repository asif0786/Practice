import java.util.Scanner;
public class factors {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its Prime Factors: ");
        int N = sc.nextInt();

        for(int i = 2; i< N; i++)
        {
            while(N%i == 0) {
                System.out.print(i+" ");
                N = N/i;
            }
        }
        if(N>2) {
            System.out.println(N);
        }
    }
}