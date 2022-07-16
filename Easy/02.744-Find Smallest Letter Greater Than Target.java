class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
       int start = 0;
        int end = letters.length-1;

        // if tar is greater that the greatest num in array
        if(target > letters[end]){
            return letters[start] ;
        }

        while(start <= end){ //0 <=2
            int mid = start + ((end-start)/2); // mid = 0 + 1 = 1

            if(target < letters[mid]){ //c < f
                end = mid -1;
            }else {
                start = mid +1;
            }
        }
        return letters[start % letters.length];

    }
}
