
public class leapyaear {

    public static void main(String[] args) {
        leapyaear(2035);

    }

    static void leapyaear(int num) {
        if (num % 400 == 0 || num % 4 == 0 && num % 100 != 0) {
            System.out.println(" This is leap year " + num);
        } else {
            System.out.println(" This is not leap year " + num);
        }
    }
}
