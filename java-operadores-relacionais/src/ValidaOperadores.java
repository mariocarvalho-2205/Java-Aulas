
public class ValidaOperadores {
    
    public static void main(String[] args) {
        int i1 = 10;
        int i2 = 20;
        float f1 = 4.5f;
        float f2 = 3.5f;
        char c1 = 'x';
        char c2 = 'y';
        String s1 = "Fulano";
        String s2 = "Fulano";
        String s3 = "Ciclano";
        boolean b1 = true;
        boolean b2 = false;
        double d1 = 59.6d;

        long l1 = 1597l;
        long l2 = 8997l;
        byte y1= 1;
        short h1 = 25;

        System.out.println("i1 == i2 " + (i1 == i2));
        System.out.println("i1 != i2 " + (i1 != i2));
        System.out.println("i1 > i2 " + (i1 > i2));
        System.out.println("i1 <= i2 " + (i1 <= i2));
        System.out.println("s1 == s2 " + (s1 == s2));
        System.out.println("s1 != s3 " + (s1 != s3));
        System.out.println("l1 != l2 " + (i1 != i2));
    }
}
