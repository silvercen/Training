package Searching;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args)
    {
        String[] arr = {"Raj", "Taj", "Abel", "Neeraj", "Dimple"};
        String searchElement = "Neeraj";
        int start=0 , end=arr.length, middle;

        Arrays.sort(arr);

        while(start<=end)
        {
            middle = (end + start)/2;

            if(arr[middle].equals(searchElement))
            {
                System.out.println("The element is at position : " + (middle+1));
                break;
            }

            if(arr[middle].compareTo(searchElement) > 0)
            {
                end = middle-1;
            }
            else
            {
                start = middle+1;
            }
        }
    }
}
