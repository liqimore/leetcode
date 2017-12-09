class Solution {
    public static boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        }
        //System.out.println(x);
        //transfor int to char string
        char[] nums = String.valueOf(x).toCharArray();
        if (nums.length == 1){
            return true;
        }
        if (nums.length == 2){
            return nums[0] == nums[1];
        }

        int mid1 = 0,mid2 = 0;
        if (nums.length % 2 == 0){
            mid1 = nums.length/2;
        }
        else if(nums.length % 2 != 0) {
            mid2 = nums.length/2 + 1;
        }
        //System.out.println(mid2);
        int midtemp1 = mid1 - 1;
        int midtemp2 = mid2 - 2;
        //System.out.println(midtemp2);
        for (int i = 0; i < nums.length; i++){
            if (nums.length % 2 == 0){
                //System.out.println(nums[++mid1]);
                if (nums[midtemp1] == nums[mid1]){
                    //System.out.println(nums[mid1]);
                    midtemp1--;
                    mid1++;
                    if (midtemp1 < 0){
                        return true;
                    }
                    continue;
                }
            }

            if (nums.length % 2 != 0){
                //System.out.println("-------------");
                //System.out.println("midtemp2 "+ nums[midtemp2]);
                //System.out.println("mid2 "+ nums[++mid2]);
                //System.out.println(mid2);
                //mid2++;
                if (midtemp2 < 0){
                    return true;
                }
                if (nums[midtemp2] == nums[mid2]){

                    midtemp2--;
                    continue;
                }
            }
        }
        return false;
    }
}
