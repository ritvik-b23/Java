public class Lab5{
    void merge(String[] arr, int l, int r, int m) {
        int n1 = m - l + 1;
        int n2 = r - m;

        String left[] = new String[n1];       // creating two temp arrays
        String right[] = new String[n2];

        for (int i = 0; i < n1; i++)    // storing the data in the temp arrays
            left[i] = arr[l + i];
        for (int j = 0; j < n2; j++)
            right[j] = arr[m + 1 + j];

        // Merging:

        int i = 0, j = 0;               // initial index of the sub arrays

        int k = l;                      // initial index of the merged array
        while (i < n1 && j < n2) {
            if (left[i].compareTo(right[j]) <= 0) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < n1) {                // store remaining elements of left[] if any
            arr[k] = left[i];
            i++;
            k++;
        }

        while (j < n2) {                // store remaining elements of right[] if any
            arr[k] = right[j];
            j++;
            k++;
        }

    }

    void sort(String[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r)/2;          // getting the middle element index of the array

            sort(arr, l, m);            // spliting the left half of the array recursively
            sort(arr, m + 1, r);        // spliting the right half of the array recursively

            merge(arr, l, r, m);        // merging the arrays
        }
    }

    static void printArr(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("\t"+arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("\t\t  Merge Sort Program");
        System.out.println("-----------------------------------------------------");

        String[] arr = {"aaa 202205B 2024 8",
                        "aaa 202204B 2024 7",
                        "hhh 202208B 2024 9",
                        "ccc 202203B 2024 8",
                        "iii 202209B 2024 7",
                        "jjj 202210B 2024 6",
                        "eee 202205B 2024 9",
                        "ggg 202207B 2024 7",
                        "fff 202206B 2024 9",
                        "bbb 202202B 2024 8"};
                        
        System.out.println("Input array:\n");
        printArr(arr); 
        System.out.println();
        
        Lab5 ob = new Lab5();

        long startTime = System.nanoTime();
        ob.sort(arr, 0, 9);
        long endTime = System.nanoTime();
        
        System.out.println("Sorted array:\n");
        printArr(arr);
        // System.out.println(startTime);
        // System.out.println(endTime);
        System.out.println("Time taken: " + (int)((endTime - startTime)/1000000) + " milliseconds");
        System.out.println("\t    " + (int)((endTime - startTime)*0.001) + " microseconds");
        // System.out.println("Time taken: " + ((endTime - startTime)*0.001) + " microseconds");
    }
}