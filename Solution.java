class Solution {
    public int longestOnes(int[] nums, int k) {
        int i = 0;
        int j = 0;
        int zeroes = 0;
        int out = 0;

        while(j < nums.length){
            if(nums[j]==0){
                if(zeroes < k){
                    zeroes++;
                }else{
                    out = Math.max(out,j-i);

                    while(i < j && zeroes==k){
                        if(nums[i]==0){
                            zeroes--;
                        }
                        i++;
                    }
                    if(zeroes < k){
                        zeroes++;
                    }
                }
            }
            if (i==j && nums[j]==0 && k==0){
                i++;
            }
            j++;
        }
        out = Math.max(out, j-i);
        return out;
    }
}
