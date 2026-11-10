
public class rev {

    public static void main(String[] args) {
        rev(12345);
        System.out.println(isPrime(3));
    }

    static void rev(int num) {
        int rev = 0;
        while (num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
        System.out.println(rev);

    }

    static boolean isPrime(int num) {
        boolean isPrime = true;
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i * i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
