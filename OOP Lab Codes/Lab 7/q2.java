import java.util.Scanner;

class yes {
    public void method(int arr[]) {
        int[] newArr = new int[arr.length];
        int[] newCount = new int[arr.length];
        int d = arr[0];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (d == arr[i]) {
                count += 1;
                newArr[i] = d;
                newCount[i] += 1;
            }
        }
        System.out.println("Duplicated elements\tCounter");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(newArr[i]+"\t"+newCount[i]);
        }
    }
}

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the number of elements: ");
        int num = sc.nextInt();

        int[] arr = new int[num];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter "+(i+1)+" element: ");
            arr[i] = sc.nextInt();
        }

        yes obj = new yes();
        obj.method(arr);


    }
}
