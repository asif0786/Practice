import java.util.Scanner;
public class coinFlip {
    public static void main(String[] args) {
        // Generate random number
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter how many times coin to be flipped : ");
        int n = sc.nextInt();
        double heads=0;
        for(int i=1;i<n;i++) {
            if (Math.random() < 0.5) {
                heads++;
            }
        }
            double percentHeads = heads/10*100;
            double percentTails = (10-heads)/10*100;
            System.out.println("the percentage of heads is: " +percentHeads);
            System.out.println("the percentage of tails is: " +percentTails);

        }
    }

