
public class overloading {

    public static void main(String[] args) {
        int sums = sum(2, 3);
        System.out.println(sums);

    }
    //function overloanding means same name but diffrete work that is call function overloading. which are check in compile time and on compile time they tells us which function are going to execute .

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;

    }
}
