
import java.util.Scanner;

public class pattern {

    public static void main(String[] args) {
        //printPattern1();
        printPattern2();
        // printPattern0();
    }

    //print Square
    public static void printPattern0() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows number");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

    //print Piramid
    public static void printPattern1() {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    //print Piramid
    public static void printPattern2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

}
