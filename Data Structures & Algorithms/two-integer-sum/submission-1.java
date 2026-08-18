class Solution {
    public int[] twoSum(int[] nums, int target) {
        //int left = 0;
        //int right = nums.length - 1;
        int diff;
        int[] ans = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], i);
            }

            diff = target - nums[i];

            if(map.containsKey(diff)){
                ans[0] = map.get(diff);
                ans[1] = i;
            }
        }
        return ans;
    }
}
