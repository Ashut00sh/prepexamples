import java.util.Scanner;

public class Repeatele {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter min size of array=3");
        a = sc.nextInt();
        int arr[] = new int[a];
        int brr[] = new int[a * arr.length];
        // int brr[] = new int[a];
        System.out.println("Enter  3 array element ");
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        // System.out.println(arr.length);
        for (int j = 0; j < arr.length; j++) {
            // int x = arr[j];
            for (int k = 0; k < arr.length; k++) {

                brr[j] = arr[k];

            }

        }
        System.out.println("array elements is ==");
        for (int ab : brr) {
            System.out.println(ab);
        }
        sc.close();
    }
}
