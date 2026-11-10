
public class dublicate {

    public static void main(String[] args) {
        largest(new int[]{23, 21, 34, 32, 65, 77});
        smallest(new int[]{23, 22, 45, 11, 66});
        int[] num = {1, 2, 3, 4, 5, 6, 1, 2};

        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] == num[j]) {
                    System.out.println(num[i]);
                }
            }
        }
    }

    static void smallest(int[] arr) {
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println(smallest);
    }

    static void largest(int[] arr) {
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}
