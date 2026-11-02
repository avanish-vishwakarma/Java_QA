
import java.util.Scanner;

public class count {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int count = 0;

        while (number > 0) {
            int rem = number % 10;
            if (rem == 1) {
                count++;
            }
            number = number / 10;
        }
        System.out.println("Number of digits in the number is: " + count);
    }
}
