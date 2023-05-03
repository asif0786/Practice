import java.util.Scanner;
public class NoOfLeapYears {
    public static void main(String[] args){
//    ===================Wrong Approach==================
//        int x = 2000;
//        int y = 2010;
//        int sub = y - x;
//        System.out.println("No.of leap year = "+sub/4); 2010-200-=10/4=2  which should be 3
//    =====================================================

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Starting Year : ");
    int startYear = sc.nextInt();
    System.out.print("Enter Ending Year : ");
    int endYear = sc.nextInt();
    int leap = 0;

    for(int i=startYear;i<=endYear;i++)
    {
        if(i%4==0)
        {
            leap++;
        }
    }
    System.out.println("Number of leap years = "+leap);
    }
}
