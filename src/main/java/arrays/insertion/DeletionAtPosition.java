package arrays.insertion;

import java.util.Arrays;

public class DeletionAtPosition {
    public static void deleteAtIndex(int index,int arr[],int n) throws IllegalArgumentException {
        if(index<0 || index>n){
            throw new IllegalArgumentException("Invalid index  "+index+"  out of bound.");
        }
        int newarr[]=new int[n-1];
        for(int i=0,j=0;i<arr.length && j< newarr.length;i++,j++){

            newarr[j]=arr[i];
           if(i==index){
                j--;
            }
        }
        System.out.println(Arrays.toString(newarr));
    }

    public static void deleteByValue(int value,int arr[],int n) throws Exception {
        int index = -1;
        for (int i = 0; i < n; i++) {
            if(arr[i]==value){
                index = i;
                break;
            }
        }
       if(index == -1){
           throw new Exception("Invalid value "+value);
       }
       deleteAtIndex(index,arr,n);

    }

    public static void main(String[] args) throws Exception {

        int arr[]=new int[]{1,2,3,4,5,6,7};
        int n=7;
        int i=1;
        //deleteAtIndex(i,arr,n);
        deleteByValue(i,arr,n);
    }
}
