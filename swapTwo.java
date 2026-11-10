
public class swapTwo {

    public static void main(String[] args) {
        swap(13, 23);
        swapWith(20, 50);
    }

    static void swap(int a, int b) {
        System.out.println("Before swaping" + a + "," + b);

        int temp = a;
        a = b;
        b = temp;
        System.out.println("After submit" + a + ", " + "" + b);
    }

    static void swapWith(int h, int g) {
        g = h + g;
        h = g - h;
        g = g - h;

        System.out.println("Swaped" + g + " " + h);

        if(h>g){
        g = h + g;
        h = g - h;
        g = g - h;

        System.out.println("Swaped" + g + " " + h);
        }else{
              h=g+h;
              g=h-g;
              h=h-g;

              System.out.println("Swaped" + g + "," +h);
        }
    }
}
