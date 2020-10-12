import java.util.ArrayList;
import java.util.Scanner;

public class Repeatnum {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();

        arr.add(1);
        arr.add(2);
        arr.add(3);

        System.out.println(arr);

        ArrayList<Integer> brr = new ArrayList<Integer>();
        for (int i = 0; i < arr.size(); i++) {
            int x = arr.get(i);
            for (int j = 0; j < 3; j++) {
                brr.add(x);
            }
        }

        System.out.println(brr);
    }
}
