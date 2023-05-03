public class Test {
    int a = 5; //Instance Variable
    static int b = 10; //Static variable
    void m1()
    {
        System.out.println("Instance Method");
    }
    static void m2()
    {
        System.out.println("Static Method");
    }

    Test()
    {
        System.out.println("0-arg constructor");
    }
    Test(int c)
    {
        System.out.println("1-arg constructor");
    }
    {
        System.out.println("Instance Block");
    }
   static
   {
        System.out.println("Static Block");
    }

    public static void main(String[] args)
    {
        Test t = new Test(); //instance block, constructor
        Test t1 = new Test(15); //instance block, constructor
        t.m1(); //m1 Method
        t.m2(); //m2 Method
        System.out.println("Instance Variable : "+t.a); //use object of class to access non-static or instance variable
        System.out.println("Static Variable : "+b);
    }
}
