public class Practice1 {
    public static void main(String[] args) {
 
        int a = 89;
        int b = 99;
 
        a = a + b; 
        b = a - b; 
        a = a - b; 
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

Output:
a = 99
b = 89