package exx3;

public class test {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;

        System.out.println("A = " + a);
        System.out.println("B = " + b);

        a ^= b;
        b ^= a;
        a ^= b;

        System.out.println("A = " + a);
        System.out.println("B = " + b);

    }
}
