package arrays;

import java.util.Iterator;

public class DynamicArray<T> implements Iterable<T>{


    private T[] arr;
    private int len;
    private int capacity;

    public DynamicArray(){
        this(16);
    }

    public DynamicArray(int capacity) {
        if (capacity <0) throw new IllegalArgumentException("Illegal Capacity: "+capacity);
        this.capacity = capacity;
        arr= (T[]) new Object[capacity];
    }

    public int size() {
        return len;
    }

    public boolean isEmpty() {
        return size()==0;
    }

    public T get(int index){
        return arr[index];
    }

    public void set(int index, T value){
        arr[index]=value;
    }

    public void clear() {
        for(int i=0; i<capacity; i++){
            arr[i]=null;
            len=0;
        }
    }

    public void add(T value){
        if(len+1>=capacity){
            if(capacity==0) capacity=1;
            else capacity*=2;
            T[] arr_new = (T[]) new Object[capacity];
            for (int i=0;i<arr.length;i++){
                arr_new[i]=arr[i];
            }
            arr=arr_new;
        }
        arr[len++]=value;
    }

    public T removeAt(int index){
        if(index<0 && index>=len) throw new IndexOutOfBoundsException();
        T data=arr[index];
        T[] arr_new= (T[]) new Object[len-1];
        for (int i=0,j=0; i<len;i++,j++){
            if(i==index) j--;
            else arr_new[j]=arr[i];
        }
        arr=arr_new;
        capacity=--len;
        return data;
    }


    public boolean remove(Object obj){
        for (int i=0;i<len;i++){
            if(arr[i].equals(obj)){
                removeAt(i);
                return true;
            }
        }
        return false;
    }

    public int indexOf(Object obj){
        for (int i=0;i<len;i++){
            if(arr[i].equals(obj)){
                return i;
            }
        }
        return -1;
    }

    public boolean contains(Object obj){
        return indexOf(obj)!=-1;
    }

    @Override
    public Iterator<T> iterator() {
        return  new Iterator<T>() {
            public boolean hasNext() {
                return false;
            }

            public T next() {
                return null;
            }
        };
    }
}
