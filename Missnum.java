import java.util.Scanner;

class Missnum {
    public static void main(String[] args) {
        int j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int a = sc.nextInt();
        int arr[] = new int[a];
        // int arr[]={1,3,5,6,7,9};
        System.out.println("Enter array elements");
        for (j = 1; j <= 5; j++) {
            arr[j] = sc.nextInt();
        }
        System.out.println("array element s is====");

        for (int i = 1; i <= 10; i++) {
            boolean flag = false;
            for (int k = 0; k < arr.length; k++) {

                if (i == arr[k]) {
                    flag = true;
                }
            }
            if (flag == false) {
                System.out.print(" ," + i);
            }
        }
        System.out.println();
        sc.close();
    }

}