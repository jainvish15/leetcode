package facebook;

public class RemoveDuplicates {

    public int removeDuplicates(int [] nums) {
        if (nums == null) {
            return 0;
        }
        if (nums.length == 0 || nums.length == 1) {
            return nums.length;
        }
        int slow = 0;
        for(int fast = 1; fast < nums.length; ++fast) {
            if (nums[slow] != nums[fast]) {
                slow += 1;
                nums[slow] = nums[fast];
            }
        }
        return slow + 1;
    }
}
