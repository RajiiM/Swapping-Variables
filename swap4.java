public class Practice1 {
    public static void main(String[] args) {
 
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
 
        // swap a and b first
        a = a + b; // a = 10 + 20; a = 30;
        b = a - b; // b = 30 - 20; b = 10;
        a = a - b; // a = 30 - 10; a = 20;
 
        // swap b and c second
        b = b + c; // b = 10 + 30; b = 40;
        c = b - c; // c = 40 - 30; c = 10;
        b = b - c; // b = 40 - 10; b = 30;
 
        // swap c and d third
        c = c + d; // c = 10 + 40; c = 50;
        d = c - d; // d = 50 - 40; d = 10;
        c = c - d; // c = 50 - 10; c = 40;
 
        System.out.println(" a = " + a);
        System.out.println(" b = " + b);
        System.out.println(" c = " + c);
        System.out.println(" d = " + d);
    }
}

Output:
a = 20
b = 30
c = 40
d = 10