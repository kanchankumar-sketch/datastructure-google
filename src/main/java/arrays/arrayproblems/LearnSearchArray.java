package arrays.arrayproblems;
//In computer science, a linear search or sequential search is a method for finding an element within a list.
// It sequentially checks each element of the list until a match is found or the whole list has been searched
public class LearnSearchArray {

    public static int search(int searched,int arr[]){
        int n=-1;
        n=arr.length;
        if (n<=0){
            return -1;
        }
        for (int i = 0; i < n; i++) {
            if(arr[i]==searched){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,5,3,5,5,5,6,6,63,3,66,6,6},n=10,search=63,returnIndex=0;
        returnIndex=search(search,arr);
        if(returnIndex==-1){
            System.out.println("Element not found!");
        }else{
            System.out.println("Element found "+returnIndex+"  value "+arr[returnIndex]);
        }
    }
}
