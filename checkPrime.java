
public class checkPrime {

    public static void main(String[] args) {
        System.out.println(checkNum(23));
    }

    static boolean checkNum(int n) {
        boolean isPrime = true;
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i * i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
