
public class swap {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before swap" + a + " ," + b);

        b = a + b;//30
        b = b - a;//20
        a = b - a;//10
        System.out.println(a);
        System.out.println(b);
    }
}
