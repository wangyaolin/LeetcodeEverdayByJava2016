package FirstAttempt;

public class RemoveElement {

	public int removeElement(int[] nums, int val) {
        if(nums == null && nums.length == 0) return 0;
        
        int p = 0;
        int q = nums.length-1;
        
        while(p <= q) {   //////////// REMEMBER, must be <= !!!, otherwise removeElement([1], 1) will return 1 instead of 0 !!!
        	if(nums[p] == val) {
        		nums[p] = nums[q];
        		q--;  ////////// p doesn't move, because the new nums[p] needs to be checked too
        	}
        	else {
        		p++;
        	}
        }
        return q+1;
    }
}
