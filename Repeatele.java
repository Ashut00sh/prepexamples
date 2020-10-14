import java.util.Scanner;

public class Repeatele {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter min size of array=3");
        a = sc.nextInt();
        int arr[] = new int[a];
        int brr[] = new int[a * arr.length];
        ;
        System.out.println("Enter  3 array element ");
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        int ct = 0;
        for (int j = 0; j < arr.length; j++) {
            // int x = arr[j];
            for (int k = 0; k < arr.length; k++) {

                brr[ct] = arr[k];
                ct++;

            }

        }
        System.out.println("array elements is ==");
        for (int ab : brr) {
            System.out.print(ab + " ,");
        }
        System.out.println();
        sc.close();
    }
}
