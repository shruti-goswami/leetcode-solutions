class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int maxNumOfOnes = 0, countOfConsecutiveOnes = 0;
        for ( int value : nums ){
            if( value == 1) {
                countOfConsecutiveOnes++;
                if( maxNumOfOnes < countOfConsecutiveOnes){
                    maxNumOfOnes = countOfConsecutiveOnes;
                }
            } else {
                countOfConsecutiveOnes = 0;
            }  
        }
        //System.out.println(maxNumOfOnes);
        return maxNumOfOnes;
    }
}