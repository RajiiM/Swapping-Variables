public class Practice1 {
    public static void main(String[] args) {
 
        int a = 5;
        int b = 9;
        int c = 0;
 
        c = a;
        a = b;
        b = c;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

Output
a = 9
b = 5