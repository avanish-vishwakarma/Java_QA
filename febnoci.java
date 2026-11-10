
public class febnoci {

    public static void main(String[] args) {
        int n = 8;
        int a = 0;
        int b = 1;

        for (int i = 2; i <= n; i++) {
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println(a);

    }
}
