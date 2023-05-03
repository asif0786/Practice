import java.util.Stack;

class stack{
    public static void main(String[] args) {
        Stack st1 = new Stack(); //Default Stack Initialization
        Stack<String> st2 = new Stack<String>(); //Default Stack Initialization Using Generics
        Stack<Integer> st3 = new Stack<Integer>(); //Default Stack Initialization Using Generics


        st1.push(4);
        st1.push("Three");
        st1.push(2);
        st1.push("One");
        st1.push(0);

        st2.push("Four");
        st2.push("Three");
        st2.push("Two");
        st2.push("One");
        st2.push("Zero");

        st3.push(4);
        st3.push(3);
        st3.push(2);
        st3.push(1);
        st3.push(0);

        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        System.out.println(st1.pop());
        System.out.println(st1);
        System.out.println(st2.pop());
        System.out.println(st2);
        System.out.println(st3.pop());
        System.out.println(st3);
    }
}