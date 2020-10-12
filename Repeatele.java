import java.util.Scanner;

public class Repeatele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[] = new int[a];
        int brr[] = new int[a];
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }
        for (int j = 0; j < arr.length - 1; j++) {
            // int x = arr[j];
            for (int k = 0; k < 3; k++) {
                brr[k] = arr[j];
            }
        }
        System.out.println(brr);
        sc.close();
    }
}
