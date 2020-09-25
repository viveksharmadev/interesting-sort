//https://leetcode.com/problems/largest-number/
class Solution {
    // tc -> nlogn, sc-> n
    public String largestNumber(int[] nums) {
        StringBuilder result = new StringBuilder();
        
        if(nums==null || nums.length==0)
            return result.toString();
        
        String[] strNums = new String[nums.length];
        for(int i=0; i<nums.length; i++){
            strNums[i] = String.valueOf(nums[i]);
        }   
        
        Arrays.sort(strNums, (a,b) -> ((b+a).compareTo(a+b)));
        
        if(strNums[0].charAt(0)=='0')
            return "0";
        
        for(String str : strNums){
            result.append(str);
        }
        
        return result.toString();
    }
}
