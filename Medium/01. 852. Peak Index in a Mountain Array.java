package com.company;

public class PeakIndexInMountainArray {

    //bitonic array
    //is an arrays whose elements increases first and then decreases
    // example- {1,2,3,5,7,6,3,2}
    public static void main(String[] args) {
        int[] arr = {0,1,0};
        peakIndexInMountainArray(arr);
    }

    static int peakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length -1;

        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid+1]){
                //you are in the decreasing part of the array
                //this may be the ans, but look at the left
                //this is why end!= mid - 1
                end = mid;
            }else {
                //you are in ascending part of the array
                start = mid + 1; //because we know that mid+1 > mid element
            }
        }
        // start == end and pointing to the largest num because of the two checks above
        // start and end are trying to find max element
        //hence, when they are pointing to just one element, that is the max element
       return start; //you can also return end {both are equal}
    }

}
