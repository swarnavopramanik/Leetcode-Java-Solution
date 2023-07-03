 153. Find Minimum in Rotated Sorted Array


   class Solution {
   public int findMin(int[] nums) {
	int s = 0; 
    int e = nums.length -1;
	while(s < e){
		int m= s+ (e - s)/2;
		if(nums[m]>nums[e]) s = m+1;
		else e = m; // (nums[m] <= nums[e])
	}
	return nums[s];
 }
}
