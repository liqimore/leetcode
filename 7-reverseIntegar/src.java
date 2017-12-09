class Solution {
    public static int reverse(int x) {
        boolean isNeg = false;
        long re = 0;
        if (x < 0){
            isNeg = true;
            x = Math.abs(x);
        }

        //transfor int to char string
        String numsSry = String.valueOf(x);
        char[] nums = numsSry.toCharArray();
        int[] resNum = new int[nums.length];
        //System.out.println(resNum[2]);

        //reverse
        for (int i = nums.length - 1,j = 0; i >= 0; i--, j++){
            if (Character.getNumericValue(nums[i]) == 0){
                continue;
            }
            resNum[j] = Character.getNumericValue(nums[i]);
        }

        //construct answer
        int count = resNum.length -1;
        for (int i = 0; i < resNum.length; i++){

            re = re + resNum[i] * (long)Math.pow(10, count);
            //max out
            if (re > Integer.MAX_VALUE){
                return 0;
            }
            count--;
        }

        // if isNeg true
        if (isNeg == true){
            return -(int)re;
        }
        else {
            return (int)re;
        }
    }
}
