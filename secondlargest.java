
public class secondlargest {

    public static void main(String[] args) {

        secondlargest(new int[]{12, 34, 34, 21, 1212, 21});

    }

    static void secondlargest(int[] num) {

        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++) {

            if (num[i] > largest) {

                secondlargest = largest;
                largest = num[i];

            } else if (num[i] > secondlargest && num[i] != largest) {

                secondlargest = num[i];

            }

        }

        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + secondlargest);

    }
}
