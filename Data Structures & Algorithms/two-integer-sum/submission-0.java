class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> uniqueValues = new HashMap<>();
        uniqueValues.put(nums[0], 0);
        for(int i =1; i<nums.length; i++){
            if(uniqueValues.get(target - nums[i])!= null){
                return new int[]{uniqueValues.get(target - nums[i]), i };
            }
            if(uniqueValues.get(nums[i]) == null){
                uniqueValues.put(nums[i], i);
            }
        }
        return null;
    }
}
