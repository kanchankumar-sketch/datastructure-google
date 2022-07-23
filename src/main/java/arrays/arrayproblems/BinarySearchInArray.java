package arrays.arrayproblems;

import java.util.Arrays;
import java.util.List;

/*
In computer science, binary search, also known as half-interval search, logarithmic search, or binary chop, is a search
algorithm that finds the position of a target value within a sorted array. Binary search compares the target value to
the middle element of the array
 */
public class BinarySearchInArray {
    public static int binarySearch(int searched,int arr[]){
        int n=0;
        n=arr.length;
        if(n<=0){
            return -1;
        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int first=0,last=n-1,middle=(last+first)/2;
        while(first<last){
            if(arr[middle]<searched){
                first=middle+1;
            }else if(arr[middle]==searched){
                return middle;
            }else {
                first=middle-1;
            }
            middle=(first+last)/2;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]=new int[]{1,20,36,546,9,141,352,4655,3,5546,555},n,search=141;

        int x = binarySearch(search,arr);
        System.out.println(x);
    }
}
