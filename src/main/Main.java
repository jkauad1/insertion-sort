package main;

import static classes.InsertionSort.insertionSort;

public class Main {
    public static void main(String[] args) {

        int[] arrays = {3, 5, 2, 10, 7, 7, 10 , 8, 4};

        insertionSort(arrays);
        
        for (int array : arrays) {
            System.out.print(array + ", ");
        }
    }
}