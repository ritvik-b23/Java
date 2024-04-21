import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab6 {
    static int SIZE = 10;

    public static void swap(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    int Partition(String[] arr, int l, int h) {
        // PPT ALGORITHM (NOT WORKING):
        
        // String pivot = arr[l];
        // int left = l + 1;
        // int right = h;
        // String temp;

        // while (left <= right) {
        //     while (arr[left].compareTo(pivot) < 0 && left <= h) {
        //         left += 1;
        //     }

        //     while (arr[right].compareTo(pivot) > 0 && l <= right) {
        //         right += 1;
        //     }

        //     if (left < right) {
        //         temp = arr[left];
        //         arr[left] = arr[right];
        //         arr[right] = temp;
        //     }
        //     left += 1;
        // }

        // temp = arr[right];
        // arr[right] = pivot;
        // pivot = arr[right];

        // return right;
        // -------------------------------------------------------------------------------

        // TAKING PIVOT AS THE LAST ELEMENT (WORKING):

        // String pivot = arr[h];
        // int i = l-1;
        // String temp;

        // for (int j = l; j < h; j++) {
        //     if (arr[j].compareTo(pivot) <= 0) {
        //         i++;
                
        //         temp = arr[i];
        //         arr[i] = arr[j];
        //         arr[j] = temp;
        //     }
        // }
        
        // temp = arr[i+1];
        // arr[i+1] = arr[h];
        // arr[h] = temp;
        
        // return i+1;
        // -------------------------------------------------------------------------------

        // TAKING PIVOT AS THE 1ST ELEMENT (WORKING):

        String pivot = arr[l];
        int k = h;

        for (int i = h; i > l; i--) {
            if (arr[i].compareTo(pivot) > 0) {
                swap(arr, i, k--);
            }
        }

        swap(arr, l, k);
        return k;
    }
    
    void quickSort(String[] arr, int l, int h) {
        if (l < h) {
            int pivot = Partition(arr, l, h);
            quickSort(arr, l, pivot-1);
            quickSort(arr, pivot+1, h);
        }
    }
    
    static void  printArr(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("\t" + arr[i]);
        }
        System.out.println();
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("\t\t  Quick Sort Program");
        System.out.println("-----------------------------------------------------");

        String[] arr = new String[SIZE];
        int i=0;
                        
        
        File inputFile = new File("info.txt");
        Scanner sc = new Scanner(inputFile);
        
        while (sc.hasNextLine()) {
            String data = sc.nextLine();
            arr[i] = data;
            i++;
        }

        sc.close();


        System.out.println("Input array:\n");
        printArr(arr); 
        System.out.println();


        Lab6 ob = new Lab6();
        long startTime = System.nanoTime();
        ob.quickSort(arr, 0, 9);
        long endTime = System.nanoTime();

        System.out.println("Sorted array:\n");
        printArr(arr);
        
        System.out.println("Time taken: " + (int)((endTime - startTime)/1000000) + " milliseconds");
        System.out.println("\t    " + (int)((endTime - startTime)*0.001) + " microseconds");
    }
}
