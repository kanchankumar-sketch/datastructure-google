package arrays.insertion;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertAtPosition {
    public static Integer[] insert(int n, Integer arr[], int x, int pos) {
        int n1 = 0;
        if (pos > n) {
            n1 = pos;
        } else if (pos <= 0) {
            System.out.println("Position Invalid Must be positive.");
            return null;
        } else {
            n1 = n + 1;
        }
        int i;
        Integer newarr[] = new Integer[n1];
        for (int i1 = n - 1; i1 < pos - 1; i1++) {
            newarr[i1] = 0;
        }
        for (i = 0; i < n1; i++) {
            //before of pos index element keep as it is in arr
            if (i < pos - 1) {
                if (n > i) {
                    newarr[i] = arr[i];
                }

                //add value to pos element
            } else if (i == pos - 1) {
                newarr[i] = x;
            } else {
                //and remain are inserted after pos
                if (n >= i) {
                    newarr[i] = arr[i - 1];
                }

            }
        }
        return newarr;
    }


    public static Integer[] insert2(int n, Integer[] arr, int x, int pos) {
        if (pos <= 0) {
            System.out.println("Position Invalid Must be positive.");
            return null;
        }
        ArrayList<Integer> newarr = new ArrayList<>(Arrays.asList(arr));
        for (int i = newarr.size(); i < pos - 1; i++) {
            newarr.add(0);
        }
        newarr.add(pos - 1, x);
        return newarr.toArray(new Integer[0]);
    }


    public static void main(String[] args) {
        //size of array
        int n = 10;
        Integer arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //value to insert
        int x = 50;
        //position where to add value
        int pos = 1;
        System.out.println(Arrays.toString(arr));
        //Method 1
        System.out.println(Arrays.toString(insert(n, arr, x, pos)));
        //Method 2
        System.out.println(Arrays.toString(insert2(n, arr, x, pos)));
    }
}
