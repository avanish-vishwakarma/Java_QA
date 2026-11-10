
public class palindrom {

    public static void main(String[] args) {
        rev("Avanish");
        String str = "madamm";
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        if (str.equals(rev)) {
            System.err.println("palindrom");
        } else {
            System.out.println("Not palindnrom");
        }
    }

    static void rev(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
    }

}
