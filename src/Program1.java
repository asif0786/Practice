public class Program1 {

    static{
        System.out.println("It is a static block");
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Numbers in Sequence Order: ");
        for(int i=1;i<=n;i++)
    {
        System.out.print(i+" ");
    }
        System.out.println(" ");
        System.out.println("Numbers in Reverse Order");
        while( n >= 1)
        {
            System.out.print(n+" ");
            n--;
        }
    }

}
