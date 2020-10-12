import java.util.Scanner;

class Missnum {
    public static void main(String[] args) {
        int j;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[] = new int[a];
        // int arr[]={1,3,5,6,7,9};
        for (j = 1; j <= 5; j++) {
            arr[j] = sc.nextInt();
        }
        System.out.println("array element s is====");
        // for (int i = 1; i < arr.length; i++) {
         int ar1[]=new int [10];
         int ct=1;
         
        for (int i = 0; i <= arr.length - 1; i++) {

            if (arr[i] > ct) {
                ar1[ct]=ct;
                ct++;
                System.out.println(i);
            }else if(arr[i])
        }
        sc.close();

    }
}