
public class arrayPractice {

    public static void main(String[] args) {
        System.out.println(array(new int[]{23, 43, 56, 12}));
    }

    public static int array(int num[]) {

        int max = num[0];

        for (int i = 1; i < num.length; i++) {

            if (num[i] > max) {
                max = num[i];
            }
        }
        return max;
    }

}
