import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Scanner;

public class secondSmallest {
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length of array : ");
        int n = sc.nextInt();
        int arr[] = new int [n];
        for (int i = 0; i<n; i++){
            System.out.print("Enter a number : ");
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
       // System.out.println("Sorted Array is: "+arr);
        System.out.println("Largest element is "+arr[n-1]);
        System.out.println("Second Largest element is "+arr[n-2]);
        //System.out.println("Middle element is "+arr[n/2]);
        System.out.println("Smallest element is "+arr[0]);
        System.out.println("second smallest element is "+arr[1]);

    }
}
