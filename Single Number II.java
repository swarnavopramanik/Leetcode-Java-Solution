137. Single Number II


  class Solution {
   public int singleNumber(int[] nums) {
    int ans = 0;
    for(int i = 0; i < 32; i++) {
        int sum = 0;
        for(int j = 0; j < nums.length; j++) {
            if(((nums[j] >> i) & 1) == 1) // for check bit is 1 
                sum++;
        }
        sum %= 3;
        
        if(sum != 0) {
            ans |= sum << i;
        }
    }
    return ans;
  }
}


/* class Solution {
    public int singleNumber(int[] nums) {
        int ones = 0;
        int twos = 0;


        for (int num : nums) {
            ones = (ones ^ num ) & ~twos;
            twos = ( twos ^ num ) & ~ones;
        }

        return ones;
    }
} */
