
public class countVowel {

    public static void main(String[] args) {
        countVowel("Avanish");
    }

    static void countVowel(String str) {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = Character.toLowerCase(str.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println(count);

    }
}
