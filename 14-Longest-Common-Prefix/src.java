class Solution {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0){
            return "";
        }
        String shortStr = "";
        //find the shortest one
        Arrays.sort(strs);
        if (strs.length == 1){
            return strs[0];
        }
        if (strs[strs.length - 1].length() == 1){
            for (int i = 0; i < strs.length - 1; i++){
                if (!strs[i].equals(strs[i+1])){
                    return "";
                }
            }
            return strs[0];
        }
        for (int i = 0; i < strs[0].length(); i++){
            if (strs[0].charAt(i) == strs[strs.length - 1].charAt(i)){
                shortStr = shortStr + strs[0].charAt(i);
            }
            else
                break;
        }
        return shortStr;
    }
}
