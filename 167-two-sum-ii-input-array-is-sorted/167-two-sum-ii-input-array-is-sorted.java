class Solution {
    public int[] twoSum(int[] numbers, int target) {
        if(numbers == null || numbers.length == 0) return new int[]{};
        // Using 2 pointers because numbers are sorted
        int start=0, end=numbers.length-1;
        while(start<end){
            int sum = numbers[start] + numbers[end];
            if(sum == target) return new int[]{start+1, end+1};
            else if (sum > target) end--;
            else start++;
        }
        return new int[]{};
    }
}