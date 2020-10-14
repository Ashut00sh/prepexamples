import java.util.Scanner;

class Missnum {
    public static void main(String[] args) {
        int j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int a = sc.nextInt();
        int arr[] = new int[a];
        // int arr[]={1,3,5,6,7,9};
        System.out.println("Enter how many array elements want to enter out of" + arr.length);
        int b = sc.nextInt();
        System.out.println("Enter" + " " + b + " " + "elements into array");
        for (j = 0; j < b; j++) {
            arr[j] = sc.nextInt();
        }
        System.out.println("Misssing array elements is====");

        for (int i = 1; i <= a; i++) {
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