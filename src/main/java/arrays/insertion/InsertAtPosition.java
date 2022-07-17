package arrays.insertion;

import java.util.Arrays;

public class InsertAtPosition {
    public static int[] insert(int n,int arr[],int x,int pos){
        int n1=0;
        if(pos>n){
            n1=pos;
        }else{
            n1=n+1;
        }
        int i;
        int newarr[] = new int[n1];
        for (i=0;i<n1;i++){
            //before of pos index element keep as it is in arr
            if(i<pos-1){
                if(n>i){
                    newarr[i] = arr[i];
                }

                //add value to pos element
            }else if(i==pos-1){
                newarr[i] = x;
            }else{
                //and remain are inserted after pos
                if(n>=i){
                    newarr[i] = arr[i-1];
                }

            }
        }
        return newarr;
    }

    public static void main(String[] args) {
        //size of array
        int n=10;
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        //value to insert
        int x=50;
        //position where to add value
        int pos=10;
        System.out.println(Arrays.toString(arr));
        arr=insert(n,arr,x,pos);
        System.out.println(Arrays.toString(arr));
    }
}
